package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton=driver.findElement(By.cssSelector("input[value='5 - 15']"));
        boolean isAgeRadioButton=ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButton);


        boolean isAgeRadioButtonDisplay= ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplay);

        Boolean isAgeRadioButtonSelected= ageRadioButton.isSelected();//check if it is selected
        System.out.println("Before Clicking "+isAgeRadioButtonSelected);//false

        ageRadioButton.click();
        isAgeRadioButtonSelected= ageRadioButton.isSelected();//checking the state after clicking true
        System.out.println("After clicking "+isAgeRadioButtonSelected);

        driver.quit();

    }
}
