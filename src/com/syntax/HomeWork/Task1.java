package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("dean");
        driver.findElement(By.id("customer.lastName")).sendKeys("ben");
        driver.findElement(By.id("customer.address.street")).sendKeys("10716 s Ave B");
        driver.findElement(By.id("customer.address.city")).sendKeys("Chicago");
        driver.findElement(By.id("customer.address.state")).sendKeys("IL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("60617");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123654789");
        driver.findElement(By.id("customer.ssn")).sendKeys("31316646464");
        driver.findElement(By.id("customer.username")).sendKeys("zizou-dz");
        driver.findElement(By.id("customer.password")).sendKeys("Azer33146H");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Azer33146H");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
