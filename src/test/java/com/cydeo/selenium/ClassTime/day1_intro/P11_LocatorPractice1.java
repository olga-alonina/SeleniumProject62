package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorPractice1 {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
//navigate to https://app.vytrack.com/user/login
        driver.get( "https://app.vytrack.com/user/login" );
        //enter username provided : "abcd"
        WebElement username = driver.findElement( By.id( "prependedInput" ) );
        username.sendKeys( "abcd" );
        //enter password provided : "abcd"
        WebElement password = driver.findElement( By.id( "prependedInput2" ) );
        password.sendKeys( "abcd" );

        //click on Login button
        WebElement logInButton = driver.findElement( By.id( "_submit" ) );
        logInButton.click();

        //verify the message "Invalid username or password"
        WebElement alert = driver.findElement( By.className( "alert" ) );
        if (alert.getText().equals( "Invalid user name or password." )) {
            System.out.println( "Message is passed" );
        } else {
            System.out.println( "Message Failed " );
        }

        //verify url contains "vytrack"
        String actual_url = driver.getCurrentUrl();
        if (actual_url.contains( "vytrack" )) {
            System.out.println( "URL is passed" );
        } else {
            System.out.println( "URL Failed" );
        }
        driver.findElement( By.partialLinkText( "Forgot" ) ).click();


        //verify title is "Forgot Password"
        if (driver.getTitle().equals( "Forgot Password" )) {
            System.out.println( "Tittle is correct" );
        } else {
            System.out.println( "Title is incorrect" );
        }
        //close the browser
        driver.quit();
    }
}

