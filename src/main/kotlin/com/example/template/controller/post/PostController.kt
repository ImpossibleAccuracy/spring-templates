package com.example.template.controller.post

import com.example.template.data.model.Post
import com.example.template.service.post.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/post")
class PostController(
    private val postService: PostService
) {
    @GetMapping("/list")
    fun listAllPosts(): ResponseEntity<List<Post>> =
        postService.getAllPosts().let {
            ResponseEntity.ok(it)
        }
}