package br.com.emanuel3k.model

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
data class Product (
    val id: Long,
    val name: String,
    val price: Double
)