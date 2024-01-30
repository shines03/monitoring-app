package com.example.monitor.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping( "/greet/{name}")
    fun greeting(@PathVariable name: String): String{
        return "Hello $name"
    }
}
