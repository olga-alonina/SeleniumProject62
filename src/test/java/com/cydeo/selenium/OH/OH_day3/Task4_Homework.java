package com.cydeo.selenium.OH.OH_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class Task4_Homework {
    public static void main(String[] args) {
//        DAY3- HOMEWORK2
//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver = getWebDriver();
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get( "https://login1.nextbasecrm.com/?forgot_password=yes" );
//        3- Enter incorrect username into login box:
        WebElement login_box = driver.findElement( By.xpath( "//input[@name=\"USER_LOGIN\"]" ) );
        login_box.sendKeys( "login" );
//        4- Click to `Reset password` button
        WebElement reset_password = driver.findElement( By.xpath( "//button[@value=\"Reset password\"]" ) );
        reset_password.click();
//        5- Verify “error” label is as expected //        Expected: Login or E-mail not found
        WebElement error_text = driver.findElement( By.xpath( "//div[@class=\"errortext\"]" ) );
        String exp_text = "Login or E-mail not found";
        String actual_text = error_text.getText();
        System.out.println( "Verify “error” label" );
        System.out.println( actual_text.equals( exp_text ) ? "Test Passed" : "Test Failed" );
        //close
        driver.quit();


    }
}
