package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {
        //1. set up chrome driver and open chrome
        WebDriver driver = getWebDriver();
        //2. navigate to radio buttons page from practice page https://practice.cydeo.com/radio_buttons
        driver.get( "https://practice.cydeo.com/radio_buttons" );
        WebElement blue_RB = driver.findElement( By.id( "blue" ) );
        System.out.println( "before click blue_RB.isSelected() = " + blue_RB.isSelected() );
        blue_RB.click();
        System.out.println( "after click blue_RB.isSelected() = " + blue_RB.isSelected() );
        //3.click on red button
        WebElement red_RB = driver.findElement( By.id( "red" ) );
        System.out.println( "before click red_RB.isSelected() = " + red_RB.isSelected() );
        red_RB.click();
        System.out.println( "after click red_RB.isSelected() = " + red_RB.isSelected() );
        //4. check status blue button
        System.out.println( "after click red_RB status blue is = " + blue_RB.isSelected() );
        //5. identify green radio button
        WebElement green_RB = driver.findElement( By.id( "green" ) );
        green_RB.click();
        System.out.println( "green_RB.isSelected() = " + green_RB.isSelected() );
        System.out.println( "green_RB.isEnabled() = " + green_RB.isEnabled() );
        //6. collecting colors
        List<WebElement> allColors = driver.findElements( By.name( "color" ) );
        System.out.println( "How many button do we have = " + allColors.size() );
        //7. Attribute, Enable, Selected
        for (WebElement eachColor : allColors) {
            System.out.println( "Current radio button is " + eachColor.getAttribute( "id" ) );
            System.out.println( "Is enabled? " + eachColor.isEnabled() );
            System.out.println( "Is it selected " + eachColor.isSelected() );
        }

        //8. close
        driver.close();
    }
}
