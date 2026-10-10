package com.example.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Public Infrastructure Issue Reporting System backend.
 */
@SpringBootApplication
public class InfrastructureApplication {

    /**
     * Starts the Spring Boot application.
     *
     * @param args command-line arguments supplied by the runtime
     */
    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }
}
