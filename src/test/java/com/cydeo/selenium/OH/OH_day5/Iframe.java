package com.cydeo.selenium.OH.OH_day5;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Iframe {
    @Test
    public void Task1() {
//    - Open "https://demoqa.com/frames"
        Driver.getDriver().get( "https://demoqa.com/frames" );
//   - Verify child frames texts are equal : "This is a sample page"
        WebElement frame1 = Driver.getDriver().findElement( By.id( "frame1" ) );
        String text1 = frame1.getText();
        WebElement frame2 = Driver.getDriver().findElement( By.id( "frame2" ) );
        String text2 = frame2.getText();
        Assert.assertEquals( text1, text2, "Texts in frames are not same, Test FAILED" );
    }

    @Test
    public void task2() throws InterruptedException {
//        - Open "http://practice.cybertekschool.com/nested_frames"
        Driver.getDriver().get( "http://practice.cybertekschool.com/nested_frames" );
        Driver.getDriver().switchTo().frame( "frame-top" );
//                - Switch to middle frame
        //'frame-middle'
        Driver.getDriver().switchTo().frame( "frame-middle" );
//                - Verify text is equal "MIDDLE"
        String middle = Driver.getDriver().findElement( By.cssSelector( "#content" ) ).getText();
        Assert.assertEquals(  middle, "MIDDLE","Verification text middle is FAILED" );
        Driver.getDriver().switchTo().parentFrame();


//                - Switch to right frame
        Driver.getDriver().switchTo().frame( "frame-right" );
        String right = Driver.getDriver().findElement(By.tagName("body")).getText();
//                - Verify text is equal "RIGHT"
        Assert.assertEquals( right, "RIGHT","Verification text right is FAILED" );
        Driver.getDriver().switchTo().defaultContent();


//                - Switch to bottom frame
        Driver.getDriver().switchTo().frame( "frame-bottom" );
        String bottom = Driver.getDriver().findElement(By.tagName("body")).getText();
//                - Verify text is equal "BOTTOM"
        Assert.assertEquals( bottom, "BOTTOM" ,"Verification text bottom is FAILED");
    }

    @AfterTest
    public void close() {
        Driver.getDriver().close();
    }

}
