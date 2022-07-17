package com.cydeo.selenium.ClassTime.Day10_utility_windows;

import com.cydeo.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T01_Iframe_CRM_AppreciationTest extends TestBase {//todo check it near night
    //    1- Open a chrome browser
    @Test
    public void HomePage() {
        //2- Go to: https://login2.nextbasecrm.com/
        driver.get( " https://login2.nextbasecrm.com/" );
        // 3- Login Homepage ( Login with valid username and password)
        // login
        WebElement username = driver.findElement( By.name( "USER_LOGIN" ) );
        username.sendKeys( "hr40@cybertekschool.com" );
        //password
        WebElement password = driver.findElement( By.name( "USER_PASSWORD" ) );
        password.sendKeys( "UserUser123" );
        //loginButton
        WebElement loginBT = driver.findElement( By.cssSelector( "input[class='login-btn']" ) );
        loginBT.click();

        //4- Click the MORE tab and select APPRECIATION
        WebElement moreBT = driver.findElement( By.xpath( "//span[@class=\"feed-add-post-form-link-text\"]" ) );
        moreBT.click();
        WebElement appreciationBt = driver.findElement( By.xpath( "(//span[contains(@class,'menu-popup-item')])[1]" ) );
        appreciationBt.click();


        //5- Write an Appreciation message
        WebElement messInputWindow = driver.findElement( By.xpath( "//body[@contenteditable=\"true\"]" ) );
        Actions action = new Actions( driver );
        action.moveToElement( messInputWindow ).perform();
        messInputWindow.sendKeys( "Good morning EveryOne" );


        //6- Click the SEND button
        WebElement sendBt = driver.findElement( By.id( "blog-submit-button-save" ) );
        sendBt.click();
        //7- Verify the Appreciation message is displayed on    the feed
        WebElement confirmation = driver.findElement( By.xpath( "//div[.='Good morning EveryOne']" ) );
        Assertions.assertTrue( confirmation.isDisplayed(),"Message are not displayed, test FAILS" );


    }
}
