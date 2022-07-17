package com.cydeo.selenium.OH.OH_day2.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class className {
    public static void main(String[] args) {
        //      1- Open a chrome browser
        WebDriver driver = getWebDriver();
        //        2- Go to: https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/" );

        // 3- Get Text of Test Automaton Practice
        WebElement ta_practice = driver.findElement( By.className( "h1y" ) );
        String text = ta_practice.getText();
        //	4- Locate A/B Testing
        WebElement ab_testing = driver.findElement( By.cssSelector( "a[href='/abtest']" ) );
        //	5- Click on A/B Testing
        ab_testing.click();
        //	6- Verify title is "No A/B Test"
        String exp_result = "No A/B Test";
        String actusl_result = driver.getTitle();
        String test_name = "Verify title is \"No A/B Test\" ";
        if (actusl_result.equals( exp_result )) {
            System.out.println( test_name + "passed" );
        } else {
            System.out.println( test_name + "failed" );
        }
        //close
        driver.close();
    }
}