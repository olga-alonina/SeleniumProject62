package com.cydeo.selenium.OH.OH_day5;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HTML_popUP {
    @Test
    public void popUP_Test() {
        //        Task 1  -- HTML POP UP
        //  Open "https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126"
        Driver.getDriver().get( "https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126" );
        //                - Click Confirm button
        Driver.getDriver().findElement( By.id( "j_idt311:j_idt312" ) ).click();
        //        - Click YES from pop up
        Driver.getDriver().findElement( By.xpath( "//span[.='Yes']" ) ).click();
        //        - Verify message equals "You have accepted"
        WebElement confMessage = Driver.getDriver().findElement( By.xpath( "//p[.='You have accepted']" ) );
        assertEquals( "Alert displayed incorrectly, Test FAILED", confMessage.getText(), "You have accepted" );
    }

    @Test
    public void information() {
//    - Open "http://www.uitestpractice.com/Students/Switchto"
        Driver.getDriver().get( "http://www.uitestpractice.com/Students/Switchto" );
//            - Click Alert
        Driver.getDriver().findElement( By.id( "alert" ) ).click();
//			- Click OK button from org.openqa.selenium.Alert
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
//			- Verify message equals "You have clicked on ok button in alert window"
        String act_text = Driver.getDriver().findElement( By.id( "demo" ) ).getText();
        String exp_text = "You have clicked on ok button in alert window";
        Assert.assertEquals( act_text, exp_text,
                "Information winow is not shown correct info, Test Failed" );

    }

    @Test
    public void confirmation() {
//        - Open "http://www.uitestpractice.com/Students/Switchto"
        Driver.getDriver().get( "http://www.uitestpractice.com/Students/Switchto" );
//                - Click Confirm
        Driver.getDriver().findElement( By.id( "confirm" ) ).click();

//                - Click Cancel button from Alert
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.dismiss();
//        - Verify message equals "You pressed Cancel in confirm window"
        String act_text = Driver.getDriver().findElement( By.id( "demo" ) ).getText();
        String exp_text = "You pressed Cancel in confirm window";
        Assert.assertEquals( exp_text, act_text, "Text message incorrect,Test Failed" );

    }

    @Test
    public void prompt() {
//        - Open "http://www.uitestpractice.com/Students/Switchto"
        Driver.getDriver().get( "http://www.uitestpractice.com/Students/Switchto" );
//                - Click Prompt
        Driver.getDriver().findElement( By.id( "prompt" ) ).click();
//                - Send name as "Mike" into this alert field + CLick OK
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys( "Mike" );
        alert.accept();
//  - Verify  message contains "Mike"
        String act_text = Driver.getDriver().findElement( By.id( "demo" ) ).getText();
        Assert.assertTrue( act_text.contains( "Mike" ), "Text message incorrect,Test Failed" );
    }

    @AfterTest
    public void close() {
        Driver.getDriver().close();
    }
}
