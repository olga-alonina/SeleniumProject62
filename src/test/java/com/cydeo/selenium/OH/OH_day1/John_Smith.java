package com.cydeo.selenium.OH.OH_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class John_Smith {
    public static void main(String[] args) {

        //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //	2- Go to: https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/ " );
        //  3- Click Sign Up For Mailing List
        //  ( by using partialLinkText locator)
        WebElement sign_Up_For_Mailing_List = driver.findElement
                ( By.partialLinkText( "Mailing " ) );
        sign_Up_For_Mailing_List.click();
        //	4- Verify title equals://    Expected: Sign Up
        String exp_title = "Sign Up";
        String actual_title = driver.getTitle();
        if (actual_title.equals( exp_title )) {
            System.out.println( "Title equals Sign Up" );
        } else {
            System.out.println( "Title doesnot equals Sign Up" );
        }
        //	5- Fill form with following information(by using name locator)
        // fullname : John Smith // email    : john@cydeo.com
        WebElement login = driver.findElement( By.name( "full_name" ) );
        login.sendKeys( "John Smith" );
        WebElement email = driver.findElement( By.name( "email" ) );
        email.sendKeys( "john@cydeo.com" );
        //6- Click on Sign Up Button (by using name locator)
        WebElement sign_Up_Button = driver.findElement( By.name( "wooden_spoon" ) );
        sign_Up_Button.click();
        //7- Verify title equals: // Expected: Signup Confirmation
        String exp_title2 = "Signup Confirmation";
        String actual_title2 = driver.getTitle();
        if (actual_title2.equals( exp_title2 )) {
            System.out.println( "Title equals Signup Confirmation" );
        } else {
            System.out.println( "Title doesnot equals Signup Confirmation" );
        }//close
		driver.close();
    }
}

