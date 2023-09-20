package com.example.template.service.post

import com.example.template.data.model.Post
import com.example.template.data.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(
    private val postRepository: PostRepository
) : PostService {
    override fun getAllPosts(): List<Post> =
        postRepository.findAll()
}