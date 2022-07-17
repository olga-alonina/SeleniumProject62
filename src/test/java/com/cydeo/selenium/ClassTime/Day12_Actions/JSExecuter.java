package com.cydeo.selenium.ClassTime.Day12_Actions;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter {
    @Test
    public void scrollingTest(){
        Driver.getDriver().get("https://practice.cydeo.com");
        WebElement cydeoLink = Driver.getDriver().findElement( By.linkText("CYDEO") );
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript( "arguments[0].scrollIntoView(true);"+"arguments[0].click()",cydeoLink);
    }
}
