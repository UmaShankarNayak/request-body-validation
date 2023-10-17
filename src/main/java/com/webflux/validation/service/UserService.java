package com.webflux.validation.service;

import com.webflux.validation.model.UserDto;
import jakarta.validation.constraints.AssertTrue;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @AssertTrue
    public Mono<UserDto> registerUser(Mono<UserDto> userDtoMono) {
        System.out.println("Service.....................");
        return userDtoMono
                .doOnNext(System.out::println);
    }
}
