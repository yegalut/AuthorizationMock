package com.example.demo.services;

import com.example.demo.dtos.AuthorizationRequestDto;
import com.example.demo.dtos.AuthorizedUserDto;
import com.example.demo.mappers.AuthorizedUserMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Override
    public AuthorizedUserDto authorizeUser(AuthorizationRequestDto authorizationRequestDto) {
        return AuthorizedUserMapper.mapToAuthorizedUserDto(authorizationRequestDto);
    }
}
