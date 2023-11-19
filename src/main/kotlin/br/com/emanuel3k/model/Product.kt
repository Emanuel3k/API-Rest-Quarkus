package br.com.emanuel3k.model

import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.inject.Any

@ApplicationScoped
data class Product (
    @Any
    val id: Long,
    @Any
    val name: String,
    @Any
    val price: Double
)