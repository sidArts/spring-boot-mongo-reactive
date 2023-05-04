package com.sapient.domainexercise.reactiveroutes.handlers;

import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Service
@Getter
public class TestRouteHandlers {

    private HandlerFunction<ServerResponse> welcomeMessageHandler = request ->
            ok().bodyValue("Hello, Reactive Microservice");

}
