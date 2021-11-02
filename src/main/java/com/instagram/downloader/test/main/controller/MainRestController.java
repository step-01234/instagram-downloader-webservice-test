package com.instagram.downloader.test.main.controller;

import com.instagram.downloader.test.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
public class MainRestController {

    private final MainService mainService;

    @PostMapping("/userNameApi")
    public String profileDl(@RequestParam String userName) throws Exception{
        return mainService.profileDl(userName);
    }

    @PostMapping("/userIdApi")
    public String userId(@RequestParam String userName) throws Exception{
        return mainService.profileDl(userName);
    }

    @GetMapping("/userIdApi2")
    public String userId2(@RequestParam String userName) throws Exception{
        return mainService.profileDl(userName);
    }

    @GetMapping("/userIdApi3")
    public String userId3(@RequestParam String userName) throws Exception{
        String url = "https://www.instagram.com/" + userName + "/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/userIdApi4")
    public String userId4() throws Exception{
        String url = "https://www.instagram.com/sooolog/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
