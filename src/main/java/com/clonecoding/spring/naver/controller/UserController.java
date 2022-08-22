package com.clonecoding.spring.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("user/login")
    public String loginPost(Model model) {

        return "redirect:/";
    }

    @GetMapping("user/signup")
    public String signUpGet(Model model) {

        return "user/signup";
    }

    @PostMapping("user/signup")
    public String signUpPost(UserSignUpForm form) {

        System.out.println(form.getUserId());
        System.out.println(form.getUserPw());
        System.out.println(form.getRe());

        System.out.println(form.getName());

        System.out.println(form.getYear());
        System.out.println(form.getMonth());
        System.out.println(form.getDay());

        System.out.println(form.getGender());

        System.out.println(form.getEmail());

        return "redirect:/";
    }

}