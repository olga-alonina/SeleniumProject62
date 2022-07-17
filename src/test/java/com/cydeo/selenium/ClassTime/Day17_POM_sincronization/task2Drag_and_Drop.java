package com.cydeo.selenium.ClassTime.Day17_POM_sincronization;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task2Drag_and_Drop {
    //    TC #2: Cydeo Practice Drag and Drop Test


//            Expected = "Drag the small circle here."
    @Test
    public void practiceDrag_and_drop() {
        Driver.getDriver().get( "https://practice.cydeo.com/drag_and_drop_circles " );
        //            3. Verify expected default text appears on big circle
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        Assert.assertTrue(bigBall.getText().contains("Drag the small circle here."  ),"something go wrong, test FAILED");

    }
}
