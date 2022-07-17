package com.cydeo.selenium.ClassTime.Day9_Practice;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() {
        Driver.getDriver().get( "https://practice.cydeo.com/upload" );
        String path = "file:///C:/Users/wifec/Desktop/HTML%20class/pic3.jpg";
        WebElement chooseFile = Driver.getDriver().findElement( By.id( "file-upload" ) );
        WebElement upload_bt = Driver.getDriver().findElement( By.id( "file-submit" ) );
        chooseFile.sendKeys( path );
        upload_bt.click();
        WebElement uploadMessage = Driver.getDriver().findElement( By.tagName( "h3" ) );
        Assert.assertTrue(uploadMessage.isDisplayed(),"file was not uploaded tet FAILED");
        Driver.getDriver().close();


    }
}
