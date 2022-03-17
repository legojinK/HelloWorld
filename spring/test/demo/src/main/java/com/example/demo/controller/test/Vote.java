package com.example.demo.controller.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/test")
public class Vote {

    @GetMapping("/vote")
    public String getvote () {
        log.info("getvote()");

        return "/test/jsBoolTest";
    }

    @GetMapping("/test")
    public String getTest () {
        log.info("getTest()");

        return "/test/jsBoolTest";
    }

}
