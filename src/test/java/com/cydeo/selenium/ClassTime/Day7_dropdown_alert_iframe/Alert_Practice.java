package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class Alert_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //    1. Open Chrome browser
        driver = getDriver( "Chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );

        //. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get( "http://practice.cydeo.com/javascript_alerts " );
    }

    @Test
    public void Information_Alert_Test() {
        // 3. Click to “Click for JS Alert” button
        WebElement JS_Alert_button = driver.findElement( By.xpath( " //button[@onclick='jsAlert()']" ) );
        JS_Alert_button.click();
        // 4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // 5. Verify “You successfully clicked an alert” text is displayed.
        WebElement result_text = driver.findElement( By.id( "result" ) );
        Assert.assertTrue( result_text.isDisplayed() );
        String actual_result = result_text.getText();
        String expect_result = "You successfully clicked an alert";

        Assert.assertEquals(  actual_result,expect_result,"Text is not displayed correctly" );
    }


}
