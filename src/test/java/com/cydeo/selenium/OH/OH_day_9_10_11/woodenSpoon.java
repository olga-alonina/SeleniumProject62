package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class woodenSpoon {
    public woodenSpoon() {
        Driver.getDriver().get( "https://www.etsy.com" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement search_place;

    @FindBy(xpath = "//span[.='All Filters']")
    public WebElement allFilters;

    @FindBy(id="special-offers-free-shipping")
    public WebElement freeShipping;
    @FindBy(xpath = "//button[@aria-label='Apply']")
    public WebElement apply;
    @FindBy(xpath = "(//span[@class='wt-display-inline-flex-sm']//span)[1]")
    public WebElement result;
    @Test
    public void test(){
        // Search for “wooden spoon”
        search_place.sendKeys( "wooden spoon" + Keys.ENTER);
        // Click on filters
        allFilters.click();
        // Select free shipping  (use checkbox to click freeshipping. DON'T USE label tagged element to handle )
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript( "arguments[0].scrollIntoView(true);" + "arguments[0].click()", freeShipping );
        // Click apply filters
        apply.click();
        // Print count of results
        System.out.println( "result = " + result.getText() );
        //close
        Driver.getDriver().close();
}}
