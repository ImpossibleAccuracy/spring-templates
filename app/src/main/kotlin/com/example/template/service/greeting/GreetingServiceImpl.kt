package com.example.template.service.greeting

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {
    override fun getGreeting(name: String): String =
        "Hello, name"
}