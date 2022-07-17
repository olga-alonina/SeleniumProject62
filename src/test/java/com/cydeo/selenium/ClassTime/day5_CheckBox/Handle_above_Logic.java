package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class Handle_above_Logic {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = getDriver( "chrome" );
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get( " https://practice.cydeo.com/radio_buttons " );
        clickAndVerifyRadioButton( driver,"//input[@name= 'sport']" );
        //4.close
        driver.close();
    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String attribute) {
        List<WebElement> list = driver.findElements( By.xpath( attribute) );
        for (WebElement eachButton : list) {
            eachButton.click();
            System.out.println( "Verify Radio Button = " + eachButton.isSelected() );
        }
    }
}
//        Create a utility method to handle above logic.
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver
//        2. Name attribute as String (for providing which group of radio buttons)
//        3. Id attribute as String (for providing which radio button to be clicked)
//        Method should loop through the given group of radio buttons. When it finds the
//        matching option, it should click and verify option is Selected.
//                Print out verification: true
