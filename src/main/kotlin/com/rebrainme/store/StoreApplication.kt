package com.rebrainme.store

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.extensions.Extension
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition(
    info = Info(
        title = "Product store",
        description = "Simple product store",
        termsOfService = "Open Source",
        contact = Contact(name = "Mike Mir", url = "mike@gmail.com"),
        license = License(name = "license"),
        version = "0.0.1"
    )
)
@SpringBootApplication
class StoreApplication

fun main(args: Array<String>) {
    runApplication<StoreApplication>(*args)
}
