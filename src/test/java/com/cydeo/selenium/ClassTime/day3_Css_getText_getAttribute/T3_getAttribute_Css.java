package com.cydeo.selenium.ClassTime.day3_Css_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class T3_getAttribute_Css {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a Chrome browser
        WebDriver driver = getDriver("chrome");
//2- Go to: https://login1.nextbasecrm.com/
        driver.get( "https://login1.nextbasecrm.com/" );
//3- Verify “ Log in” button text is as expected: Expected: Log In*/
        WebElement login_button = driver.findElement( By.cssSelector( "input[class='login-btn']" ) );
        String nameTest = "Verify “Log in” button text ";
        String actual_text = login_button.getAttribute( "value" );
        String exp_text = "Log In";
        if (actual_text.equals( exp_text )) {
            System.out.println( nameTest + "test is passed" );
        } else {
            System.out.println( nameTest + "test is failed" );
        }//close
        driver.quit();
    }
}
