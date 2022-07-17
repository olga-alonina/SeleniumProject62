package com.cydeo.utilities.utility_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogIn {
    public static void LogIn_CRM(WebDriver driver, String login, String password) throws InterruptedException {
        WebElement username = driver.findElement( By.name( "USER_LOGIN" ) );
        Actions actions = new Actions( driver );
        actions.doubleClick( username ).click( username ).perform();
        username.sendKeys(Keys.DELETE+login);
        Thread.sleep( 1000 );
        //password
        WebElement pass = driver.findElement( By.name( "USER_PASSWORD" ) );
        actions.doubleClick( pass ).click( pass ).perform();
        pass.sendKeys(Keys.DELETE+password);
        //login bt
        driver.findElement( By.xpath( "//input[@class=\"login-btn\"]" ) ).click();

        System.out.println( "login = " + login );
        System.out.println( "password = " + password );
    }
}
