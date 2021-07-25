package com.template.sample.dto

data class SampleResponseDto(
    val requestMessages: List<String>
) {
    constructor(dto: SampleRequestDto) : this(
        listOf<String>(dto.firstMessage, dto.secondMessage, dto.thirdMessage)
    )
}