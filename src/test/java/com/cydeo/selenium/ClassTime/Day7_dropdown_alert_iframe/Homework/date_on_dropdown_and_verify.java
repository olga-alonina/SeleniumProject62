package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class date_on_dropdown_and_verify {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //    1. Open Chrome browser
        driver = getDriver( "Chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get( "http://practice.cybertekschool.com/dropdown" );
    }

    @Test
    public void dateDropDownTest() {
        Select year = new Select( driver.findElement( By.id( "year" ) ) );
        Select month = new Select( driver.findElement( By.id( "month" ) ) );
        Select day = new Select( driver.findElement( By.id( "day" ) ) );
        //3. Select “December 1st, 1923” and verify it is selected.
        //  Select year using   : visible text
        year.selectByVisibleText( "1923" );
        //  Select month using    : value attribute Select
        month.selectByValue( "11" );
        // day using : index number
        day.selectByIndex( 0 );
        //verify that correct option was selected
        //year :1923, month: December, day: 1
        //actual
        String actual_year = year.getFirstSelectedOption().getText();
        String actual_month = month.getFirstSelectedOption().getText();
        String actual_day = day.getFirstSelectedOption().getText();
        //expected
        String expected_year = "1923";
        String expected_month = "December";
        String expected_day = "1";
        //verify
        Assert.assertEquals( actual_year, expected_year, "year was not chosen correctly" );
        Assert.assertEquals( actual_month, expected_month, "month was not chosen correctly" );
        Assert.assertEquals( actual_day, expected_day, "day was not chosen correctly" );
    }

    public void tearDownMethod() {
        driver.close();
    }

}
