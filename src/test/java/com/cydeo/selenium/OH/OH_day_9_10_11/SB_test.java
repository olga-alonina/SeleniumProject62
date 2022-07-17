package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SB_test {
    public SB_test() {
        Driver.getDriver().get( "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;
    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement login;
    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;


    @Test
    public void test() {
        //Fill form with following information
        // fullname : TEST
        username.sendKeys( "TEST" );
        // email    : TEST
        password.sendKeys( "TEST" );
        // Click Login Button
        login.click();
        Assert.assertEquals( errorMessage.getText(), "Invalid Login or Password." );
        Driver.getDriver().close();


//        - Verify error message equals "Invalid Login or Password."
    }
}
