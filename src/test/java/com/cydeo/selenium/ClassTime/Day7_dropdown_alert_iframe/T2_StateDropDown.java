package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class T2_StateDropDown {
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
    public void stateDropDownTest() {
        Select stateDropdown = new Select( driver.findElement( By.id( "state" ) ) );
        System.out.println( "stateDropdown.isMultiple() = " + stateDropdown.isMultiple() );
        // 3. Select Illinois selectByValue
        stateDropdown.selectByValue( "IL" );
        //4. Select Virginia selectByVisibleText
        stateDropdown.selectByVisibleText( "Virginia" );
        //5. Select California selectByIndex
        stateDropdown.selectByIndex( 5 );//cover with default start from 0
        //6. Verify   // 6a   Use all Select options. (visible text, value, index)
        String actual_state_option = stateDropdown.getFirstSelectedOption().getText();
        String expected_state_option = "California";//  6b  final selected option is California.
        Assert.assertEquals( actual_state_option, expected_state_option, "Selected option verification is failed" );

    }

    @Test
    public void Multi_Select_Dropdown_test() throws InterruptedException {
        //        3. Select all the options from multiple select dropdown.
        Select languages = new Select( driver.findElement( By.xpath( "//select[@name='Languages']" ) ) );
        System.out.println( "languages.isMultiple() = " + languages.isMultiple() );
        Thread.sleep( 3000 );
        languages.selectByValue( "java" );
        languages.selectByVisibleText( "C#" );
        languages.selectByIndex( 3 );
        // 4. Print out all selected values.
        List<WebElement> all_Options = languages.getOptions();

        for (WebElement each : all_Options) {
            each.click();
            Thread.sleep( 3000 );
            System.out.println( "languages=" + each.getText() );
            // 5. Deselect all values.
            Thread.sleep( 3000 );
            languages.deselectAll();
        }
    }
}
