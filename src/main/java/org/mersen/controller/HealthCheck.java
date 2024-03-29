package org.mersen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheck {

    @GetMapping("/check")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Application is healthy", HttpStatus.OK);
    }
}
