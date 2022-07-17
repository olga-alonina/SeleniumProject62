package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P10_LocateElementByPartialLinkText {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate to google.com
        driver.get( "https://google.com" );
        //identify and save the "helpfulText" element
        WebElement helpText = driver.findElement( By.partialLinkText( "learn about" ) );
        //print out this text
        System.out.println( helpText.getText() );

        //close the browser
        driver.quit();
    }

}