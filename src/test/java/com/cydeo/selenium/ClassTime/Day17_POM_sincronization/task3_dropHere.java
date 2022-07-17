package com.cydeo.selenium.ClassTime.Day17_POM_sincronization;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task3_dropHere {

    @Test
    public void dropHere() {
        Driver.getDriver().get( "https://practice.cydeo.com/drag_and_drop_circles " );
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        WebElement smallBall = Driver.getDriver().findElement( By.id( "draggable" ) );
        WebElement power = Driver.getDriver().findElement( By.cssSelector( "div[style=\"text-align: center;\"]" ) );

        //            3. Click and hold small circle
        Actions actions = new Actions( Driver.getDriver() );
        actions.clickAndHold(smallBall).moveToElement( power ).perform();
        //4. Verify "Drop here." text appears on big circle
        Assert.assertTrue(bigBall.getText().contains( "Drop here." ),"something go wrong, test FAILED");

    }
}
