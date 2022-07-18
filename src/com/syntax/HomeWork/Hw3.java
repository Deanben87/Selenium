package com.syntax.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw3 {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static String url="https://www.ebay.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement categoriesButton=driver.findElement(By.id("gh-cat"));
        categoriesButton.click();

        Select select=new Select(categoriesButton);
        List<WebElement>listCat=select.getOptions();
        for(WebElement list: listCat){
            System.out.println(list.getText());
        }
        System.out.println(listCat.size());
            Thread.sleep(3000);

            select.selectByIndex(11);
            Thread.sleep(2000);

            WebElement searchButton=driver.findElement(By.id("gh-btn"));
            searchButton.click();

            Thread.sleep(2000);

            String title=driver.getTitle();
            if(title.startsWith("Computer")){
                System.out.println("Title is correct");
            }



        }



    }

