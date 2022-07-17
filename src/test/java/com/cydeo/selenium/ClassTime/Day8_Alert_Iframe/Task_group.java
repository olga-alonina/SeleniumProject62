package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;
import static com.cydeo.utilities.utility_driver.LogIn.LogIn_CRM;

public class Task_group {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getWebDriver();
        driver.get( "https://login2.nextbasecrm.com" );
        LogIn_CRM( driver, "hr39@cybertekschool.com", "UserUser" );

        WebElement message = driver.findElement( By.id( "feed-add-post-form-tab-message" ) );
        message.click();

        Actions actions = new Actions( driver );
        Thread.sleep( 2000 );
        actions.sendKeys( "As a human resource person I can send message" ).perform();
        Thread.sleep( 2000 );
        WebElement sendButton = driver.findElement( By.id( "blog-submit-button-save" ) );
        sendButton.click();

    }
}
//SBPEFullForm.getInstance()
//divoPostFormLHE_blogPostForm
//BXHtmlEditor