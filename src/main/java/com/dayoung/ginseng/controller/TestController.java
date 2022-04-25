package com.dayoung.ginseng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/muhak")
    public String test() {
        return "test";
    }

    @GetMapping("/juyoung")
    public String juyoung() {
        return "juyoung";
    }

    @GetMapping("/happyBirthday")
    public String binggoo() {
        return "binggoo";
    }
}
