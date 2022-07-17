package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByLinkText {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //navigate to google.com
        driver.get( "https://google.com" );
        //identify and save the About link element
        WebElement aboutLink = driver.findElement( By.linkText( "About" ) );

        //click on the link
        aboutLink.click();
        //close the browser
        driver.quit();
    }
}
