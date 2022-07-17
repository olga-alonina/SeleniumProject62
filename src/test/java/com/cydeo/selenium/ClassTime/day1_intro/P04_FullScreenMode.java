package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.WebDriver;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P04_FullScreenMode {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate to google and print out the title
        driver.get( "https://cydeo.com" );
        driver.manage().window().fullscreen();
    }
}
