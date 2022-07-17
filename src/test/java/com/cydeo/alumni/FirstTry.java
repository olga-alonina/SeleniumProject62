package com.cydeo.alumni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;
import static com.cydeo.utilities.utility_driver.verify_title.verify_title_with_containMethods;
import static com.cydeo.utilities.utility_driver.verify_title.verify_title_with_equalMethod;

public class FirstTry {
    public static void main(String[] args) {
        //1. correct log/pass
        WebDriver driver = getWebDriver();//creating an object
        //2. Go to https://login2.nextbasecrm.com/
        driver.get( "http://login2.nextbasecrm.com/" );
        //3. verify authorization page
        verify_title_with_equalMethod( driver, "Authorization" );
        //4.Checking correct username and password
        check_correct_login_and_password( driver );//test case#1
        //5.dropoff menu
        Loging_Out( driver );
        //6.Checking incorrect username and password
        check_wrong_credential( driver );//test case#2
        //close
        driver.close();
    }

    public static void Loging_Out(WebDriver driver) {
        WebElement dropOff_menu = driver.findElement( By.id( "user-block" ) );
        dropOff_menu.click();
        WebElement log_out = driver.findElement(
                By.cssSelector( "a[href^=\"/auth/?logout\"] " ) );
        log_out.click();
    }

    public static void check_correct_login_and_password(WebDriver driver) {
        //1.find username element
        WebElement username = driver.findElement( By.name( "USER_LOGIN" ) );
        Actions actions = new Actions( driver );
        actions.doubleClick( username ).sendKeys( "helpdesk40@cybertekschool.com" );

        //2.find password element
        WebElement password = driver.findElement( By.name( "USER_PASSWORD" ) );
        actions.doubleClick( password ).sendKeys( "UserUser" );
        //3.find login_button and click
        WebElement login_button = driver.findElement( By.className( "login-btn" ) );
        login_button.click();
        //4.verify title //should contain "Portal"
        verify_title_with_containMethods( driver,"Portal" , "EULA");

    }

    public static void check_wrong_credential(WebDriver driver) {
        WebElement username = driver.findElement( By.name( "USER_LOGIN" ) );
        username.sendKeys( "lalala" );
        //find password element
        WebElement password = driver.findElement( By.name( "USER_PASSWORD" ) );
        password.sendKeys( "lalala" );
        //find login_button and click
        WebElement login_button = driver.findElement( By.className( "login-btn" ) );
        login_button.click();
        //verify title //should contain "Authorization"
        String actTitle = driver.getTitle();
        if (actTitle.contains( "Authorization" )) {
            System.out.println( "(Incorrect log/pass):Tested title is correct" );
        } else {
            System.out.println( "(Incorrect log/pass):Tested title is incorrect" );
        }
    }
}
