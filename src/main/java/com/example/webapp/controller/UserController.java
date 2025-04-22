package com.example.webapp.controller;

import com.example.webapp.model.User;
import com.example.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String home(Model model) {
        List<User> users = service.getAllUsers();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute User user) {
        service.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/api/users")
    @ResponseBody
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}