package com.enlace.firstApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/app/foo")
    public Map<String, String> foo(){
        Map<String, String> json = new HashMap<>();
        json.put("message", "Hello world from spring Api Rest J A V A");
        return json;
    }
}
