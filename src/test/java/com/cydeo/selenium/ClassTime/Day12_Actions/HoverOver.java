package com.cydeo.selenium.ClassTime.Day12_Actions;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class HoverOver {
    @Test
    public void hoverOver() {
        Driver.getDriver().get( "https://practice.cydeo.com/hovers" );
        WebElement pic1 = Driver.getDriver().findElement( By.xpath( "(//img)[1]" ) );
        WebElement textPic1 = Driver.getDriver().findElement( By.xpath( "//h5[.='name: user1']" ) );
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement( pic1 ).perform();
        assertTrue( "Text is not appearing after hover,Failed", textPic1.isDisplayed() );
    }

    @Test
    public void hoverOverList() {
        Driver.getDriver().get( "https://practice.cydeo.com/hovers" );
        Actions actions = new Actions( Driver.getDriver() );
        List<WebElement> list = Driver.getDriver().findElements( By.tagName( "img" ) );
        for (WebElement each : list) {
            actions.moveToElement( each ).perform();
            assertTrue( "Text is not appearing after hover,Failed", each.isDisplayed() );
        }
    }

    @AfterMethod
    public void close() {
        Driver.getDriver().close();
    }
}
