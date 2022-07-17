package com.cydeo.selenium.OH.OH_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class task3_homework {
    public static void main(String[] args) {
        //        DAY3- HOMEWORK1
//            TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = getWebDriver();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get( "https://login1.nextbasecrm.com/" );
//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMe_button = driver.findElement(
                By.xpath( "//label[.='Remember me on this computer']" ) );
        String actual_text = rememberMe_button.getText();
        String expect_text = "Remember me on this computer";
        System.out.println( "Verify “remember me” label text" );
        System.out.println( actual_text.equals( expect_text ) ? "Test Passed" : "Test Failed" );

//        4- Verify “forgot password” link text is as expected://        Expected: Forgot your password?
        WebElement forgot_password = driver.findElement( By.xpath( "//a[@class='login-link-forgot-pass']" ) );
        String actual_text1 = forgot_password.getText();
        String expect_text1 = "FORGOT YOUR PASSWORD?";
        System.out.println( "Verify “forgot password” link text" );
        System.out.println( actual_text1.equals( expect_text1 ) ? "Test Passed" : "Test Failed" );

//        5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String exp_attribute = "forgot_password=yes";
        System.out.println( "Verify “forgot password” href attribute’s value" );
        System.out.println( forgot_password.getAttribute( "href" ).contains( exp_attribute ) ? "Test Passed" : "Test Failed" );
        //close
        driver.quit();
    }
}
