package com.example.demo.services;

import com.example.demo.dtos.AuthorizationRequestDto;
import com.example.demo.dtos.AuthorizedUserDto;
import org.springframework.stereotype.Service;


public interface AuthorizationService {
    AuthorizedUserDto authorizeUser(AuthorizationRequestDto authorizationRequestDto);
}
