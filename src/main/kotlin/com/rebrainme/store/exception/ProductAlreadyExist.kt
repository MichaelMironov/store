package com.rebrainme.store.exception

import org.springframework.http.HttpStatus

class ProductAlreadyExist(name: String): BaseException(
    HttpStatus.NOT_FOUND,
    ApiError(
        code = 409,
        description = "Product $name already exist",
    )
) {
}