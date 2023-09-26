package com.rebrainme.store.entity

import com.rebrainme.store.model.Product
import jakarta.persistence.*


@Entity
@Table(name = "product")
class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String,
    val description: String,
    val cost: Double
)

fun Product.toEntity(): ProductEntity =
    ProductEntity(
        id = null,
        name = this.name,
        description = this.details.description,
        cost = this.details.cost
    )

