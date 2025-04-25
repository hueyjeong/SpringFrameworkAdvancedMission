package com.example.springframeworkadvanced.service;

import com.example.springframeworkadvanced.domain.User;
import com.example.springframeworkadvanced.dto.RegisterRequest;
import com.example.springframeworkadvanced.dto.RegisterResponse;
import com.example.springframeworkadvanced.mapper.UserMapper;
import com.example.springframeworkadvanced.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    @Autowired
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public RegisterResponse register(RegisterRequest registerRequest) {
        User user = UserMapper.INSTANCE.toUser(registerRequest);
        user = userRepository.save(user);
        return new RegisterResponse("User registered successfully", user.getUsername());
    }
}
