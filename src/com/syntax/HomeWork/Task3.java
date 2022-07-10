package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        WebElement startPractice= driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPractice.click();
        Thread.sleep(5000);
        WebElement demo=driver.findElement(By.xpath("//a[@class = 'list-group-item']/parent :: div"));
        demo.click();




        }

    }



