package com.softeam.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@EnableZuulProxy
@SpringBootApplication
open class GatewayApplication : WebMvcConfigurerAdapter()

fun main(args: Array<String>) {
    SpringApplication.run(GatewayApplication::class.java, *args)
}