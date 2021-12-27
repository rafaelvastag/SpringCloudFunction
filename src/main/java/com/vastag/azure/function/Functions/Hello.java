package com.vastag.azure.function.Functions;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.vastag.azure.function.PocRepository;
import com.vastag.azure.function.Functions.models.User;
import com.vastag.azure.function.Functions.models.UserResponse;

import reactor.core.publisher.Mono;

@Component
public class Hello implements Function<Mono<User>, Mono<UserResponse>> {
	
	private PocRepository r;
	
	public Hello(PocRepository repo) {
		r = repo;
	}

    public Mono<UserResponse> apply(Mono<User> mono) {
        return mono.map(user -> {
        	
        	
        	return new UserResponse("Hello, " + user.getName() + "!\n " + r.findById(1L).toString());
        	
        
        
        });
    }
}
