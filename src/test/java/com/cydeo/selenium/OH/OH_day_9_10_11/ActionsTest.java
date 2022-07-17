package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsTest {
    public ActionsTest() {
        Driver.getDriver().get( "http://automationpractice.com/index.php" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
    public WebElement dresses;

    @FindBy(xpath = "(//ul/li[2]/ul)[2]")
    public List<WebElement> underDresses;


    @Test
    public void test() {
        Actions actions = new Actions( Driver.getDriver() );
        // Hover over on Dresses button
        actions.moveToElement( dresses ).perform();
        System.out.println( "dresses.getText() = " + dresses.getText() );
//       - Verify following subCategories are displayed //Casual Dresses //    Evening Dresses //    Summer Dresses
        for (WebElement eachDresses : underDresses) {
            System.out.println( "Each Dresses => " + eachDresses.getText() );
            Assert.assertTrue( eachDresses.isDisplayed() );
        }
        Driver.getDriver().close();
    }
}
