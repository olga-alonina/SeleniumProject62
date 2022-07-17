package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class P16_LocatingDropDownList {
    public static void main(String[] args) {
        WebDriver driver = getDriver( "chrome" );
        //1.navigate to page https://practice.cydeo.com/dropdown
        driver.get( "https://practice.cydeo.com/dropdown" );
        //2.identify web element dropdown
        WebElement dropdown = driver.findElement( By.id( "dropdown" ) );
        //3.wrap this element into select option
        Select obj = new Select( dropdown );
        //3a use ready method for select options
        obj.selectByIndex( 2 );
        obj.selectByValue( "2" );
        obj.selectByVisibleText( "Option 2" );
        //4.verify determine option was selected
        String expected_option = "Option 2";
        String actual_option = obj.getFirstSelectedOption().getText();
        Assert.assertEquals( actual_option, expected_option, "Text is displaying incorrectly" );

        //5.close
        driver.close();


    }
}
