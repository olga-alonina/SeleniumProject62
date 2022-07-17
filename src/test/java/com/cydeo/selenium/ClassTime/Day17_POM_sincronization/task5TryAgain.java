package com.cydeo.selenium.ClassTime.Day17_POM_sincronization;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task5TryAgain {
    //    TC #5: Cydeo Practice Drag and Drop Test
//3. Click and hold small circle
//4. Dropped anywhere outside of big circle
//5. Verify “Try again!” text appears on big circle
    @Test
    public void tryAgain() {
        Driver.getDriver().get( "https://practice.cydeo.com/drag_and_drop_circles " );
        //3. Click and hold small circle
        WebElement smallBall = Driver.getDriver().findElement( By.id( "draggable" ) );
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        WebElement power = Driver.getDriver().findElement( By.cssSelector( "div[style=\"text-align: center;\"]" ) );
        Actions actions = new Actions( Driver.getDriver() );
        actions.dragAndDrop( smallBall,power ).perform();
        Assert.assertTrue( bigBall.getText().contains(  "Try again!"),"something go wrong, test FAILED" );
    }
}
