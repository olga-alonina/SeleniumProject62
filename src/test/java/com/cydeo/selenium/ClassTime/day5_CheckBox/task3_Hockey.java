package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class task3_Hockey {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = getWebDriver();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get( " https://practice.cydeo.com/radio_buttons " );
        //3. Click to “Hockey” radio button
        WebElement hockey_RB = driver.findElement( By.xpath( "//input[@id= 'hockey']" ) ); //input[@id= 'hockey'] )
        hockey_RB.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println( "Verify “Hockey” radio button is selected " + hockey_RB.isSelected() );
        //5. close
        driver.close();
    }
}
