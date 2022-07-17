package com.cydeo.selenium.OH.OH_day2.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class Id {
    public static void main(String[] args) {
        //      1- Open a chrome browser
        WebDriver driver = getWebDriver();
        //        2- Go to: https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/" );
        //  3- Click to Multiple Buttons
        WebElement multiple_Buttons = driver.findElement( By.cssSelector( "a[href='/multiple_buttons']" ) );
        multiple_Buttons.click();
        //4- Click "Don't Click" button
        WebElement dont_Click_button = driver.findElement( By.id( "disappearing_button" ) );
        dont_Click_button.click();
        // 5- Verify Result is : "Now it's gone!"
        WebElement result = driver.findElement( By.cssSelector( "p[id='result']" ) );
        String exp_result = "Now it's gone!";
        String test_name = "Verify Result is : \"Now it's gone!\" ";
        String actual_result = result.getText();
        if (actual_result.equals( exp_result )) {
            System.out.println( test_name + "passed" );
        } else {
            System.out.println( test_name + "failed" );
        }//driver close
        driver.close();
    }
}
