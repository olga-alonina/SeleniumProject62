package com.cydeo.selenium.ClassTime.Day2_Locator.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Title_Verification {
    public static void main(String[] args) {
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");
//        3. Search for “wooden spoon”
        WebElement search_element = driver.findElement( By.xpath( "//input[@id='global-enhancements-search-query']" ));
        search_element.sendKeys( "wooden spoon"+ Keys.ENTER );
//        4. Verify title:      //Expected: “Wooden spoon | Etsy”
        String expected_title = "Wooden spoon | Etsy";
        String actTitle = driver.getTitle();
        if (actTitle.equals( expected_title )) {
            System.out.println( "Tested title for Etsy is correct" );
        } else {
            System.out.println( "Tested title for Etsy is incorrect" );
        }
        //close the browser
        driver.quit();
    }
}
