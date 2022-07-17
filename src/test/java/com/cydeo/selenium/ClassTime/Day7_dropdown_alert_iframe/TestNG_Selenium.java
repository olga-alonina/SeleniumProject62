package com.cydeo.selenium.ClassTime.Day7_dropdown_alert_iframe;

import com.cydeo.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium extends TestBase {

    @Test
    public void googleTitle() {
        driver.get( "https://google.com" );
        Assert.assertEquals( driver.getTitle(), "Google", "Google title is not matching" );
    }


}
