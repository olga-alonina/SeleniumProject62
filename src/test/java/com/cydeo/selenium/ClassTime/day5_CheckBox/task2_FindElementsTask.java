package com.cydeo.selenium.ClassTime.day5_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class task2_FindElementsTask {
    public static void main(String[] args) {
//        1- Open a chrome browser
        WebDriver driver = getWebDriver();

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get( "https://practice.cydeo.com/abtest " );
//        3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements( By.tagName( "a" ) );
//        4- Print out the number of the links on the page.
        System.out.println( "the number of the links on the page = " + allLinks.size() );
        // next step
        for (WebElement eachLink : allLinks) {
            //5 Print out the texts of the links.
            System.out.println( "Text of each link = " + eachLink.getText() );
            //6- Print out the HREF attribute values of the links
            System.out.println( "Href values = " + eachLink.getAttribute( "href" ) );
        }
        //7.close
        driver.close();
    }
}
