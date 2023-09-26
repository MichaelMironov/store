package com.rebrainme.store.exception

import org.springframework.http.HttpStatus

class ProductNotFound(productId: Long) : BaseException(
    HttpStatus.NOT_FOUND,
    ApiError(
        code = 404,
        description = "Product with id = $productId not found",
    )
)