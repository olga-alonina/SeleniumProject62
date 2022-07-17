package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TechCrunch {
    public TechCrunch() {
        Driver.getDriver().get( "https://techcrunch.com/" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//li[@class='menu__item']//a[.='TechCrunch']")
    public WebElement techCrunch;
    @FindBy(xpath = "//a[.='About']")
    public WebElement about;

    @Test
    public void test() throws InterruptedException {
        //  Click TechCrunch from Footer
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript( "arguments[0].scrollIntoView(true);" + "arguments[0].click()", techCrunch );
        Thread.sleep(9000);
        //About
        js.executeScript( "arguments[0].scrollIntoView(true)", about );
        Thread.sleep(9000);
        //TechCrunch
        js.executeScript( "arguments[0].scrollIntoView(true);" + "arguments[0].click()", techCrunch );
        //  Verify title contains "TechCrunch"
        Assert.assertTrue( Driver.getDriver().getTitle().contains( "TechCrunch" ) );
        Driver.getDriver().close();
    }
}
