package com.template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SampleServerApplication

fun main(args: Array<String>) {
    runApplication<SampleServerApplication>(*args)
}