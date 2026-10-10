package com.example.infrastructure.dto;

/**
 * Standard response envelope used by the REST API.
 *
 * @param <T> response payload type
 */
public record ApiResponse<T>(boolean success, T data, String message) {

    /**
     * Creates a successful API response.
     *
     * @param data response payload
     * @param message human-readable result message
     * @param <T> response payload type
     * @return successful response envelope
     */
    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(true, data, message);
    }
}
