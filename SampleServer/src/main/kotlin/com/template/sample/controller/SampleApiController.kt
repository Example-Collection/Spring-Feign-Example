package com.template.sample.controller

import com.template.sample.dto.SampleRequestDto
import com.template.sample.dto.SampleResponseDto
import com.template.sample.service.SampleService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleApiController(
    private val sampleService: SampleService
) {

    @PostMapping("/v1/sample")
    fun process(@RequestBody dto: SampleRequestDto): SampleResponseDto {
        return sampleService.process(dto)
    }
}