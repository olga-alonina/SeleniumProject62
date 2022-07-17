package com.cydeo.selenium.OH.OH_day7_8;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Twitter {
    //    - Open "http://automationpractice.com/index.php"
//            - Click twitter from Follow us
//			- Switch to twitter tab
//			- Verify title contains "Selenium Framework"
//            - Switch to original tab
//			- Verify title equals "My Store"
    public Twitter() {
        Driver.getDriver().get( "http://automationpractice.com/index.php" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(css = "li[class='twitter']")
    public WebElement twitterSign;

    @Test
    public void test() {
        String firstPage = Driver.getDriver().getWindowHandle();

        // - Click twitter from Follow us
        twitterSign.click();
        //- Switch to twitter tab
        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        for (String each : allWindows) {
            Driver.getDriver().switchTo().window( each );
            if (Driver.getDriver().getCurrentUrl().contains( "twitter" )) {
                break;
            }
        }
        // Verify title contains "Selenium Framework"
        String actual_title = Driver.getDriver().getTitle();
        Assert.assertTrue( actual_title.contains( "Selenium Framework" ) );
        //  Switch to original tab
        Driver.getDriver().switchTo().window( firstPage );
        //- Verify title equals "My Store"
        String actual_title_afterSwitch = Driver.getDriver().getTitle();
        Assert.assertEquals( actual_title_afterSwitch, "My Store" );
    }

    @AfterMethod
    public void close() {
        Driver.getDriver().close();
    }
}
