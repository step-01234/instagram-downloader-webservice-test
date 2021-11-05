package com.instagram.downloader.test.main.controller;

import com.instagram.downloader.test.main.service.MainService;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MainRestController {

    private WebDriver driver;
    private final MainService mainService;

    @PostMapping("/userNameApi")
    public String profileDl(@RequestParam String userName) throws Exception{
        return mainService.profileDl(userName);
    }

    @PostMapping("/userIdApi")
    public String userId(@RequestParam String userName) throws Exception{
        return mainService.profileDl(userName);
    }

    @GetMapping("/crawlingInsta")
    public void mainIndex3() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rlaqu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://instagram.com/sooolog/?__a=1");

        List<WebElement> posts = driver.findElements(By.tagName("body"));

        for(WebElement e : posts){
            System.out.println(e.getText());
            System.out.println("1");
        }

        driver.quit();

    }
}
