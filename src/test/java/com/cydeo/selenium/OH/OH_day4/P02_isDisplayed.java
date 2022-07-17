package com.cydeo.selenium.OH.OH_day4;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class P02_isDisplayed extends TestBase {
    @Test
    public void isDisplayedText() {
        //go to the page http://practice.cydeo.com/registration_form
        driver.get("http://practice.cydeo.com/registration_form");
        //locate hidden text under first name
        String locator = "//small[.='first name must be more than 2 and less than 64 characters long']";
        WebElement hidden_text_error = driver.findElement( By.xpath( locator ) );
        //print text inside

        System.out.println( "hidden_text_error.isDisplayed()before add info in firstname = " + hidden_text_error.isDisplayed() );

        driver.findElement( By.name( "firstname" ) ).sendKeys( "a" );
        System.out.println("hidden_text_error= "+ hidden_text_error.getText() );
        System.out.println( "hidden_text_error.isDisplayed() = " + hidden_text_error.isDisplayed() );
    }

    @AfterMethod
    public void tearDownMethod() {
        //6.close
        driver.close();
    }
}
