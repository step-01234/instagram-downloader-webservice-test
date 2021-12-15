package com.instagram.downloader.test.main.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@Controller
public class MainController {

    private final static String IMAGE_URL = "https://www.google.com/favicon.ico";

    @GetMapping("/")
    public String mainIndex() throws Exception{
        return "main/profileImage";
    }

    @GetMapping("/profileId")
    public String subIndex() throws Exception{
        return "main/profileId";
    }
/*
    @GetMapping("/test2")
    public void test2323() throws Exception {
        Image image = null;
        try {
            URL url = new URL("https://scontent-gmp1-1.cdninstagram.com/v/t51.2885-19/s150x150/247085592_362300202303986_7517738213048337869_n.jpg?_nc_ht=scontent-gmp1-1.cdninstagram.com&_nc_cat=102&_nc_ohc=diRloaE1AfUAX9N7l1F&edm=ALCvFkgBAAAA&ccb=7-4&oh=1397314042e98dcaa1b88d9c5824c58b&oe=619B2767&_nc_sid=643ae9");
            BufferedImage img = ImageIO.read(url);
            File file=new File("C:\\downloads\\instagram-downloader-webservice-test\\src\\main\\resources\\static\\images\\1.png");
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
*/

}
