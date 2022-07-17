package com.cydeo.selenium.ClassTime.Day2_Locator.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_and_Forth_Navigation {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get( "https://google.com " );
        //3- Click to Gmail from top right.
        WebElement gmail_button = driver.findElement(
                By.xpath( "//a[@href='https://mail.google.com/mail/&ogbl']" ));
        gmail_button.click();

        //4- Verify title contains://  Expected: Gmail
        String actual_title = driver.getTitle();
        if (actual_title.contains( "Gmail" )) {
            System.out.println( "Title contain Gmail" );
        } else {
            System.out.println( "Title doesnot contain Gmail" );
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals://  Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase( expectedTitle )) {
            System.out.println( "Title Google verification passed!" );
        } else {
            System.out.println( "Title Google verification failed!" );
        }

        driver.quit();
    }
}
