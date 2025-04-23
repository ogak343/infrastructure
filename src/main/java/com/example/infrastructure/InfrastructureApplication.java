package com.example.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfrastructureApplication {

    private static final Logger log = LoggerFactory.getLogger(InfrastructureApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }

}
