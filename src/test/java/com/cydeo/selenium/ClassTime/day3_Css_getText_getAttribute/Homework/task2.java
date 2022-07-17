package com.cydeo.selenium.ClassTime.day3_Css_getText_getAttribute.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class task2 {
    public static void main(String[] args) {
        //        1- Open a Chrome browser
        WebDriver driver = getDriver( "chrome" );
        //        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get( "https://login1.nextbasecrm.com/?forgot_password=yes" );
        //        3- Enter incorrect username into login box:
        //3a catch login button
        WebElement login_button = driver.findElement(
                By.cssSelector( "div.login-item>input[name='USER_LOGIN']" ) );
        login_button.sendKeys( "incorrect" + Keys.ENTER );
        //        4- Click to `Reset password` button
        WebElement reset_password_button = driver.findElement(
                By.cssSelector( "div.log-popup-footer>button.login-btn" ) );
        reset_password_button.click();
        //        5- Verify “error” label is as expected: "Login or E-mail not found"
        WebElement error_label = driver.findElement( By.cssSelector( "div.errortext" ) );
        String nameTest = "Verify “error” label is as expected ";
        String exp_text = "Login or E-mail not found";
        String actual_text = error_label.getText();
        if (actual_text.equals( exp_text )) {
            System.out.println( nameTest + " test passed" );
        } else {
            System.out.println( nameTest + "test failed" );
        }
        //close
        driver.close();
    }
}
