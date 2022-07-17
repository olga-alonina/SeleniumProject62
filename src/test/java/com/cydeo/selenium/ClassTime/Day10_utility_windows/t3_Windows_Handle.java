package com.cydeo.selenium.ClassTime.Day10_utility_windows;

import com.cydeo.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class t3_Windows_Handle extends TestBase {
    @Test
    public void WindowHandleTest() {
//        1. Open a chrome browser
//        2. Go to : https://practice.cydeo.com/windows
        driver.get( "https://practice.cydeo.com/windows" );
//        3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assertions.assertEquals( actualTitle, expectedTitle, "You are open different page, test FAIL" );
//        4. Click to: “Click Here” link
        driver.findElement( By.linkText( "Click Here" ) ).click();
//        5. Switch to new Window.
        Set<String> allWindowTabs = driver.getWindowHandles();
        for(String each:allWindowTabs){
            driver.switchTo().window( each );
            System.out.println("Title now is=> "+ driver.getTitle() );
        }
//        6. Assert: Title is “New Window”
        String expected_title = "New Window";
        Assertions.assertEquals( expected_title, driver.getTitle(), "Verifying titles failed");
    }
}
