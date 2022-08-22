package com.clonecoding.spring.naver.controller;

import com.clonecoding.spring.naver.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

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
        // form 을 통해 넘어온 데이터 로그 출력
        System.out.println("form data id        : " + form.getUserId());
        System.out.println("form data pw        : " + form.getUserPw());
        System.out.println("form data re        : " + form.getRe());
        System.out.println("form data name      : " + form.getName());
        System.out.println("form data year      : " + form.getYear());
        System.out.println("form data month     : " + form.getMonth());
        System.out.println("form data day       : " + form.getDay());
        System.out.println("form data gender    : " + form.getGender());
        System.out.println("form data email     : " + form.getEmail());
        //////////////////////////////////////////////
        // 넘어온 데이터 유효성 검사
        // 날짜 데이터 형식 변경
        int birthYear = Integer.parseInt(form.getYear());
        int birthMonth = Integer.parseInt(form.getMonth());
        int birthDay = Integer.parseInt(form.getDay());
        LocalDate birth = LocalDate.of(birthYear, birthMonth, birthDay);
        System.out.println(birth);
        //////////////////////////////////////////////
        // User 객체 생성
        User user = new User();
        user.setUserId(form.getUserId());
        user.setUserPw(form.getUserPw());
        user.setName(form.getName());
        user.setBirth(birth);
        user.setGender(form.getGender());
        user.setEmail(form.getEmail());
        //////////////////////////////////////////////
        // User 객체 데이터 로그 출력
        System.out.println("user data id        : " + user.getUserId());
        System.out.println("user data pw        : " + user.getUserPw());
        System.out.println("user data name      : " + user.getName());
        System.out.println("user data birth     : " + user.getBirth());
        System.out.println("user data gender    : " + user.getGender());
        System.out.println("user data email     : " + user.getEmail());
        //////////////////////////////////////////////
        return "redirect:/";
    }

}