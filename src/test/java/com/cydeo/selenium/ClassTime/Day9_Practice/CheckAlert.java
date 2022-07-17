package com.cydeo.selenium.ClassTime.Day9_Practice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckAlert extends TestBase {
    @Test
    public void alert_Practice() {
        //navigate to page
        driver.get( "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver" );
        //locate bt alert
        WebElement alertBT = driver.findElement( By.name( "alert" ) );
        alertBT.click();
        //go to pop up window
        Alert alert = driver.switchTo().alert();
        //push ok
        alert.accept();
    }

    @Test
    public void Confirmation_box() {
        //locate  confirmation box
        WebElement confirmation_box = driver.findElement( By.name( "confirmation" ) );
        confirmation_box.click();
        //go to pop up window
        Alert confirmBox = driver.switchTo().alert();
        //push ok
        confirmBox.accept();
    }
    @Test
    public void Prompt() {
        WebElement promptBT = driver.findElement( By.name( "prompt" ) );
        promptBT.click();
        //go to pop up window
        Alert prompt = driver.switchTo().alert();
        //push ok
        prompt.sendKeys( "Ola wanna sleep" );
        prompt.accept();
    }  @Test
    public void Choose_File(){

    }

}

