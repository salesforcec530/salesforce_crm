package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HeaderResponse;

@RestController
@RequestMapping("api/gate-way/")
public class TestAPIController {

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        // Tạo một đối tượng Map để đại diện cho các trường header
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("Custom-Header1", "Value1");
        headersMap.put("Custom-Header2", "Value2");

        // Tạo body
        String responseBody = "Hello, this is the response body!";

        // Trả về ResponseEntity với header và body
        return ResponseEntity.status(HttpStatus.OK)
                .headers(createHeaders(headersMap))
                .body(responseBody);
    }

    private org.springframework.http.HttpHeaders createHeaders(Map<String, String> headersMap) {
        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headersMap.forEach(headers::add);
        return headers;
    }
}
