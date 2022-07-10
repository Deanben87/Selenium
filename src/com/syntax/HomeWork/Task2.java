package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("dide");
        driver.findElement(By.name("lastname")).sendKeys("benben");
        driver.findElement(By.name("reg_email__")).sendKeys("beben89@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.name("websubmit")).click();

        driver.quit();





    }
}
