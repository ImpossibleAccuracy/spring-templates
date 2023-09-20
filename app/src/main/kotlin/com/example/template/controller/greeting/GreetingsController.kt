package com.example.template.controller.greeting

import com.example.template.controller.greeting.payload.GreetingsResponse
import com.example.template.service.greeting.GreetingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greetings")
class GreetingsController(
    private val greetingService: GreetingService
) {
    @GetMapping
    fun getGreetings(@RequestParam("name") name: String): ResponseEntity<GreetingsResponse> =
        greetingService.getGreeting(name).let {
            val data = GreetingsResponse(it)

            ResponseEntity.ok(data)
        }
}