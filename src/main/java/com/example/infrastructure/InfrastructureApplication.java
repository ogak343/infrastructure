package com.example.infrastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class InfrastructureApplication {

    private static final Logger log = LoggerFactory.getLogger(InfrastructureApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }

    @EventListener
    public void handleEvent(ApplicationReadyEvent event) {

        log.info("Application ready");
    }

}
