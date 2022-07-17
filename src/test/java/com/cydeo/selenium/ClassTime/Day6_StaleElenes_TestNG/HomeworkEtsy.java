package com.cydeo.selenium.ClassTime.Day6_StaleElenes_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.getWebDriver.getWebDriver;

public class HomeworkEtsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getWebDriver();
//        1. Go to https://www.etsy.com
        driver.get( "https://www.etsy.com" );
//        2. Search for “wooden spoon”
        WebElement search_line = driver.findElement( By.xpath( "//input[@data-id=\"search-query\"]" ) );
        search_line.sendKeys( "wooden spoon" + Keys.ENTER );
//        3. Click on filters
        WebElement filters = driver.findElement( By.cssSelector( "span[class=\"wt-hide-xs wt-show-md filter-expander\"]" ) );
        filters.click();
//        4. Select free shipping, on sale
        WebElement free_shipping = driver.findElement(By.cssSelector( "label[for='special-offers-free-shipping']" ));
        free_shipping.click();
        WebElement on_sale = driver.findElement( By.cssSelector( "label[for='special-offers-on-sale']" ) );
        on_sale.click();
//        5. Select under $25 Click on apply filters
        WebElement under_25 = driver.findElement(By.cssSelector( "label[for='price-input-1']" ));
        under_25.click();
        WebElement apply = driver.findElement( By.cssSelector( "button[class=\"wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3\"]" ) );
        apply.click();
        Thread.sleep( 5000 );
//        6. Print count of results
        WebElement result= driver.findElement(By.xpath( "//span[@class='wt-display-inline-flex-sm']/span[1] "));
        System.out.println(result.getText());

        //close
        driver.quit();
    }
}
