package com.instagram.downloader.test.main.controller;

import com.instagram.downloader.test.main.dto.Obj2;
import com.instagram.downloader.test.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MainRestController {

   // private WebDriver driver;
    private final MainService mainService;

    @GetMapping("/userNameApi")
    public String profileDl(@RequestParam String userName) throws Exception{
        System.out.println(mainService.profileDl(userName));
        return mainService.profileDl(userName);
    }

    @GetMapping("/userIdApi")
    public String userId(@RequestParam String userName) throws Exception{
        System.out.println(mainService.profileDl(userName));
        return mainService.profileDl(userName);
    }
/*
    @PostMapping("/userIdApi1")
    public String userId1(@RequestParam String userName) throws Exception{
        System.out.println("여기까진sergserg");
        return "sibal";
    }
*/
/*
    @PostMapping("/saveImg")
    public void saveImage(@RequestBody Obj2 obj2) throws Exception{
        System.out.println("여기까지오나");
        mainService.saveImg(obj2);
    }
*/
/*
 /*
    @GetMapping("/crawlingInsta")
    public void mainIndex3() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\downloads\\instagram-downloader-webservice-test\\src\\main\\resources\\bin\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://instagram.com/sooolog/?__a=1");

        List<WebElement> posts = driver.findElements(By.tagName("body"));

        for(WebElement e : posts){
            System.out.println(e.getText());
            System.out.println("1");
        }

        driver.quit();
    }

    @GetMapping("/getImage")
    public byte[] getImageWithMediaType() throws Exception{
        InputStream in = getClass().getResourceAsStream("https://scontent-gmp1-1.cdninstagram.com/v/t51.2885-19/s320x320/247085592_362300202303986_7517738213048337869_n.jpg?_nc_ht=scontent-gmp1-1.cdninstagram.com&_nc_ohc=gj-ZPyft4SUAX8iCExv&edm=ABfd0MgBAAAA&ccb=7-4&oh=383a060ff3d30e46bcc6de7db3d523e2&oe=618ADE5F&_nc_sid=7bff83");
        return IOUtils.toByteArray(in);
    }
*/

    @GetMapping("/test213")
    public String mainIndex213() throws Exception{
        String url = "https://www.instagram.com/sooolog/channel/?__a=1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

}
