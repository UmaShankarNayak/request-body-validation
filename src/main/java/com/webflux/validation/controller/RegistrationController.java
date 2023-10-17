package com.webflux.validation.controller;

import com.webflux.validation.model.UserDto;
import com.webflux.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("user")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public Mono<UserDto> register(@Valid @RequestBody UserDto userDtoMono){
        System.out.println("Controller.....................");
        return this.userService.registerUser(Mono.just(userDtoMono));
    }

}