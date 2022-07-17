package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class P02_Hard_Soft_Assertions {
    @Test
    public void hardAssertion() {
        Assert.assertEquals( "Apple", "app" );
        System.out.println( "after assertion failed" );
        assertTrue( "orange".equals( "oranger" ) );
        System.out.println( "after assertion failed" );
    }

    @Test
    public void softAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals( "Apple", "app" );
        System.out.println( "after soft assertion failed" );
        softAssert.assertTrue( "orange".equals( "oranger" ) );
        System.out.println( "after soft assertion failed" );
        softAssert.assertAll();
    }
}
