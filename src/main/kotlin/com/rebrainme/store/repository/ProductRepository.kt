package com.rebrainme.store.repository

import com.rebrainme.store.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository


interface ProductRepository : JpaRepository<ProductEntity, Long> {
    fun findByName(name: String): ProductEntity?
}