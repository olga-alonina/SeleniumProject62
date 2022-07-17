package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import com.cydeo.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe_Practice extends TestBase {
    @Test
    public void iframeTest() {
        driver.get( "https://practice.cydeo.com/iframe" );
        WebElement frame = driver.findElement( By.id( "mce_0_ifr" ) );
//        driver.switchTo().frame( frame );//you could use all the option, but 1 by 1
//        driver.switchTo().frame( 0 );
        driver.switchTo().frame( "mce_0_ifr" );
        WebElement textArea = driver.findElement( By.tagName( "p" ) );
        Assertions.assertTrue( textArea.isDisplayed() );
        driver.switchTo().parentFrame();
        //3. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement bigletter = driver.findElement( By.xpath( "//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']" ) );
        Assertions.assertTrue( bigletter.isDisplayed() );
        //close
        driver.close();
    }
}
