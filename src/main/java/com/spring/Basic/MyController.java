package com.spring.Basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    @GetMapping(path = "/message/{m}")
    public String getMessage(@PathVariable("m") String message) {
        return "your message is  = "+message;
    }

    @GetMapping(path = "/getId/{m}")
    public int getId(@PathVariable("m") int id) {
        return id;
    }
}
