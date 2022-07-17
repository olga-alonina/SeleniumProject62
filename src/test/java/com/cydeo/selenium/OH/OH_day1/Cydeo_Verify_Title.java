package com.cydeo.selenium.OH.OH_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class Cydeo_Verify_Title {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = getWebDriver();
        //2- Go to https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/ " );
        //3- Click to Multiple Buttons (by using linkText locator)
        WebElement multiple_Buttons = driver.findElement
                ( By.linkText( "Multiple Buttons" ) );
        multiple_Buttons.click();
        //4- Verify title equals:  // Expected: Multiple Buttons
        String exp_title = "Multiple Buttons";
        String actual_title = driver.getTitle();
        if (actual_title.equals( exp_title )) {
            System.out.println( "Title equals Multiple Buttons" );
        } else {
            System.out.println( "Title doesnot equals Multiple Buttons" );
        }
        //5- Go back to home page by using the .back();
        driver.navigate().back();
        //6- Verify title equals:// Expected: Practice
        String exp_title1 = "Practice";
        String actual_title1 = driver.getTitle();
        if (actual_title1.equals( exp_title1 )) {
            System.out.println( "Title equals Practice" );
        } else {
            System.out.println( "Title doesnot equals Practices" );
        }//close
        driver.close();
    }
}
