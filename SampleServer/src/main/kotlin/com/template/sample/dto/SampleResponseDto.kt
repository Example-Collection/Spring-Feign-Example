package com.template.sample.dto

data class SampleResponseDto(
    val requestMessages: List<String>,
    val messageFromServer: String = "This message is created by a server that Feign has called."
) {
    constructor(dto: SampleRequestDto) : this(
        listOf<String>(dto.firstMessage, dto.secondMessage, dto.thirdMessage)
    )
}