package com.cydeo.selenium.OH.OH_day4;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P01_ImplicitWait  extends TestBase {
    @Test
    public void Implicit() {
        //go to the page http://practice.cydeo.com/dynamic_loading/4
        driver.get( "http://practice.cydeo.com/dynamic_loading/4" );
        driver.manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS );

        String helloWord = driver.findElement( By.id( "finish" ) ).getText();
        System.out.println( helloWord );
    }


    @AfterMethod
    public void tearDownMethod() {
        //6.close
        driver.close();
    }
}
