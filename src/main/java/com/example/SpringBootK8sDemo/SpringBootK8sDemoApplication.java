package com.example.SpringBootK8sDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootK8sDemoApplication {

    @GetMapping("/test")
    public String test() {
        return "test 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootK8sDemoApplication.class, args);
    }

}
