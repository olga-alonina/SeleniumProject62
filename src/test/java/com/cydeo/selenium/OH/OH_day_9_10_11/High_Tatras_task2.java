package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.pages.Drag;
import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class High_Tatras_task2 {//todo xz kak eto delat
    @Test
    public void  high_Tatras_task2() {
        //started set up
        Driver.getDriver().get( "https://www.globalsqa.com/demo-site/draganddrop/" );
        PageFactory.initElements( Driver.getDriver(), this );
        //create new obj
        Drag drag = new Drag();

         //switch to frame
        Driver.getDriver().switchTo().frame(drag.iframe);
        Actions actions = new Actions( Driver.getDriver() );
        //move 1 pic to trash
        actions.dragAndDrop( drag.tatras, drag.trashCan ).perform();
        //move 2 pic to trash
        actions.dragAndDrop( drag.tatras2, drag.trashCan ).perform();
        //verify
        System.out.println( "drag.trashList.size() = " + drag.trashList.size() );
        Assert.assertEquals( drag.trashList.size(), 2 );




        //close
        Driver.getDriver().close();
    }
}
