package com.machingclee.experiments.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import com.machingclee.experiments.controller.StudentController;

@Configuration
public class RoutingConfig {
    @Bean
    public RouterFunction<ServerResponse> studentRouter(StudentController studentController) {
        return RouterFunctions.route()
                .GET("/students", RequestPredicates.accept(MediaType.ALL), studentController::getStudents)
                .build();
    }
}
