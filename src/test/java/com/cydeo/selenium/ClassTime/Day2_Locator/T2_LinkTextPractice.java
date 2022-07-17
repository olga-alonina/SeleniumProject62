package com.cydeo.selenium.ClassTime.Day2_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {
        /*1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //Go to https://www.facebook.com
        driver.get( "https://practice.cydeo.com" );
        //identify and save the About link element
        WebElement A_B_Testing = driver.findElement( By.linkText( "A/B Testing" ) );
        A_B_Testing.click();
        // Verify title is:        // Expected: No A/B Test
        String expTitle = "No A/B Test";
        String actTitle = driver.getTitle();
        if (actTitle.equals( expTitle )) {
            System.out.println( "No A/B Testing title is correct" );
        } else {
            System.out.println( "A/B Testing title is incorrect" );
        }
        //   Go back to home page by using the .back();
        driver.navigate().back();
//        Verify title equals:
//        Expected: Practice
         expTitle = "Practice";
         actTitle = driver.getTitle();
        if (actTitle.equals( expTitle )) {
            System.out.println( "Practice title is correct" );
        } else {
            System.out.println( "Practice title is incorrect" );
        }
        //close the browser
        driver.quit();
    }
}

