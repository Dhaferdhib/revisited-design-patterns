package io.dm.springboothelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;

@Configuration
public class RestConfiguration {

    @Bean
    public RouterFunction<ServerResponse> findRoutes() {
        return RouterFunctions.route(GET("/"), request -> ServerResponse.ok().body("Hello Everyone to DM Azure App services"));
    }
}
