package com.cydeo.selenium.ClassTime.ExtraTasks;

import com.cydeo.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.cydeo.selenium.ClassTime.ExtraTasks.Smartbear_software_link_verification.SmartBearUtils.loginToSmartBear;
import static org.testng.AssertJUnit.assertEquals;

public class Smartbear_software_link_verification {
    @Test
    public void TC_1() {
        //    TC #1: Smartbear software link verification
        //1. Open browser
        //2. Go to website:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        loginToSmartBear( Driver.getDriver() );
        //6. Print out count of all the links on landing page
        List<WebElement> list = Driver.getDriver().findElements( By.tagName( "a" ) );
        System.out.println( "Print out count of all the links on landing page=>" + list.size() );
        //7. Print out each link text on this page
        for (WebElement each : list) {
            System.out.println( "" + each );
        }
    }

    @Test
    public static class SmartBearUtils {
        //    Mini-Task: CREATE A CLASS à SmartBearUtils
        //• Create a method called loginToSmartBear
        public static void loginToSmartBear(WebDriver driver) {
            //• This method simply logs in to SmartBear when you call it.
            //•        Accepts WebDriver type as parameter
            //2. Go to website:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
            Driver.getDriver().get( "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx" );
            //            3. Enter username: “Tester”
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_username" ) ).sendKeys( "Tester" );
            //            4. Enter password: “test”
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_password" ) ).sendKeys( "test" );
            //            5. Click to Login button
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_login_button" ) ).click();
        }

        @Test
        public void TC_2() {
            //    TC#2: Smartbear software order placing
            //1. Open browser
            //2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
            Driver.getDriver().get( "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx" );
            //            3. Enter username: “Tester” //            4. Enter password: “test” //            5. Click on Login button
            loginToSmartBear( Driver.getDriver() );
            //6. Click on Order
            Driver.getDriver().findElement( By.linkText( "Order" ) ).click();
            //7. Select familyAlbum from product,
            Driver.getDriver().findElement( By.xpath( "//option[@value=\"FamilyAlbum\"]" ) ).click();
            // set quantity to 2
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_txtQuantity" ) ).sendKeys( "2" );

            //            8. Click to “Calculate” button
            Driver.getDriver().findElement( By.xpath( "//input[@value='Calculate']" ) ).click();
            //9. Fill address Info with JavaFaker
            Faker faker = new Faker();
            //• Generate: name,
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_txtName" ) ).sendKeys( faker.name().fullName() );
            // street,
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox2" ) ).sendKeys( faker.address().streetAddress() );
            // city,
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox3" ) ).sendKeys( faker.address().cityName() );
            // state,
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox4" ) ).sendKeys( faker.address().state() );
            // zip code
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox5" ) ).sendKeys( faker.address().zipCode().replace( "-", "" ) );
            //10. Click on “visa” radio button
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_cardList_0" ) ).click();
            //11. Generate card number using JavaFaker
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox6" ) ).sendKeys( faker.finance().creditCard().replace( "-", "" ) );
            //Date
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_TextBox1" ) ).sendKeys( (CharSequence) faker.numerify( "##/##" ) );
            //12. Click on “Process”
            Driver.getDriver().findElement( By.id( "ctl00_MainContent_fmwOrder_InsertButton" ) ).click();
            //            13. Verify success message “New order has been successfully added.”
            WebElement message = Driver.getDriver().findElement( By.tagName( "strong" ) );
            assertEquals( "Messagedisplayed incorrect, Test Failed", message.getText(), "New order has been successfully added." );


        }

        @AfterMethod
        public void close() {
            Driver.getDriver().close();
        }
    }
}

