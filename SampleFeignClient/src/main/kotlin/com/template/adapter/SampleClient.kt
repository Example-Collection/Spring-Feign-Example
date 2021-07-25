package com.template.adapter

import com.template.config.FeignConfig
import com.template.sample.dto.SampleRequestDto
import com.template.sample.dto.SampleResponseDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "sampleServer", configuration = [FeignConfig::class], url = "http://localhost:8082")
interface SampleClient {
    @PostMapping("/v1/sample")
    fun makeApiCall(@RequestBody dto: SampleRequestDto): SampleResponseDto
}