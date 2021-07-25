package com.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SampleFeignClientApplication

fun main(args: Array<String>) {
    runApplication<SampleFeignClientApplication>(*args)
}