package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser

 */

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement createAccount= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement months = driver.findElement(By.id("month"));
        Select selectMonths= new Select(months);

        int numOfMonths= selectMonths.getOptions().size();
        System.out.println("number of months is : "+numOfMonths);


        WebElement BdyDay= driver.findElement(By.cssSelector("select[aria-label=Day]"));
        Select selectDay= new Select(BdyDay);

        int numOfDay=selectDay.getOptions().size();
        System.out.println("number of days is  : "+numOfDay);



        WebElement years= driver.findElement(By.id("year"));
        Select selectyears= new Select(years);

        int numOfyrs= selectyears.getOptions().size();
        System.out.println("number of years is : "+numOfyrs);


        WebElement day= driver.findElement(By.id("day"));
        selectDay.selectByValue("4");

        WebElement month= driver.findElement(By.id("month"));
        selectMonths.selectByValue("8");

        WebElement year= driver.findElement(By.id("year"));
        selectyears.selectByValue("1987");

        driver.quit();








    }
}
