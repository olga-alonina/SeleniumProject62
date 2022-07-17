package com.cydeo.selenium.ClassTime.day3_Css_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        /*TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
 3- Verify “Reset password” button text is as expected:
Expected: Reset password*/

        // 1- Open a Chrome browser
        WebDriver driver = getDriver( "chrome" );
        driver.manage().window().maximize();
        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get( "https://login1.nextbasecrm.com/?forgot_password=yes" );
        //3  Verify “Reset password” button text is as expected:
        String nameTest = "Verify “Reset password” button ";
        WebElement reset_password_button = driver.findElement( By.cssSelector( "button.login-btn" ));//button[value ='Reset password']
        String actual_text = reset_password_button.getAttribute( "value" );
        String expect_text = "Reset password";
        if (actual_text.equals( expect_text )) {
            System.out.println( nameTest + "test passed" );
        } else {
            System.out.println( nameTest + "test failed" );
        }
        //4 close
        driver.close();
    }
}
