package com.vastag.azure.function.Functions;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.vastag.azure.function.Functions.models.User;
import com.vastag.azure.function.Functions.models.UserResponse;

import reactor.core.publisher.Mono;

@Component
public class Hello implements Function<Mono<User>, Mono<UserResponse>> {

    public Mono<UserResponse> apply(Mono<User> mono) {
        return mono.map(user -> new UserResponse("Hello, " + user.getName() + "!\n"));
    }
}
