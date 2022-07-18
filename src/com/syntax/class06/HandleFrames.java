package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 13 Forever!!!");

        driver.switchTo().defaultContent();

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert= driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to the frame");

    }
}
