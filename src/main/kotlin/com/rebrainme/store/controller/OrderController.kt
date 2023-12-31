package com.rebrainme.store.controller

import com.rebrainme.store.model.Product
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController {

    @PostMapping
    fun addProduct(@RequestBody product: Product) {

    }

    @DeleteMapping("/{id}")
    fun removeProduct(@PathVariable id: Long) {

    }
}