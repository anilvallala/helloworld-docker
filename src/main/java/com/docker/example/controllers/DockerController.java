package com.docker.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
    @GetMapping("/hello")
    public ResponseEntity<Result> greet(){
        Result result=new Result();
        result.setResult("SUCCESS");
        return ResponseEntity.ok(result);
    }
}
