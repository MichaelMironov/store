package com.rebrainme.store.exception

import org.springframework.http.HttpStatus

open class BaseException(
    val httpStatus: HttpStatus,
    val apiError: ApiError,
) : RuntimeException(apiError.description)