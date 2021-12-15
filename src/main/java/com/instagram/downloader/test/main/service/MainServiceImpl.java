package com.instagram.downloader.test.main.service;

import com.instagram.downloader.test.main.dto.Obj2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

@Service
public class MainServiceImpl implements MainService{

    @Override
    public String profileDl(String userName) throws Exception{
        String url = "https://www.instagram.com/" + userName + "/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
/*
    @Override
    public String saveImg(String userName) throws Exception{
        String url1 = "https://www.instagram.com/" + userName + "/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        String jsonFile = restTemplate.getForObject(url1, String.class);
        int indexNum = jsonFile.indexOf("https://scontent-gmp1-1.cdninstagram.com/v/t51.2885-19/s320x320");
        String imageUrl = jsonFile.substring(indexNum);
        System.out.println(imageUrl);

        Image image = null;
        try {
            URL url = new URL(imageUrl);
            BufferedImage img = ImageIO.read(url);
            File file=new File("C:\\downloads\\instagram-downloader-webservice-test\\src\\main\\resources\\static\\images\\1.png");
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return restTemplate.getForObject(url1, String.class);
    }

 */
}
