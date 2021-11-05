package com.instagram.downloader.test.main.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainIndex() throws Exception{
        return "main/main";
    }

    @GetMapping("/test")
    public String mainIndex2() throws Exception{
        String url = "https://www.instagram.com/sooolog/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
