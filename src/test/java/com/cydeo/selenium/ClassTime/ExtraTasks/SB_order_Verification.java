package com.cydeo.selenium.ClassTime.ExtraTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.cydeo.selenium.ClassTime.ExtraTasks.Smartbear_software_link_verification.SmartBearUtils.loginToSmartBear;
import static org.testng.AssertJUnit.assertEquals;

public class SB_order_Verification {
    @Test
    public void sb_order_Verification() {
        //        TC#3: Smartbear software order verification
        //        1. Open browser and login to Smartbear software
        Driver.getDriver().get( "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx" );
        loginToSmartBear( Driver.getDriver() );
        //        2. Click on View all orders
        Driver.getDriver().findElement( By.linkText( "View all orders" ) ).click();
        //        3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement nameSusan = Driver.getDriver().findElement( By.xpath( "//tr[6]//td[2]" ) );
        assertEquals( nameSusan.getText(), "Susan McLaren" );
        WebElement dateSusan = Driver.getDriver().findElement( By.xpath( "//tr[6]//td[5]" ) );
        assertEquals( dateSusan.getText(), "01/05/2010" );
        assertEquals( "Test failed, date is not belong to name", nameSusan.getLocation().getY(), dateSusan.getLocation().getY() );
    }
    @AfterMethod
    public void close(){
        Driver.getDriver().close();
    }
}
