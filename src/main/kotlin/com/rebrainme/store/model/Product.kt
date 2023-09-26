package com.rebrainme.store.model

import com.rebrainme.store.entity.ProductEntity

data class Product(
    val id: Long?,
    val name: String,
    val details: Details,
)

data class Details(
    val description: String,
    val cost: Double
)

fun ProductEntity.toJson(): Product =
    Product(
        id = this.id,
        name = this.name,
        details = Details(
            this.description,
            this.cost
        )
    )