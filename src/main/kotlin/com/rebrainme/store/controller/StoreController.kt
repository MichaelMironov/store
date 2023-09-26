package com.rebrainme.store.controller

import com.rebrainme.store.model.Product
import com.rebrainme.store.service.ProductService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/products")
class StoreController(
    private val productService: ProductService
) {

    @GetMapping
    fun getProducts(): List<Product> = productService.getAll()

    @PostMapping
    fun updateProduct(@RequestBody product: Product) {
        productService.addProduct(product)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id: Long) {
        productService.deleteProduct(id)
    }

}