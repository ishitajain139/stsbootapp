package com.sks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @PostMapping("/info")
    public User displayUserDetails(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        user.setNationality(user.getNationality().toUpperCase());
        return user;
    }
    
    @GetMapping("/{name}/{age}")
    public String displayUserName(@PathVariable String name, @PathVariable int age) {
        return "Welcome " + name + " " + age;
    }
}
