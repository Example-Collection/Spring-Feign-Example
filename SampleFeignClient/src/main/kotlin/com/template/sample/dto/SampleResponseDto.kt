package com.template.sample.dto

data class SampleResponseDto(
    val requestMessages: List<String>,
    val messageFromServer: String
)