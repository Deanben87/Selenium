package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class MaximizeBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");
        driver.manage().window().maximize();//maximize the window
       // driver.manage().window().fullscreen();//full screen

    }

}
