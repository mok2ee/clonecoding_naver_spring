package com.clonecoding.spring.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping ("user/signup")
    public String signUpGet(Model model) {

        return "user/signup";
    }

    @PostMapping("user/signup")
    public String signUpPost(Model model) {

        return "redirect:/";
    }

}