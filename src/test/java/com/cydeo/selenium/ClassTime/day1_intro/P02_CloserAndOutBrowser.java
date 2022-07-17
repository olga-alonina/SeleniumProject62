package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.WebDriver;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P02_CloserAndOutBrowser {
    public static void main(String[] args)throws InterruptedException {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate to the practice page than open new tab
        //this practice url will open and wait 3 sec and open new tab
        driver.get( "http://practice.cydeo.com/open_new_tab" );

        Thread.sleep(5000);
        //closing only currient tab
       driver.close();
        //close all browser windows opened by driver
        driver.quit();
    }
}
