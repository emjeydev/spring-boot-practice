package dev.emjey.simpole_form.controller;

import dev.emjey.simpole_form.Service.UserService;
import dev.emjey.simpole_form.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// This file is made by EmJey
// Project: Simple Form
// FileName: UserController.java
// Date: 2024/08/18
// Modified Date: 2024/08/18
// Email: emjeydev@gmail.com
// Github: emjeydev

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("userRequest", new User());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new User());
        return "login_page";
    }

    @PostMapping("/register")
    public String registerPage(@ModelAttribute("user") User user) {
        System.out.println("register request:" + user);
        User registeredUser = userService.registerUser(user.getUsername(), user.getPassword(), user.getEmail());
        return registeredUser == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        System.out.println("login request:" + user);
        User authenticatedUser = userService.authenticateUser(user.getUsername(), user.getPassword());
        if (authenticatedUser != null) {
            model.addAttribute("userLogin", authenticatedUser.getUsername());
            return "personal_page";
        } else {
            return "error_page";
        }
    }
}
