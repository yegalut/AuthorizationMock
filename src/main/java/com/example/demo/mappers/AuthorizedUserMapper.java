package com.example.demo.mappers;

import com.example.demo.dtos.AuthorizationRequestDto;
import com.example.demo.dtos.AuthorizedUserDto;

import java.util.List;

public class AuthorizedUserMapper {

    private static final int TYPICAL_USER_INFO_ARRAY_SIZE = 4;
    private static final String CODE_DELIMITER = ";";

    public static AuthorizedUserDto mapToAuthorizedUserDto(AuthorizationRequestDto authorizationRequestDto) {

        List<String> userInfo = List.of(authorizationRequestDto.getCode().split(CODE_DELIMITER));
        return AuthorizedUserDto.builder()
                .kki(userInfo.get(0))
                .kkf(userInfo.get(1))
                .email(userInfo.get(2))
                .phoneNumber(Integer.parseInt(userInfo.get(3)))
                .build();

    }

}
