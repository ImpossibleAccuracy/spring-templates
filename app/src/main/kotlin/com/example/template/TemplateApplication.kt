package com.example.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.security.jwt"])
class TemplateApplication

fun main(args: Array<String>) {
    runApplication<TemplateApplication>(*args)
}
