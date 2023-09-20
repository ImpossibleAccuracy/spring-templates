package com.example.template.controller.post

import com.example.template.payload.dto.PostDto
import com.example.template.service.post.PostService
import org.modelmapper.ModelMapper
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/post")
class PostController(
    private val postService: PostService,
    private val modelMapper: ModelMapper
) {
    @GetMapping("/list")
    fun listAllPosts(): ResponseEntity<List<PostDto>> =
        postService.getAllPosts().let { data ->
            val response = data.map {
                modelMapper.map(it, PostDto::class.java)
            }

            ResponseEntity.ok(response)
        }
}