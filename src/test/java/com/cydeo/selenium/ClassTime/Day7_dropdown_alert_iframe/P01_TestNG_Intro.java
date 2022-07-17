package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class P01_TestNG_Intro {
    @Test(priority = 2)
    public void testOnePlusFive() {

        System.out.println( "1+5 is running" );
        assertEquals( 1 + 5, 6 );
    }

    @Test
    public void testTenMinusFour() {
        System.out.println( "10-4 is running" );
        assertEquals( 10 - 4, 6 );
    }

    @BeforeClass
    public void setUp() {
        System.out.println( "before class running" );
    }

    @AfterClass
    public void tearDown() {
        System.out.println( "After class running" );
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println( "before method is running " );
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println( "after method is running " );
    }
}

