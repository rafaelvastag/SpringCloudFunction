package com.vastag.azure.function.Functions.handers;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import com.vastag.azure.function.Functions.models.User;
import com.vastag.azure.function.Functions.models.UserResponse;

public class HelloHandler extends FunctionInvoker<User, UserResponse>{

	@FunctionName("hello")
    public HttpResponseMessage execute(
        @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
        ExecutionContext context) {
        User user = request.getBody()
                           .filter((u -> u.getName() != null))
                           .orElseGet(() -> new User(
                               request.getQueryParameters()
                                      .getOrDefault("name", "world")));
        context.getLogger().info("Greeting user name: " + user.getName());
        return request
            .createResponseBuilder(HttpStatus.OK)
            .body(handleRequest(user, context))
            .header("Content-Type", "application/json")
            .build();
    }
	
}
