package com.cydeo.selenium.OH.AH_1;

import com.cydeo.pages.Uitestpractice_page;
import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task_1_2_3 {
    Uitestpractice_page page = new Uitestpractice_page();
    Actions actions = new Actions( Driver.getDriver() );

    @Test
    public void test() {
//************************isDisplayed_isEnabled************************
        //  2-    Verify main page is launched;
        Assert.assertTrue( page.main_page.isEnabled() );
        // -"Testing Controls" Tab should be displayed on left top (visible and enabled)
        Assert.assertTrue( page.testing_controls.isDisplayed() );
        Assert.assertTrue( page.testing_controls.isEnabled() );
        System.out.println( "page.testing_controls.getLocation().x = " + page.testing_controls.getLocation().x );
        System.out.println( "page.testing_controls.getLocation().y = " + page.testing_controls.getLocation().y );
        Assert.assertTrue( page.testing_controls.getLocation().getX() < 50 && page.testing_controls.getLocation().getY() < 50 );
    }

    @Test
    public void test2() {
        //************************SearchName inputBox************************
        // 2-Click on Home tab
        page.home.click();
        //3-Search for the name "Mike Johnson"
        actions.click( page.search_name ).sendKeys( "Mike Johnson" + Keys.ENTER ).perform();
        //4-Verify "There are zero students with this search text Page 0 of 0" msg displayed on page
        Assert.assertTrue( page.error_message.isEnabled() );
        Assert.assertTrue( page.error_message.getText().contains( "There are zero students with this search text Page 0 of 0" ) );
    }

    @Test
    public void test3() {
        //*************-- iframe***************

        //2- Type the name into "Enter your name" inputbox -> "Mike Johnson"


        Driver.getDriver().switchTo().frame( page.iframe );
        page.search_name.sendKeys( "MikeJohnson" );


        //3- Retrieve the name from inputbox -> "Mike Johnson"
        Assert.assertTrue( page.search_name.getAttribute( "value" ).contains( "Mike Johnson" ) );
        Assert.assertTrue( page.search_name.getAttribute( "localName" ).contains( "Mike Johnson" ) );


        //Click on the link "uitestpractice.com"
        Driver.getDriver().switchTo().defaultContent();
        page.link.click();

        //5- Verify "Drag and Drop control" menu is displayed in iframe

        //again it is a part of iframe so we need to switch
        Driver.getDriver().switchTo().frame( page.iframe );
        Assert.assertTrue( page.drag_and_drop_control.isDisplayed() );

        //close
        Driver.getDriver().close();

    }
}
