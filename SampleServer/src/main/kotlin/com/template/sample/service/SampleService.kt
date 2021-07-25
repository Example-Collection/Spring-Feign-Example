package com.template.sample.service

import com.template.sample.dto.SampleRequestDto
import com.template.sample.dto.SampleResponseDto
import org.springframework.stereotype.Service

@Service
class SampleService {

    fun process(dto: SampleRequestDto): SampleResponseDto {
        return SampleResponseDto(dto)
    }
}