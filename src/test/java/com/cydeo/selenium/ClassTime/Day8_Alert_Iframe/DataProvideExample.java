package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;
import static org.testng.AssertJUnit.assertEquals;

public class DataProvideExample {
    WebDriver driver;

    @Test(dataProvider = "searchData")
    public void test1(String keyword,String expected_title) {
        driver = getDriver( "Chrome" );
        driver.get( "https://google.com" );
        WebElement search_box = driver.findElement( By.xpath( "//input[@class='gLFyf gsfi']"));
        search_box.sendKeys( keyword + Keys.ENTER );
        assertEquals( driver.getTitle(), expected_title );
        driver.quit();
    }
    @DataProvider(name ="searchData")
    public Object[][]testData(){
        return new Object[][]{
                {"selenium","selenium - Google Search"},
                {"java","java - Google Search"},
                {"job","job - Google Search"},
                {"cydeo","cydeo - Google Search"},
        };
    }
}
