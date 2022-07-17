package com.cydeo.selenium.ClassTime.Day6_StaleElenes_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class T1_StaleElement_ReferentExeption {
    public static void main(String[] args) {
//        TC #1: StaleElementReferenceException handling
//        1. Open Chrome browser
        WebDriver driver = getWebDriver();

//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get( "https://practice.cydeo.com/add_remove_elements/" );
//        3. Click to “Add Element” button
        WebElement add_Element = driver.findElement( By.xpath( "//button[.='Add Element']" ) );
        add_Element.click();
//        4. Verify “Delete” button is displayed after clicking.
        WebElement delete_bt = driver.findElement( By.xpath( "//button[.='Delete']" ) );
        System.out.println("Before clicking");
        System.out.println(delete_bt.isDisplayed()?"Test passed":"Test failed");

//        5. Click to “Delete” button.
        delete_bt.click();
//        6. Verify “Delete” button is NOT displayed after clicking.
        System.out.println("After clicking");

        try{
            System.out.println(delete_bt.isDisplayed()?"Test passed":"Test failed");
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("this is mean web element is complitelly deleted from the page and html");

        }
        //close
        driver.quit();
    }
}
