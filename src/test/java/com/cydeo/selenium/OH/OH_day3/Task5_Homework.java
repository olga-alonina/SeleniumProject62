package com.cydeo.selenium.OH.OH_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class Task5_Homework {
    public static void main(String[] args) {
        // TC #3: Practice Cydeo/ForgotPassword URL verification
        //    1. Open Chrome browser
        WebDriver driver = getWebDriver();
        //    2. Go to http://practice.cydeo.com/forgot_password
        driver.get( "http://practice.cydeo.com/forgot_password" );
        //    3. Enter any email into input box
        WebElement input_box = driver.findElement( By.xpath( "//input[@name=\"email\"]" ) );
        input_box.sendKeys( "olga_alonina@gmail.com" );
        //    4. Click on Retrieve password
        WebElement retrieve_password_bt = driver.findElement( By.xpath( "  //i[.='Retrieve password']" ) );
        retrieve_password_bt.click();
        //    5. Verify URL contains:
        //    Expected: “email_sent”
        String actual_URL = driver.getCurrentUrl();
        System.out.println("Verify URL contains: “email_sent”");
        System.out.println(actual_URL.contains( "email_sent" )?"Test Passed":"Test Failed");
        //    6. Verify textbox displayed the content as expected.
        //    Expected: “Your e-mail's been sent!”
        WebElement textbox = driver.findElement( By.xpath( "//h4[@name=\"confirmation_message\"]" ) );
        String expected_text = "Your e-mail's been sent!";
        String actual_text = textbox.getText();
        System.out.println("Verify textbox displayed the content");
        System.out.println(actual_text.equals( expected_text )?"Test Passed":"Test failed");

        //close
        driver.quit();


    }
}