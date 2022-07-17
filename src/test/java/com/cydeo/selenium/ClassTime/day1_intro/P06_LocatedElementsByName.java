package com.cydeo.selenium.ClassTime.day1_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P06_LocatedElementsByName {
    public static void main(String[] args) {
        WebDriver driver = getWebDriver();
        //navigate to google
        driver.get( "https://google.com" );
        //identify and save the search box element
        WebElement searchBox = driver.findElement( By.name("q") );
        //enter text "Selenium" and search for it
        searchBox.sendKeys( "selenium"+ Keys.ENTER );
        //close browser
        driver.quit();
    }
}
