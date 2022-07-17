package com.cydeo.utilities.utility_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
    public static void Loging_Out(WebDriver driver) {
        //drop menu
       driver.findElement( By.id( "user-block" ) ).click();
       //logout option
       driver.findElement(By.cssSelector( "a[href^=\"/auth/?logout\"] " ) ).click();
    }

}
