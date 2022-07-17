package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByCSS {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //navigate to google.com
        driver.get( "https://google.com" );
        //search for cydeo
        WebElement searchLine = driver.findElement( By.cssSelector("input[name='q']"));
        searchLine.sendKeys( "cydeo"+ Keys.ENTER );

        //verify Cydeo  linkText ia appeared in the results
        WebElement cydeoText = driver.findElement( By.cssSelector("a[href = 'https://cydeo.com/']>h3"));
        if(cydeoText.getText().equals( "Cydeo" )){
            System.out.println("Cydeo text test is passed");
        }else{
            System.out.println("Cydeo text test is failed");
        }
        //close browser
        driver.quit();
    }
}
