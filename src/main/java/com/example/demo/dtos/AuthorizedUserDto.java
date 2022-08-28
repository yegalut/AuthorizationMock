package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class AuthorizedUserDto {

    private String kki;
    private String kkf;
    private String email;
    private int phoneNumber;

}
