package com.cydeo.selenium.ClassTime.Day17_POM_sincronization.libraryTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dynamically_Loaded_Page_Elements {
    public Dynamically_Loaded_Page_Elements() {
        Driver.getDriver().get( "https://practice.cydeo.com/dynamic_loading/1 " );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(css = "button[class='btn btn-primary']")
    public WebElement startBt;
    @FindBy(id = "loading")
    public WebElement loadingLine;
    @FindBy(id = "username")
    public WebElement usernameIB;
    @FindBy(id = "pwd")
    public WebElement password;
    @FindBy(css = "button[type='submit']")
    public WebElement submit;
    @FindBy(id = "flash-messages")
    public WebElement errorMessage;

    @Test
    public void test() {
        //2. Click to start
        startBt.click();
        //3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), 5 );
        wait.until( ExpectedConditions.invisibilityOf( loadingLine ) );
        //4. Assert username inputbox is displayed
        Assert.assertTrue( usernameIB.isDisplayed(), "button not appeare, Test Failed" );
        //5. Enter username: tomsmith
        usernameIB.sendKeys( "tomsmith" );
        //6. Enter password: incorrectpassword
        password.sendKeys( "incorrectpassword" );
        //7. Click to Submit button
        submit.click();
        wait.until( ExpectedConditions.visibilityOf( errorMessage ));
        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue( errorMessage.isDisplayed() );
        Assert.assertTrue( errorMessage.getText().contains( "Your password is invalid!" ) );
        Driver.getDriver().close();
    }
}


