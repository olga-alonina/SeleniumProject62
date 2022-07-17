package com.cydeo.selenium.ClassTime.day4_Css_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriver driver = getWebDriver();
//2. Go to https://practice.cydeo.com/forgot_password
        driver.get( "https://practice.cydeo.com/forgot_password" );

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement home = driver.findElement( By.cssSelector( "a[class=\"nav-link\"]" ) );//xpath=> "//a[@class='nav-link']"
        //b. “Forgot password” header
        WebElement forgot_password_header = driver.findElement( By.cssSelector( "div[class='example']>h2" ) );//xpath =>"//h2[.='Forgot Password']"
        //c. “E-mail” text
        WebElement e_mail_text = driver.findElement( By.cssSelector( "label[for='email']" ) );//xpath=>//label[.='E-mail']
        //d. E-mail input box
        WebElement e_mail_input_box = driver.findElement( By.cssSelector( "input[name='email']" ) );//xpath=>"//input[@type='text']"
        //e. “Retrieve password” button
        WebElement retrieve_password_button = driver.findElement( By.cssSelector( "i[class='icon-2x icon-signin']" ) );//xpath=>"//button/i[.='Retrieve password']
        // f. “Powered by Cydeo text
        WebElement powered_by_Cydeo_text = driver.findElement( By.cssSelector( " div[style='text-align: center;']" ) );//xpath=>"//div[@style='text-align: center;']"
        //4. Verify all web elements are displayed.
        if (home.isDisplayed()) {
            System.out.println( "Home passed" );
        }
        if (forgot_password_header.isDisplayed()) {
            System.out.println( "forgot password header passed" );
        }
        if (e_mail_text.isDisplayed()) {
            System.out.println( "email text passed" );
        }
        if (e_mail_input_box.isDisplayed()) {
            System.out.println( "e_mail_input_box passed" );
        }
        if (retrieve_password_button.isDisplayed()) {
            System.out.println( "retrieve_password_button passed" );
        }
        if (powered_by_Cydeo_text.isDisplayed()) {
            System.out.println( "retrieve_password_button passed" );
        }
        //close
        driver.close();
    }
}
