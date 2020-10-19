package com.example.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
// TODO 1 : RequiredArgsConstructor 작동 X 수정필요
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
