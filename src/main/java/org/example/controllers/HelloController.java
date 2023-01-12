package org.example.controllers;

import org.example.components.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final ClientComponent component;

    @Autowired
    public HelloController(ClientComponent component) {
        this.component = component;
    }

    @GetMapping("/1")
    public String HelloWorld(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/2")
    public String InjectWorld(){;
        return this.component.operation2();
    }
}
