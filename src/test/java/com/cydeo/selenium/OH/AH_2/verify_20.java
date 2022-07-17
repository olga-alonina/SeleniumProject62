package com.cydeo.selenium.OH.AH_2;

import com.cydeo.pages.Uitestpractice_page;
import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class verify_20 {
    @Test
    public void twentyIsDisplayed() {
        Uitestpractice_page page = new Uitestpractice_page();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript( "arguments[0].scrollIntoView(true)", page.slider_control);

        //Verify number "20" is not displayed in "Slider Control" part of the page
        System.out.println( "before moving" );
        Assert.assertFalse( page.twenty.isDisplayed() );
        //Move to right the Slider Handle and make number "20" visible
        js.executeScript( "arguments[0].scrollIntoView(true)", page.twenty );
        System.out.println( "after moving" );
        Assert.assertTrue( page.twenty.isDisplayed() );
    }

    @AfterMethod
    public void tearDown() {
        //close
        Driver.getDriver().close();
    }
}
