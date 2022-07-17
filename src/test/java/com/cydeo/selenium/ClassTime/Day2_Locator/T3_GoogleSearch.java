package com.cydeo.selenium.ClassTime.Day2_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
/*1- Open a chrome browser
2- Go to: https://google.com/
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //Go to https://google.com/
        driver.get( "https://google.com/ " );
        //3- Write “apple” in search box
        WebElement search_word = driver.findElement( By.name( "q" ) );
        search_word.sendKeys( "apple" );

        Thread.sleep( 6000 );

        //4- Click google search button
        WebElement google_search = driver.findElement( By.name( "btnK" ) );
        google_search.click();
        // Verify title is:        // Expected: Title should start with “apple” word

        String actTitle = driver.getTitle();
        if (actTitle.startsWith( "apple" )) {
            System.out.println( "Tested title is correct" );
        } else {
            System.out.println( "Tested title is incorrect" );
        }

        //close the browser
        driver.quit();
    }


}
