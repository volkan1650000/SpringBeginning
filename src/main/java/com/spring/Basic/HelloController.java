package com.spring.Basic;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello world";
    }

    @PostMapping(path = "/save")
    public String save(){
        return "Data saved!";
    }

    @PutMapping(path = "/update")
    public String update(){
        return "Data updated!";
    }

    @DeleteMapping(path = "/delete")
    public String delete(){
        return "Data deleted!";
    }
}
