package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class P17_LocationDropDownList_Multiple {
    public static void main(String[] args) {
        WebDriver driver = getDriver( "chrome" );
        //1.navigate to page https://practice.cydeo.com/dropdown
        driver.get( "https://practice.cydeo.com/dropdown" );
        //2 identify drop element with multiple choice
        WebElement multi = driver.findElement( By.name( "Languages" ) );
        //3.wrap this element into select option
        Select multiOBj = new Select( multi );
        //4.check if this element has multiselect option
        System.out.println( "multiOBj.isMultiple() = " + multiOBj.isMultiple() );
        //5.select items
        multiOBj.selectByIndex( 2 );
        multiOBj.selectByValue( "ruby" );
        multiOBj.selectByVisibleText( "Python" );

        //6.deselect items
        multiOBj.deselectByIndex( 2 );
        multiOBj.deselectByValue( "ruby" );
        multiOBj.deselectByVisibleText( "Python" );
        multiOBj.deselectAll();
        //7.close
        driver.close();
    }
}
