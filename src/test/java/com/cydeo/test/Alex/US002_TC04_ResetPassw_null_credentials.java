package com.cydeo.test.Alex;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.cydeo.test.alumni.utilities.Driver_TestBase.getWebDriver.getWebDriver;
import static com.cydeo.test.alumni.utilities.utility_driver.verify_title.verify_title_with_equalMethod;

public class US002_TC04_ResetPassw_null_credentials {
    // WebElement email_button = driver.findElement(
    //                    By.xpath( "//input[@name='USER_EMAIL']" ));
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

        // Then input the null username
        //6 Creating data for checking
        WebElement login_button = driver.findElement(
                By.cssSelector( "div.login-item>input[name='USER_LOGIN']" ) );
        //  And clicking on the button: Reset Password
        Actions actions = new Actions( driver );
        actions.doubleClick( login_button ).click( login_button ).perform();
        login_button.sendKeys( "" + Keys.TAB + Keys.TAB + Keys.TAB + Keys.ENTER );
        WebElement note_text = driver.findElement( By.cssSelector( "div.errortext" ) );
        String exp_text = "Login or E-mail not found";
        String actial_text = note_text.getText();
        String test_name = "Empty username ";
        if (actial_text.contains( exp_text )) {
            System.out.println( test_name+"note text  verification PASSED" );
        } else {
            System.out.println( test_name+"note text verification FAILED" );
        }
        //6a return to prev page
        driver.navigate().back();
        //7  Then input the null email
        //Creating data for checking
        WebElement email_button = driver.findElement(By.xpath( "//input[@name='USER_EMAIL']" ));
        //  And clicking on the button: Reset Password
        Actions actions1 = new Actions( driver );
        actions1.doubleClick( email_button ).click( email_button ).perform();
        email_button.sendKeys( "" + Keys.TAB + Keys.TAB + Keys.ENTER );
        WebElement note_text1 = driver.findElement( By.cssSelector( "div.errortext" ) );
        String exp_text1 = "Login or E-mail not found";
        String actial_text1 = note_text1.getText();
        String test_name1 = "Empty email ";
        if (actial_text1.contains( exp_text1 )) {
            System.out.println( test_name1+"note text  verification PASSED" );
        } else {
            System.out.println( test_name1+"note text verification FAILED" );
        }//8 close
        driver.close();
}
}
