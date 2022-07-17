package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3- Make the page fullscreen
        driver.manage().window().maximize();

        driver.get( "https://www.yahoo.com" );

        // actual title comes from selenium
        String actualTitle = driver.getTitle();
        System.out.println( "Actual Title of Yahoo: " + actualTitle );
        // expected title comes from requirements
        String expectedTitle = "Yahoo";

        if (actualTitle.contains( expectedTitle )) {
            System.out.println( "Title verification is passed!" );
        } else {
            System.out.println( "Title verification is failed!" );
        }


        driver.quit();

    }
}

