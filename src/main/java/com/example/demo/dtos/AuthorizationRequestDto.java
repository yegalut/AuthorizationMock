package com.example.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class AuthorizationRequestDto {

    public AuthorizationRequestDto() {
    }

    private String code;
}
