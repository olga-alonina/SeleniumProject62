package com.cydeo.selenium.ClassTime.Day14_driverUtil_javaFaker;

import com.cydeo.utilities.utility_driver.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {
    // Go to "https://www.google.com/"
// Write “apple” in search box
    // Verify title:
    //Expected: apple - Google Search
    @Test
    public void googleSearch_DriverPractice(){
        Driver.getDriver().get("https://www.google.com/"  );
        // Write “apple” in search box
        Driver.getDriver().findElement( By.name( "q" ) ).sendKeys( "apple"+ Keys.ENTER );
        String expectedTT = "apple - Google Search";
        String actualTT = Driver.getDriver().getTitle();
        Assertions.assertEquals( actualTT, expectedTT ,"Title incorrect, TEST FAILED");

        Driver.getDriver().close();



    }
}
