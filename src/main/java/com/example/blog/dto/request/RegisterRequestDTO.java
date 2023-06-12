package com.example.blog.dto.request;

import java.util.Objects;

public class RegisterRequest {
    private String username;

    private String password;

    public RegisterRequest() {
    }

    public RegisterRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterRequest username(String username) {
        setUsername(username);
        return this;
    }

    public RegisterRequest password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) o;
        return Objects.equals(username, registerRequest.username) && Objects.equals(password, registerRequest.password);
    }
}
