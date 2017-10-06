package com.getset.hello.controller;

import com.getset.hello.entity.User;
import com.getset.hello.repository.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserReposity userReposity;

    @GetMapping("/user/{id}")
    public @ResponseBody User getUserById(@PathVariable Long id) {
        return userReposity.findOne(id);
    }
}
