package com.example.infrastructure.controller;

import com.example.infrastructure.dto.ApiResponse;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides a lightweight service health endpoint for local and cloud checks.
 */
@RestController
@RequestMapping("/api/v1/health")
public class HealthController {

    /**
     * Reports whether the application process is running.
     *
     * @return successful health response
     */
    @GetMapping
    public ResponseEntity<ApiResponse<Map<String, String>>> health() {
        return ResponseEntity.ok(ApiResponse.success(Map.of("status", "UP"), "Service is healthy"));
    }
}
