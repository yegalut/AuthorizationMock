package com.example.demo.controllers;

import com.example.demo.dtos.AuthorizationRequestDto;
import com.example.demo.dtos.AuthorizedUserDto;
import com.example.demo.services.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authorize")
public class AuthorizationController {

    @Autowired
    public AuthorizationService authorizationService;

    @PostMapping("/code")
    public AuthorizedUserDto authorizeUser(@RequestBody AuthorizationRequestDto authorizationRequestDto) {
        return authorizationService.authorizeUser(authorizationRequestDto);
    }
}
