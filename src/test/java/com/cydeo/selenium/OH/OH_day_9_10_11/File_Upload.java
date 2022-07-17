package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class File_Upload {
    public File_Upload() {
        Driver.getDriver().get( "https://testpages.herokuapp.com/styled/file-upload-test.html" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "fileinput")
    public WebElement choose_file;

    @FindBy(id="itsafile")
    public WebElement general_file;

    @FindBy(name = "upload")
    public WebElement upload;

    @FindBy(xpath = "//p[normalize-space(text())='You uploaded a file. This is the result.']")
    public WebElement result;



    @Test
    public void test() {
        //  Upload file into Choose File
        // NOTE : Create a file called as UploadTest.txt in project to upload ( I will show how we can )
        String path ="C:\\Users\\wifec\\ola\\SeleniumProjectB26\\src\\test\\java\\com\\cydeo\\selenium\\OH\\OH_day_9_10_11\\UploadTest.txt";

        choose_file.sendKeys( path );
         // Choose General File
        general_file.click();
        // Click Upload button
        upload.click();
        // Verify Expected message equals "You uploaded a file. This is the result."
        Assert.assertEquals(result.getText(),"You uploaded a file. This is the result.");
        //close
        Driver.getDriver().close();


    }
}
