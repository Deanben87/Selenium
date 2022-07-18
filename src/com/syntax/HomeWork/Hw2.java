package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW1
Go to facebook sign up page
Fill out the whole form
Click signup

 */

public class Hw2 {
    public  static  String url="https://www.fb.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(url);

        WebElement createAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement firstname=driver.findElement(By.cssSelector("input[name^=fir]"));
        firstname.sendKeys("dean");

        WebElement lastName= driver.findElement(By.cssSelector("input[name^=la]"));
        lastName.sendKeys("ben");

        WebElement phoneOrEmail =driver.findElement(By.cssSelector("input[name^=re]"));
        phoneOrEmail.sendKeys("az.ben@gmail.com");
        Thread.sleep(1000);
        WebElement phoneOrEmail2 =driver.findElement(By.name("reg_email_confirmation__"));
        phoneOrEmail2.sendKeys("az.ben@gmail.com");

        WebElement pass=driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("Azddd2002");

        WebElement month =driver.findElement(By.id("month"));
        Select selectMonth= new Select(month);
        selectMonth.selectByVisibleText("Aug");

        WebElement day=driver.findElement(By.id("day"));
        Select selectday= new Select(day);
        selectday.selectByValue("4");

        WebElement year= driver.findElement(By.id("year"));
        Select selectyear=new Select(year);
        selectyear.selectByValue("1987");

        WebElement gender=driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();

        driver.quit();



    }
}
