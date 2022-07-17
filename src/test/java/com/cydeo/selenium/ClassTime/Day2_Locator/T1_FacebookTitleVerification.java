package com.cydeo.selenium.ClassTime.Day2_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    /*TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - log in or sign up”*/
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //Go to https://www.facebook.com
        driver.get( "https://www.facebook.com" );
        // Verify title:
        //  Expected: “Facebook - log in or sign up”*/
        String expTitle = "Facebook - log in or sign up";
        String actTitle = driver.getTitle();
        if (actTitle.equals( expTitle )) {
            System.out.println( "Tittle is correct" );
        } else {
            System.out.println( "Title is incorrect" );
        }
        //close the browser
        driver.quit();
    }
}
