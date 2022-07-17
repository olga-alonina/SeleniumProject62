package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPages {
    public TestPages() {
        Driver.getDriver().get( "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "button00")
    public WebElement start;
    @FindBy(id = "button01")
    public WebElement one;
    @FindBy(id = "button02")
    public WebElement two;
    @FindBy(id = "button02")
    public WebElement three;

    @FindBy(id = "buttonmessage")
    public WebElement beforeclick;

    @Test
    public void test() {
        //Click Buttons In Order
        Assert.assertEquals( beforeclick.getText(), "Click Buttons In Order" );
        //  Click buttons in order
        start.click();
        one.click();
        two.click();
        three.click();
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(), 10 );
        //- All Buttons Clicked
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "buttonmessage" ) ) );
        Assert.assertEquals( beforeclick.getText(), "All Buttons Clicked" );
        //Clickable Buttons
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.id( "buttonmessage" ) ) );
        Assert.assertEquals( beforeclick.getText(), "- Clickable Buttons" );

//		- Verify messages are equal after click all buttons
//				- All Buttons Clicked
//				- Clickable Buttons


    }
}
