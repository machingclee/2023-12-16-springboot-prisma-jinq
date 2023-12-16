package com.machingclee.hibernatetest.config;

import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class JinqConfig {
    @Bean
    JinqJPAStreamProvider jinqProvider(EntityManagerFactory emf) {
        return new JinqJPAStreamProvider(emf);
    }
}
