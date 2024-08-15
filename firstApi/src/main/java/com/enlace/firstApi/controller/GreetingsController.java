package com.enlace.firstApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/hello")
    public String usa() {
        return "Hello World from Usa!";
    }

    @GetMapping("/bonjour")
    public String france() {
        return "Bonjour le monde from France!";
    }

    @GetMapping("/hallo")
    public String germany() {
        return "Hallo Welt from Germany!";
    }
    @GetMapping("/hello-name/{name}/{age}")
    public String GreetingWithName(@PathVariable String name, @PathVariable int age) {
        return "Hello " + name + " with " + age + "years, greetings from any place!";
    }
}
