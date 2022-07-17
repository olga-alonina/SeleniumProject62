package com.cydeo.selenium.OH.OH_day7_8;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class Optional {//todo check it out again later
    public Optional() {
        Driver.getDriver().get( "https://www.demoblaze.com/" );

        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phonesTab;

    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    public WebElement samsungGs6;

    @FindBy(css = "div[class='col-sm-12 col-md-6 col-lg-6']")
    public WebElement addToCartSamsung;

    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement home;

    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//a[.='Apple monitor 24']")
    public WebElement apple24;
    @FindBy(xpath = "a[onclick='addToCart(10)']")
    public WebElement addToCartApple;
    @FindBy(id = "cartur")
    public WebElement cart;
    @FindBy(xpath = "(//a[.='Delete'])[2]")
    public WebElement deleteAppleCart;
    @FindBy(xpath = "//tbody[@id='tbodyid']//td[3]")
    public WebElement price;


    @Test
    public void test() throws InterruptedException {
        //   - Navigate to "Phones"
        phonesTab.click();
        samsungGs6.click();
        //click on "Add to cart"
        addToCartSamsung.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        Thread.sleep( 9000 );
        home.click();
        //   - Navigate to "Monitors" →  "Apple monitor 24" and click on "Add to cart"
        monitors.click();
        apple24.click();
        addToCartApple.click();
        Actions actions = new Actions( Driver.getDriver() );
        Alert alert1 = Driver.getDriver().switchTo().alert();
        alert1.accept();
        //   - Navigate to "Cart"     →  Delete "Apple monitor 24" from cart.
        cart.click();
        deleteAppleCart.click();
        //  - Verify total equals Samsung galaxy s6 price ( 360 )
        Assert.assertEquals( price.getText(), "360", "price different, test failed" );
    }

    @AfterMethod
    public void close() {
        //close
        Driver.getDriver().close();
    }
}
