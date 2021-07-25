package com.template.sample.service

import com.template.adapter.SampleClient
import com.template.sample.dto.SampleRequestDto
import com.template.sample.dto.SampleResponseDto
import org.springframework.stereotype.Service

@Service
class SampleFeignService(
    private val sampleClient: SampleClient
) {
    fun sendApiToServer(dto: SampleRequestDto): SampleResponseDto {
        return sampleClient.makeApiCall(dto)
    }
}