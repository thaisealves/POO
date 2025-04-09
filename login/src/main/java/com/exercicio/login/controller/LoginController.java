package com.exercicio.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.exercicio.login.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    // @GetMapping("/aula")
    // public String aula() {
    // String autenticado = loginService.login("admin", "123");
    // return autenticado;
    // }
    @PostMapping("/login")
    public String logar(@RequestBody String user, @RequestBody String password) {
        String result = loginService.login(user, password);
        return result;

    }
}