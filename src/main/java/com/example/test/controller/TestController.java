package com.example.test.controller;

import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(testService.testMehotd());
    }
}
