package com.cydeo.selenium.ClassTime.Day17_POM_sincronization;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class anotherDrag_andDrop {
    //    1. Open a chrome browser
//2. Go to:
//    https://practice.cydeo.com/drag_and_drop_circles
//            3. Click and hold small circle
//4. Move it on top of the big circle
//5. And release on it.
//            6. Verify “You did great!” text appears on big circle
    @Test
    public void practiceDrag_and_drop() {
        //1. Open a chrome browser
        //2. Go to: https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get( "https://practice.cydeo.com/drag_and_drop_circles " );
        //3. Click and hold small circle
        WebElement smallBall = Driver.getDriver().findElement( By.id( "draggable" ) );
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        Actions actions = new Actions( Driver.getDriver() );
        actions.clickAndHold( smallBall ).pause( 1000 ).
                moveToElement( bigBall ).pause( 1000 ).release().perform();
        Assert.assertTrue( bigBall.getText().contains( "You did great!" ), "something go wrong, test FAILED" );
        Driver.getDriver().close();
    }

}
