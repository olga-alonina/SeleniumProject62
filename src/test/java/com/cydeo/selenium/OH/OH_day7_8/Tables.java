package com.cydeo.selenium.OH.OH_day7_8;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    //    Task 1  -- Example 1 Table
//	        - Open "http://practice.cydeo.com/tables"
//            - Print out all table headers
//	        - Verify
//	        		- Table has 6 header
    public Tables() {
        Driver.getDriver().get( "http://practice.cydeo.com/tables" );

        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//table[@id='table1']//span")
    public List<WebElement> tableHeaders;
    @FindBy(xpath = "//table[@id='table1']/tbody/tr")
    public List<WebElement> tableRows;
    @FindBy(xpath = "//table[@id='table1']//td[.='Frank']/../td[contains(.,\"@\")]")
    public WebElement emailFrank;
    @FindBy(xpath = "//table[@id='table1']//td[.='Jason']/../td[contains(.,\"@\")]")
    public WebElement emailJason;

    @Test
    public void test1() {
        int counter = 0;
        for (WebElement eachHeaders : tableHeaders) {
            // - Print out all table headers
            System.out.println( "Table header = " + eachHeaders.getText() );
            counter++;
        }
        Assert.assertEquals( counter, 6 );
    }

    @Test
    public void test2() {
        //  - Print out all table information
        int rows = 0;
        for (WebElement eachRows : tableRows) {
            System.out.println( "info in rows=>" + eachRows.getText() );
            rows++;
        }
        //  - Verify Table has 4 row
        Assert.assertEquals( rows, 4 );
    }

    @Test
    public void test3() {
        for (WebElement eachRows : tableRows) {
            //- Print out all infromation for firstname ="Frank"
            if (eachRows.getText().contains( "Frank" ))
                System.out.println( "Frank only=>" + eachRows.getText() );
        }

        // dynamic locator to get email for username
        // xpath -- //table[@id='table1']//td[.="firstname"]/../td[contains(.,"@")]

        // - Verify - email equals "fbach@yahoo.com"
        Assert.assertEquals( emailFrank.getText(), "fbach@yahoo.com" );
//        firstname = Jason //        email     = jdoe@hotmail.com
        Assert.assertEquals( emailJason.getText(), "jdoe@hotmail.com" );
        //close
        Driver.getDriver().close();
    }
}


