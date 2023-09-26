package com.rebrainme.store.service

import com.rebrainme.store.entity.ProductEntity
import com.rebrainme.store.entity.toEntity
import com.rebrainme.store.exception.ProductAlreadyExist
import com.rebrainme.store.exception.ProductNotFound
import com.rebrainme.store.model.Product
import com.rebrainme.store.model.toJson
import com.rebrainme.store.repository.ProductRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service


@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    fun getAll(): List<Product> = productRepository.findAll().map { it.toJson() }

    fun addProduct(product: Product) {
        productRepository.findByName(product.name)?.let { throw ProductAlreadyExist(product.name) }
            ?: productRepository.save(product.toEntity())
    }

    fun deleteProduct(id: Long) {
        val existProduct: ProductEntity = productRepository.findByIdOrNull(id)
            ?: throw ProductNotFound(id)

        productRepository.deleteById(existProduct.id!!)
    }

}
