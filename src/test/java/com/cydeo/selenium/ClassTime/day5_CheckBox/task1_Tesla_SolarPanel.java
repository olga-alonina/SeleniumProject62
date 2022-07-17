package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class task1_Tesla_SolarPanel {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver = getWebDriver();
        //2- Go to: https://www.tesla.com/
        driver.get( "https://www.tesla.com/" );
        //3- Locate Solar Panels header
        WebElement solar_Panels_header = driver.findElement( By.xpath( "//span[.='Solar Panels']" ) );
        //4- Verify if it is dispayed on the page
        String test_name = "Verify Solar Panels header id displayed";
        if (solar_Panels_header.isDisplayed()) {
            System.out.println( test_name + " passed" );
        } else {
            System.out.println( test_name + " failed" );
        }
        //5 close
driver.close();
    }
}
