package com.cydeo.selenium.OH.OH_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class GetAttribute {
    public static void main(String[] args) {
        //      1- Open a chrome browser
        WebDriver driver = getWebDriver();
        //        2- Go to: https://practice.cydeo.com/
        driver.get( "https://practice.cydeo.com/" );
        //      3- Click Registration Form
        WebElement registration = driver.findElement( By.cssSelector("a[href='/registration_form']"));
        registration.click();
        //	4- Verify following fields has these default values
        //	- First name ---> first name
        WebElement first_name = driver.findElement( By.cssSelector( "input[name='firstname']" ) );
        String exp_result = "first name";
        String actual_result = first_name.getAttribute("placeholder");
        String test_name = "First name ";
        if(actual_result.equals( exp_result )){
            System.out.println(test_name+"passed");
        }else{
            System.out.println(test_name+"failed");
        }
//			- Last name  ---> last name
        WebElement last_name = driver.findElement( By.cssSelector( "input[name='lastname']" ) );
        String exp_result1 = "last name";
        String actual_result1 = last_name.getAttribute("placeholder");
        String test_name1 = "Last name ";
        if(actual_result1.equals( exp_result1 )){
            System.out.println(test_name1+"passed");
        }else{
            System.out.println(test_name1+"failed");
        }

//			- Username   ---> username
        WebElement username = driver.findElement( By.cssSelector( "input[name='username']" ) );
        String exp_result2 = "username";
        String actual_result2 = username.getAttribute("placeholder");
        String test_name2 = "Username ";
        if(actual_result2.equals( exp_result2 )){
            System.out.println(test_name2+"passed");
        }else{
            System.out.println(test_name+"failed");
        }
        //close
        driver.close();
}
}
