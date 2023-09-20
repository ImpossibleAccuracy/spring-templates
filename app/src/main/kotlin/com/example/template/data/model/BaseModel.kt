package com.example.template.data.model

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.io.Serializable

@MappedSuperclass
abstract class BaseModel<T : Serializable>(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val _id: T?
) {
    val id: T
        get() = _id!!
}