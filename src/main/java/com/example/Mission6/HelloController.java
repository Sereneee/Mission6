package com.example.Mission6;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @Value("${spring.profiles.active.message}")
    private String message;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world by " + message;
    }
}
