package com.spring.Practice;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Control {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return User.users.get(id);
    }

    @GetMapping("/users")
    public Map<Integer, User> getUsers(){
        return User.users;
    }






    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return user;
    }

    @PostMapping("/users-all")
    public List<User> addAllUsers(@RequestBody List<User> users){
        return users;
    }






    @DeleteMapping("/users/{id}")
    public User delete(@PathVariable int id){
        return User.users.remove(id);
    }

    @DeleteMapping("/users")
    public String delete(){
        User.users.clear();
        User.idDeclaration = 1;
        return "Everything successfully deleted";
    }
}
