package com.exercicio.login.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private Map<String, String> senhas;

    public LoginService() {
        senhas = new HashMap<>();
        senhas.put("admin", "123");
        senhas.put("user", "456");
        senhas.put("root", "345");

    }

    public String login(String user, String password) {
        if (senhas.containsKey(user) && senhas.get(user).equals(password)) {
            return "aula";
        }
        return "login";
    }
}
