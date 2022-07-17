package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P05_LocateElementById {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate to google
        driver.get( "https://cydeo.com" );
        //identify element "I'm Feeling Lucky" and save it
        WebElement luckyText = driver.findElement( By.id( "gbqfbb" ) );
        //find value of attribute
        String text = luckyText.getAttribute( "value" );
        //verify if value is "I'm Feeling Lucky"
        if (text.equals( "I'm Feeling Lucky" )) {
            System.out.println( "Test Passed" );
        } else {
            System.out.println( "Test failed" );
        }
    }
}
