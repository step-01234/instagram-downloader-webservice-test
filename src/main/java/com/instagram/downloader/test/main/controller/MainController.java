package com.instagram.downloader.test.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainIndex() throws Exception{
        return "main/main";
    }


}
