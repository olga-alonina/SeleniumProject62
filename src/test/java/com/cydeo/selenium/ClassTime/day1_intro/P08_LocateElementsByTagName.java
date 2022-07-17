package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementsByTagName {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //navigate to https://practice.cydeo.com
        driver.get( "https://practice.cydeo.com" );
        //identify and save "Test Automation Practice" element
        WebElement text = driver.findElement( By.tagName("h1") );
        //print out text
        System.out.println(text.getText());
        //closing browser
        driver.quit();
    }
}
