package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class Confirmation_Alert_Practice {
    //    TC #2: Confirmation alert practice
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //    1. Open Chrome browser
        driver = getDriver( "Chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );

        //2. Go to http://practice.cydeo.com/javascript_alerts
        driver.get( "http://practice.cydeo.com/javascript_alerts" );
    }

    @Test
    public void click_for_JS_Confirm() throws InterruptedException {
        // 3. Click to “Click for JS Confirm” button
        WebElement click_for_JS_ConfirmBT = driver.findElement( By.xpath( "//button[@onclick='jsConfirm()']" ) );
        click_for_JS_ConfirmBT.click();
        Thread.sleep( 3000 );
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep( 3000 );
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement result = driver.findElement( By.id( "result" ) );
        String expected_result = "You clicked: Ok";
        String actual_result = result.getText();
        Assert.assertEquals( actual_result, expected_result, "Verification after click did not pass, message incorrect" );
    }

    @AfterMethod
    public void tearDownMethod() {
        //6.close
        driver.close();
    }
}
