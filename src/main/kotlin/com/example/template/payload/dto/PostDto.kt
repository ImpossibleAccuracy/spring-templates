package com.example.template.payload.dto

import com.example.template.utils.DTO

@DTO
class PostDto(
    val id: Long,
    val title: String,
    val authorUsername: String,
    val rating: Int
)
