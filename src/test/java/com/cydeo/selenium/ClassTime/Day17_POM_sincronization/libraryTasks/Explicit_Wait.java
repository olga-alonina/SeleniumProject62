package com.cydeo.selenium.ClassTime.Day17_POM_sincronization.libraryTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Explicit_Wait {
    public Explicit_Wait() {
        Driver.getDriver().get( "https://practice.cydeo.com/dynamic_loading/7" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "alert")
    public WebElement doneMessage;
    @FindBy(css = "img[alt='square pants']")
    public WebElement picture;

    @Test
    public void Test() throws InterruptedException {
        // 2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), 5 );
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "alert" ) ) );
        // 3. Assert: Message “Done” is displayed.
        Assert.assertTrue( doneMessage.isDisplayed(), "message is different, test Fail" );
        //4. Assert: Image is displayed.
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.cssSelector( "img[alt='square pants']" ) ) );
        Assert.assertTrue( picture.isDisplayed(), "picture are not displayed, test Fail" );
        Driver.getDriver().close();
    }
}
