package com.cydeo.selenium.ClassTime.Day17_POM_sincronization.libraryTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class errorMessage {

    //    TC #1: Required field error message test
//1- Open a chrome browser
//2- Go to: https://library1.cydeo.com
//            3- Do not enter any information
//4- Click to “Sign in” button
//5- Verify expected error is displayed:
//    Expected: This field is required.
//
//    NOTE: FOLLOW POM DESIGN PATTERN
    @Test
    public void ErrorMessage() {
        Driver.getDriver().get( "https://library1.cydeo.com" );
        //4- Click to “Sign in” button
        Driver.getDriver().findElement( By.cssSelector( "button[type='submit']")).click();

       String errorText =  Driver.getDriver().findElement( By.id( "inputEmail-error" ) ).getText();
        Assert.assertTrue(errorText.contains( "This field is required." ),"other message show up, Test Failed");
    }
}
