package com.cydeo.selenium.ClassTime.Day17_POM_sincronization.libraryTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class invalidEmail {
    //    TC #2: Invalid email format error message test
    @Test
    public void invalidEmail() {
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get( "https://library1.cydeo.com" );
        //locate login,send wrong email
        Driver.getDriver().findElement( By.id( "inputEmail" ) ).sendKeys( "Alohomora" );
        // Click to “Sign in” button
        Driver.getDriver().findElement( By.cssSelector( "button[type='submit']" ) ).click();
        //4- Verify expected error is displayed:
        String errorText = Driver.getDriver().findElement( By.id( "inputEmail-error" ) ).getText();
        //    Expected: Please enter a valid email address.
        Assert.assertTrue( errorText.contains( "Please enter a valid email address." ), "other message show up, Test Failed" );
        Driver.getDriver().close();
    }
}

