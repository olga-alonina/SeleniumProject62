package com.cydeo.selenium.ClassTime.Day8_Alert_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class P18_HTML_Dropdown {
    public static void main(String[] args) {
        WebDriver driver = getDriver( "chrome" );
        //1.navigate to page https://practice.cydeo.com/dropdown
        driver.get( "https://practice.cydeo.com/dropdown" );
        //2.click to open dropdown which has no select tag
        WebElement dropdown_Bt = driver.findElement( By.id( "dropdownMenuLink" ) );
        dropdown_Bt.click();
        //3. click item(link) with text Yahoo
        WebElement yahooItem = driver.findElement( By.linkText( "Yahoo" ) );
        yahooItem.click();

        //4.close
        driver.close();
    }
}
