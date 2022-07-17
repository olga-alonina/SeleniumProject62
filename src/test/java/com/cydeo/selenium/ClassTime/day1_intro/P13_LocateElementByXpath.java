package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByXpath {
    public static void main(String[] args) {
        // setting up chrome and create webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //makes window maximized
        driver.manage().window().maximize();
        //navigate to google.com
        driver.get( "https://google.com" );
        //search for cydeo
        WebElement searchLine = driver.findElement( By.xpath("//input[@name='q']"));
        searchLine.sendKeys( "cydeo"+ Keys.ENTER );

        //verify Cydeo  linkText ia appeared in the results
        WebElement cydeoText = driver.findElement( By.xpath("//h3[.='Cydeo']"));
        if(cydeoText.getText().equals( "Cydeo" )){
            System.out.println("Cydeo text is appeared");
        }else{
            System.out.println("Cydeo text did not appear");
        }
        //close browser
        driver.quit();
    }
}

