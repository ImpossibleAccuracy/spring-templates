package com.example.template.service.post

import com.example.template.data.model.Post

interface PostService {
    fun getAllPosts(): List<Post>
}