package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_LocateElementsByClassname {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //navigate to google
        driver.get( "https://google.com" );
        //identify and save the "helpfulText" element
        WebElement helpfulText = driver.findElement( By.className("NKcBbd") );
        //verify the element text appear correctly
        checkTitle( helpfulText );
        //close the browser
driver.quit();
    }

    public static void checkTitle(WebElement helpfulText) {
        if(helpfulText.getText().equals( "learn about the hidden dangers and how to help save lives" )){
            System.out.println("Text appear correctly");
        }else{
            System.out.println("Text does not appear correctly");
        }
    }
}
