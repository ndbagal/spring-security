package dev.ndbagal.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/name/{name}")
    public ResponseEntity<String> getName(@PathVariable("name") String name) {
        return ResponseEntity.ok(name);
    }
}
