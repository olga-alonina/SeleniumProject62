package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.WebDriver;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate.to(url)
        driver.navigate().to( "https://www.google.com" );
        //driver.get(url)
//        driver.get( "https://www.google.com" );
//        //navigate.back()
        driver.navigate().back();
        //navigate.forward()
        driver.navigate().forward();
        //navigate.refresh()
        driver.navigate().refresh();
    }

}