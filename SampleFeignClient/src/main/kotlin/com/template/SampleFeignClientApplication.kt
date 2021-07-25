package com.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
open class SampleFeignClientApplication

fun main(args: Array<String>) {
    runApplication<SampleFeignClientApplication>(*args)
}