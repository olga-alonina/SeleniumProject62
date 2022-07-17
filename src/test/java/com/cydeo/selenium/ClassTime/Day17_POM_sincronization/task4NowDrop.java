package com.cydeo.selenium.ClassTime.Day17_POM_sincronization;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task4NowDrop {
    //    TC #4: Cydeo Practice Drag and Drop Test
    @Test
    public void now_drop() {
        Driver.getDriver().get( "https://practice.cydeo.com/drag_and_drop_circles " );
        //3. Click and hold small circle
        WebElement smallBall = Driver.getDriver().findElement( By.id( "draggable" ) );
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        Actions actions = new Actions( Driver.getDriver() );
        // 4.Move it on top of the big circle
        actions.clickAndHold( smallBall ).moveToElement( bigBall ).perform();
        // 5. Verify “Now drop...” text appears on big circle
        Assert.assertTrue( bigBall.getText().contains( "Now drop..." ), "something go wrong, test FAILED" );
    }
}
