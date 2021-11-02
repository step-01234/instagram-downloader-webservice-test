package com.instagram.downloader.test.main.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MainServiceImpl implements MainService{

    @Override
    public String profileDl(String userName) throws Exception{
        String url = "https://www.instagram.com/" + userName + "/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

}
