package com.sapient.domainexercise.reactivemicroservice.reactiveroutes;

import com.sapient.domainexercise.reactivemicroservice.reactiveroutes.handlers.TestRouteHandlers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


/**
 * @author sidmurar
 */
@Configuration
public class TestRoutes {

    @Autowired
    TestRouteHandlers testRouteHandlers;

    @Bean
    RouterFunction<ServerResponse> welcomeMessage() {
        return route(GET("/"), testRouteHandlers.getWelcomeMessageHandler())
                .and(route(GET("/info"), testRouteHandlers.getWelcomeMessageHandler()));
    }
}
