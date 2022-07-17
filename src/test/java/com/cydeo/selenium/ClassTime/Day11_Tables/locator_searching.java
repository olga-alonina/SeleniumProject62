package com.cydeo.selenium.ClassTime.Day11_Tables;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class locator_searching extends TestBase {
    @Test
    public void answer() {
        WebElement table1 = driver.findElement( By.xpath( "//table[@id='table1']" ) );
        //  2=> all rows inside 1 table
        List<WebElement> rows1table = driver.findElements( By.xpath( "//table[@id='table1']//tr" ) );
        //3=> all body part in 1 table
        List<WebElement> rows1tableBody = driver.findElements( By.xpath( "//table[@id='table1']//tbody//tr" ) );
        //4=> 3 row in the body
        WebElement row3in_Body = driver.findElement( By.xpath( "table[@id='table1']//tbody//tr[3]" ) );
        //5=> all sell in tr
        List <WebElement> allsellsIn1body = driver.findElements( By.xpath( "//table[@id=\"table1\"]//tbody//tr/td" ) );
        //6=> all first name
        List<WebElement> allFirstNames = driver.findElements( By.xpath( "//table[@id=\"table1\"]//tbody//tr/td[2]" ) );
        //7=>frank sell info: name
        WebElement FrankFN = driver.findElement( By.xpath( "//table[@id='table1']//tbody//tr[2]/td[2]" ) );
        //with text as name
        WebElement FrankFNText = driver.findElement( By.xpath( "//table[@id='table1']//tbody//tr[2]/td[.='Frank']"));
        //8=> reach 51 from frank
        WebElement dollar51 = driver.findElement( By.xpath( "//table[@id=\"table1\"]//tbody//tr/td[.='Frank']/following-sibling::td[.='$51.00']" ) );




    }

}
