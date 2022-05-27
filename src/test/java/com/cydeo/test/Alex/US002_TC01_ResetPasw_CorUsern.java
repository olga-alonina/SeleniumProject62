package com.cydeo.test.Alex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;

import static com.cydeo.test.alumni.utilities.Driver_TestBase.getWebDriver.getWebDriver;
import static com.cydeo.test.alumni.utilities.utility_driver.verify_title.verify_title_with_equalMethod;

public class US002_TC01_ResetPasw_CorUsern {
    //
//     * USER STORY 002 - Reset Password Functionality
//     *
//     *  Test Cases 01
//     *      Reset Password by using Correct Username
//     *
//     *      Given I am on Authorization Page
    public static void main(String[] args) {
        //1. creating webdriver
        WebDriver driver = getWebDriver();//creating an object
        //2. Go to https://login2.nextbasecrm.com/
        driver.get( "http://login2.nextbasecrm.com/" );
        //3. verify authorization page
        verify_title_with_equalMethod( driver, "Authorization" );

        // When clicking on the link: Forgot Your Password
        //4 find element
        WebElement forgot_password_button = driver.findElement( By.cssSelector( "div.log-popup-footer>a.login-link-forgot-pass" ) );
        forgot_password_button.click();
        // And navigating to page: Get Password
        //5 verify page
        verify_title_with_equalMethod( driver, "Get Password" );

        // Then input the Correct username
        //6 Creating data for checking
        ArrayList<String> listUsernames = new ArrayList<>( Arrays.asList( "helpdesk40@cybertekschool.com", "helpdesk39@cybertekschool.com", "marketing39@cybertekschool.com", "marketing40@cybertekschool.com", "hr39@cybertekschool.com", "hr40@cybertekschool.com" ) );
        for (String each : listUsernames) {
            WebElement login_button = driver.findElement(
                    By.cssSelector( "div.login-item>input[name='USER_LOGIN']" ) );
            //  And clicking on the button: Reset Password
            Actions actions = new Actions( driver );
            actions.doubleClick( login_button ).click( login_button ).perform();
            login_button.sendKeys( Keys.DELETE );
            login_button.sendKeys( each + Keys.TAB + Keys.TAB + Keys.TAB + Keys.ENTER );
            // Then should see note: A code to reset your password...
            //7. verify text with contain
            WebElement note_text = driver.findElement( By.cssSelector( "div.notetext" ) );
            String exp_text = "A code to reset your password";
            String actial_text = note_text.getText();
            if (actial_text.contains( exp_text )) {
                System.out.println( "note text verification PASSED" );
            } else {
                System.out.println( "note text verification FAILED" );
            }
            //return to prev page
            driver.navigate().back();
        }//8 . close
        driver.close();
    }
}


