package com.cydeo.selenium.ClassTime.day1_intro;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebDriver;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;
import static com.cydeo.utilities.utility_driver.verify_title.verify_title_with_equalMethod;

public class P03_GettingPageTitle {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriver driver = getWebDriver();
        //navigate to google and print out the title
        driver.get( "https://cydeo.com" );
        verify_title_with_equalMethod( Driver.getDriver(),"cydeo" );
        driver.quit();
    }
}
