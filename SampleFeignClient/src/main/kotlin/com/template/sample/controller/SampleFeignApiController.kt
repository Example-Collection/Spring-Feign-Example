package com.template.sample.controller

import com.template.sample.dto.SampleRequestDto
import com.template.sample.dto.SampleResponseDto
import com.template.sample.service.SampleFeignService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleFeignApiController(
    private val sampleFeignService: SampleFeignService
) {
    @PostMapping("/v1/send-feign-api-call")
    fun makeApiCall(@RequestBody dto: SampleRequestDto): SampleResponseDto {
        return sampleFeignService.sendApiToServer(dto)
    }
}