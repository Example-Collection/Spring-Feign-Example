package com.template.config

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.openfeign.FeignClientsConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@EnableFeignClients(basePackages = ["com.template"])
@Import(FeignClientsConfiguration::class)
open class FeignConfig {
    @Bean
    open fun feignLoggerLevel(): feign.Logger.Level {
        return feign.Logger.Level.FULL
    }
}