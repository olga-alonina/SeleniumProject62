package com.cydeo.selenium.ClassTime.Day2_Locator.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_locator_practice_Cydeo {
    public static void main(String[] args) {
        //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //  2- Go to: https://practice.cydeo.com/inputs
        driver.get( "https://practice.cydeo.com/inputs" );
//        3- Click to “Home” link
        WebElement home_element = driver.findElement( By.className( "nav-link" ) );
        home_element.click();
//        4- Verify title is as expected: //        Expected: Practice
//       PS: Locate “Home” link using “className” locator
        String expected_title = "Practice";
        String actTitle = driver.getTitle();
        if (actTitle.equals( expected_title )) {
            System.out.println( "Tested title for Practice/Cydeo is correct" );
        } else {
            System.out.println( "Tested title for Practice/Cydeo  is incorrect" );
        }
        //close the browser
        driver.quit();
    }
}

