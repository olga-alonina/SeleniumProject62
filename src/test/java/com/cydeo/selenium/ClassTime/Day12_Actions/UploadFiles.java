package com.cydeo.selenium.ClassTime.Day12_Actions;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UploadFiles {
    @Test
    public void uploadFile_Test() {
        Driver.getDriver().get( "https://practice.cydeo.com/upload" );
        String path = "C:\\Users\\wifec\\Desktop\\mypic.jpg";
        //choose file
        Driver.getDriver().findElement( By.id( "file-upload" ) ).sendKeys( path );
        //upload file
        Driver.getDriver().findElement( By.id( "file-submit" )).click();
       String actual_upload = Driver.getDriver().findElement(By.id( "uploaded-files" ) ).getText();
       String expected_upload = "mypic.jpg";
        assertEquals("Failed, fail is not uploaded correctly", expected_upload, actual_upload );


    }
    @AfterMethod
    public void close(){
        Driver.getDriver().close();
    }
}
