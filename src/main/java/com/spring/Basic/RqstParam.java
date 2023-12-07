package com.spring.Basic;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RqstParam {

    @GetMapping("/message")
    public String getMessageWithRequestParam(@RequestParam String message){
        return "your message is = "+message;
    }
}
