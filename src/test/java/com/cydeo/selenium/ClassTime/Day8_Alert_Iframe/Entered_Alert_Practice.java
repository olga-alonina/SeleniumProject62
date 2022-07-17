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

public class Entered_Alert_Practice {
    //    TC #3: Information alert practice
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
    public void Click_for_JS_Prompt() throws InterruptedException {
        //3. Click to “Click for JS Prompt” button
        WebElement click_for_JS_PromptBT = driver.findElement( By.xpath( "//button[@onclick='jsPrompt()']" ) );
        click_for_JS_PromptBT.click();
        Thread.sleep( 3000 );
        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys( "hello" );
        //5. Click to OK button from the alert
        alert.accept();
        //6. Verify “You entered:  hello” text is displayed.
        WebElement result = driver.findElement( By.id( "result" ) );
        String expected_result = "You entered: hello";
        String actual_result = result.getText();
        Assert.assertEquals( actual_result, expected_result, "Text performed incorrectly" );
    }

    @AfterMethod
    public void tearDownMethod() {
        //6.close
        driver.close();
    }
}

