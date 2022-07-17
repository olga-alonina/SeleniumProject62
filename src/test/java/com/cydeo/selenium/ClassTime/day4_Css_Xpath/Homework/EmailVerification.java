package com.cydeo.selenium.ClassTime.day4_Css_Xpath.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class EmailVerification {
    public static void main(String[] args) {
//      1- Open a chrome browser
        WebDriver driver = getWebDriver();
//        2. Go to http://practice.cydeo.com/forgot_password
        driver.get( "http://practice.cydeo.com/forgot_password" );
//        3. Enter any email into input box
        WebElement inputEmail = driver.findElement( By.cssSelector( "input[type='text']" ) );
        //        4. Click on Retrieve password//or you could press enter like i did
        inputEmail.sendKeys( "olga.alonina@gmail.com" + Keys.ENTER );
        //        5. Verify URL contains:
        String exp_URL = "email_sent"; //        Expected: “email_sent”
        String actual_URL = driver.getCurrentUrl();
        String test_name = "Verify URL contains ";
        if (actual_URL.contains( exp_URL )) {
            System.out.println( test_name + "passed" );
        } else {
            System.out.println( test_name + "failed" );
        }
//        6. Verify textbox displayed the content as expected.
        WebElement textbox = driver.findElement( By.cssSelector( "div>h4[name='confirmation_message']" ) );
        String exp_text = "Your e-mail's been sent!";//Expected: “Your e-mail’s been sent!”
        String actual_text = textbox.getText();
        String test_name1 = "Verify textbox displayed the content as expected ";
        if (actual_text.contains( exp_text )&& textbox.isDisplayed()) {
            System.out.println( test_name1 + "passed" );
        } else {
            System.out.println( test_name1 + "failed" );
        }
        //close
        driver.close();
    }
}
