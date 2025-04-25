package com.example.springframeworkadvanced.controller;

import com.example.springframeworkadvanced.dto.RegisterRequest;
import com.example.springframeworkadvanced.dto.RegisterResponse;
import com.example.springframeworkadvanced.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    private final AuthService authService;
    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/login")
    public String login() {
        return "auth/loginForm";
    }

    @PostMapping("/register")
    public String register(RegisterRequest registerRequest, Model model) {
        RegisterResponse registerResponse = authService.register(registerRequest);
        model.addAttribute("registerResponse", registerResponse);
        return "auth/registerForm";
    }
}
