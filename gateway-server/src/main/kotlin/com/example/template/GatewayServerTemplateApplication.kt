package com.example.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class DiscoveryServerTemplateApplication

fun main(args: Array<String>) {
    runApplication<DiscoveryServerTemplateApplication>(*args)
}
