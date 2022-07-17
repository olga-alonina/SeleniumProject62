package com.cydeo.selenium.ClassTime.Day17_POM_sincronization.libraryTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class incorrectEmail {
    @FindBy(id = "inputEmail")
    public WebElement login;
    @FindBy(css = "button[type='submit']")
    public WebElement sign_in_button;
    @FindBy(css="div[class='alert alert-danger']")
    public WebElement error;

    public incorrectEmail() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @Test
    public void test() {
        login.sendKeys( "Alohomora@alohomora" );
        sign_in_button.click();
        //4- Verify expected error is displayed:
        String errorText = error.getText();
        //    Expected: Please enter a valid email address.
        Assert.assertTrue( errorText.contains( "Sorry, Wrong Email or Password" ), "other message show up, Test Failed" );
        Driver.getDriver().close();
    }
}
