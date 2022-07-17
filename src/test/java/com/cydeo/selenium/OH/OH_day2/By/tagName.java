package com.cydeo.selenium.OH.OH_day2.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class tagName {
    public static void main(String[] args) {
        //      1- Open a chrome browser
        WebDriver driver = getWebDriver();
        //        2- Go to: https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/" );
        // 3- Verify first link text is "Home"
        WebElement home = driver.findElement( By.cssSelector( "a[class='nav-link']" ) );
        String exp_text = "Home";
        String test_name = "Verify first link text is \"Home\" ";
        String actual_text = home.getText();
        if (actual_text.equals( exp_text )) {
            System.out.println( test_name + "passed" );
        } else {
            System.out.println( test_name + "failed" );
        }
        //close
        driver.close();

    }
}
