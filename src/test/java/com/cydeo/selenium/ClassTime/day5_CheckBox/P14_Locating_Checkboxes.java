package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;


public class P14_Locating_Checkboxes {
    public static void main(String[] args) {
        //set up chrome driver and open chrome
        WebDriver driver = getWebDriver();
        //navigate to checkbox page from practice page https://practice.cydeo.com/checkboxes
        driver.get( "https://practice.cydeo.com/checkboxes" );
        //box1
        WebElement checkBox1 = driver.findElement( By.id( "box1" ) );
        System.out.println( "before click checkBox1.isSelected() = " + checkBox1.isSelected() );
        checkBox1.click();
        System.out.println( "after click checkBox1.isSelected() = " + checkBox1.isSelected() );
        //box2(same result with get attribute) before run pick 1 of them)
        WebElement checkBox2 = driver.findElement( By.id( "box2" ) );
        System.out.println( "before click checkBox2.isSelected() = " + checkBox2.isSelected() );
        checkBox2.click();
        System.out.println( "after click checkBox2.isSelected() = " + checkBox2.isSelected() );

        //with get attribute (same result with box2) before run pick 1 of them)
//        WebElement checkBox2A = driver.findElement( By.id("box2") );
//        System.out.println( "before click checkBox2A.getAttribute = " + checkBox2A.getAttribute(  "checked") );
//        checkBox2A.click();
//        System.out.println( "after click checkBox2A.getAttribute = " + checkBox2A.getAttribute(  "checked") );
        if (checkBox1.isSelected()) {
            System.out.println( "checkBox1 is already selected" );
        } else {
            checkBox1.click();
        }//close
        driver.close();
    }
}
