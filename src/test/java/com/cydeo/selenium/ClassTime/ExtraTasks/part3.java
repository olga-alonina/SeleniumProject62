package com.cydeo.selenium.ClassTime.ExtraTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class part3 {
    @Test(priority = 1)
    public void number_links_on_page() throws InterruptedException {
        //    TC #1: Checking the number of links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get( "https://www.openxcell.com" );
        Thread.sleep( 6000 );
        List<WebElement> links = Driver.getDriver().findElements( By.tagName( "a" ) );

        //            3. Count the number of the links on the page and verify // Expected: 337
        assertEquals( "Ammount of links is different, TestFAILED", links.size(), 354 );
    }

    @Test(priority = 2)
    public void printTextOfLink() throws InterruptedException {
        //    TC #2: Printing out the texts of the links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get( "https://www.openxcell.com" );
        Thread.sleep( 6000 );
        List<WebElement> links = Driver.getDriver().findElements( By.tagName( "a" ) );
        //   3. Print out all of the texts of the links on the page
        int count = 0;
        for (WebElement each : links) {
            if (!each.getText().equals( "" )) {
                System.out.println( each.getText() );
                count++;
            }
        }
        System.out.println(count);
    }

    @Test(priority = 3)
    public void countLinkWithoutText() throws InterruptedException {
        //    TC #3: Counting the number of links that does not have text
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        Driver.getDriver().get( "https://www.openxcell.com" );
        Thread.sleep( 6000 );
        List<WebElement> links = Driver.getDriver().findElements( By.tagName( "a" ) );
        // 3. Count the number of links that does not have text and verify//
        int count = 0;
        for (WebElement each : links) {
            if (each.getText().equals( "" )) {
               count++;
            }
        }
        System.out.println(count);
        assertTrue( "Amount of empty link is different, Test FAILED", count==258 );
    }

    @AfterTest
    public void close() {
        Driver.getDriver().close();
    }
}
