package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.dto.request.RegisterRequestDTO;
import com.example.blog.dto.response.AuthenticationResponseDTO;
import com.example.blog.entity.Role;
import com.example.blog.entity.User;
import com.example.blog.repository.UserRepository;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository repository;

    public AuthenticationResponseDTO register(RegisterRequestDTO request) {
        User user = new User(request.getUsername(), request.getPassword(), Role.ADMIN);
        repository.save(user);
    }

    public AuthenticationResponseDTO authenticate(RegisterRequestDTO request) {
        return null;
    }
}
