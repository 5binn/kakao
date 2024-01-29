package com.example.demo.domain.member.controller;

import com.example.demo.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/join")
    public String join() {
        return "member/login";
    }

    @PostMapping("/join")
    public String join(@RequestParam("username") String username, @RequestParam("nickname") String nickname,
                       @RequestParam("password") String password, @RequestParam("email") String email) {
        this.memberService.join(username, nickname, password, email);
        return "redirect:/";
    }
}
