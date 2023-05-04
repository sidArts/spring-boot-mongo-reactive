package com.sapient.domainexercise.reactiveroutes;

import com.sapient.domainexercise.reactiveroutes.handlers.TestRouteHandlers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


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
