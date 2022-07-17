package com.cydeo.selenium.ClassTime.day3_Css_getText_getAttribute.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class task1 {
    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = getDriver( "chrome" );
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get( "https://login1.nextbasecrm.com/" );
        //3- Verify “remember me” label text is as expected:
        //3a catch remember me button     //Expected: Remember me on this computer
        WebElement remember_me_button = driver.findElement(
                By.cssSelector( "label.login-item-checkbox-label" ) );
        String exp_text = "Remember me on this computer";
        String actual_text = remember_me_button.getText();
        String nameTest = "Verify “remember me” label text ";
        if (actual_text.equals( exp_text )) {
            System.out.println( nameTest + "test passed" );
        } else {
            System.out.println( nameTest + "test failed" );
        }
        //4- Verify “forgot password” link text is as expected:
        //Expected:FORGOT YOUR PASSWORD?
        WebElement forgot_password = driver.findElement( By.cssSelector(
                "a.login-link-forgot-pass" ) );
        String exp_text1 = "FORGOT YOUR PASSWORD?";
      // String actual_text1 = forgot_password.getAttribute( "text" );
        String actual_text1 = forgot_password.getText();
        System.out.println(actual_text1);
        String nameTest1 = "Verify “FORGOT YOUR PASSWORD?” link text ";
        if (actual_text1.equals( exp_text1 )) {
            System.out.println( nameTest1 + "test passed" );
        } else {
            System.out.println( nameTest1 + "test failed" );
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        WebElement forgot_password1 = driver.findElement( By.cssSelector( "a.login-link-forgot-pass" ) );
        String exp_text2 = "forgot_password=yes";
        String actual_text2 = forgot_password1.getAttribute( "href" );
        String nameTest2 = "Verify “forgot password” href attribute’s value contains ";
        if (actual_text2.contains( exp_text2 )) {
            System.out.println( nameTest2 + "test passed" );
        } else {
            System.out.println( nameTest2 + "test failed" );
        }
        //close
        driver.close();
    }
}
