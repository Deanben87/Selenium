package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        //setting the property to use chromedriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                                                    //for Windows users add extension .exe on apple users we don't need it

        WebDriver driver=new ChromeDriver();//launch the browser
        driver.get("https://www.google.com");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
