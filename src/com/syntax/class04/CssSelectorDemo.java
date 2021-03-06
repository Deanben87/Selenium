package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        WebElement startPracticingButton= driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleFromDEmo= driver.findElement(By.xpath("//a[text()='Check Box Demo']/preceding-sibling::a"));
        simpleFromDEmo.click();
        Thread.sleep(2000);
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder^='Please']"));
        textBox.sendKeys("syntax tech");
        Thread.sleep(2000);
        WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='show']"));
        showMessageButton.click();
        Thread.sleep(2000);

        driver.quit();



    }
}
