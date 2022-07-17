package com.cydeo.selenium.ClassTime.Day12_Actions;

import com.cydeo.utilities.utility_driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_and_Drop {

    @Test
    public void drag_and_Drop_Test() {
        Driver.getDriver().get( "https://demos.telerik.com/kendo-ui/dragdrop/index" );
        WebElement smallBall = Driver.getDriver().findElement( By.id( "draggable" ) );
        WebElement bigBall = Driver.getDriver().findElement( By.id( "droptarget" ) );
        Actions actions = new Actions( Driver.getDriver() );
//        System.out.println( "First way with drag and drop" );
//        actions.dragAndDrop( smallBall, bigBall ).perform();

        System.out.println( "Second way with move to element" );
        actions.moveToElement( smallBall ).pause( 1000 ).clickAndHold().pause( 1000 ).
                moveToElement( bigBall ).pause( 1000 ).release().perform();
        String exp_text = "You did great!";
        Assertions.assertEquals( bigBall.getText(), exp_text, "You are not drop a ball, test FAILED" );


    }
}
