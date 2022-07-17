package com.cydeo.selenium.OH.OH_day4;

import com.cydeo.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MoneyGaming extends TestBase {
    //    TC: Etsy checkbox and radio button
    @Test
    public void join_Now() throws InterruptedException {
        //1. Go to https://moneygaming.qa.gameaccount.com/
        driver.get( "https://moneygaming.qa.gameaccount.com/ " );

//        2. Click the JOIN NOW button to open the registration page
        WebElement join_now = driver.findElement( By.xpath( "//a[@class='newUser green']" ) );
        join_now.click();
//        3. Select a title value from the dropdown
        WebElement title = driver.findElement( By.id( "title" ) );
        Select obj = new Select( title );
        obj.selectByVisibleText( "Ms" );

//        4. Enter your first name and surname in the form
        WebElement firstName = driver.findElement( By.id( "forename" ) );
        firstName.sendKeys( "Amazing" );
        WebElement lastname = driver.findElement( By.name( "map(lastName)" ) );
        lastname.sendKeys( "Woman" );

//        5. Check the tickbox with text "I accept the Terms and Conditions and certify that
//        I am over the age of 18.
        WebElement over18 = driver.findElement( By.id( "checkbox" ) );
        over18.click();
//        6. Submit the form by clicking the JOIN NOW button
        WebElement submit = driver.findElement( By.id( "form" ) );
        submit.click();
//        7. Validate that a validation message with text "This field is required" appears under
//        the date of birth box
        WebElement error_message = driver.findElement( By.xpath( "//label[@for=\"dob\"]" ) );
        Assertions.assertTrue( error_message.isDisplayed() );

    }

    @AfterMethod
    public void tearDownMethod() {
        //6.close
        driver.close();
    }
}
