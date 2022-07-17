package com.cydeo.selenium.OH.OH_day_9_10_11;

import com.cydeo.utilities.utility_driver.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Interview_Task_demoblaze {
    public Interview_Task_demoblaze() {
        Driver.getDriver().get( "https://www.demoblaze.com/index.html" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptop;
    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sony;
    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart;
    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phones;
    @FindBy(xpath = "//a[.='Samsung galaxy s6']")
    public WebElement samsung;
    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitors;
    @FindBy(xpath = "//a[.='Apple monitor 24']")
    public WebElement apple;
    @FindBy(id = "cartur")
    public WebElement cart;
    @FindBy(xpath = "//a[.='Delete']/../preceding-sibling::td[2]")
    public List<WebElement> deleteBt;
    @FindBy(css = "button[class='btn btn-success']")
    public WebElement placeOrder;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "card")
    public WebElement card;
    @FindBy(id = "month")
    public WebElement month;
    @FindBy(id = "year")
    public WebElement year;
    @FindBy(xpath = "button[onclick='purchaseOrder()']")
    public WebElement purchase;
    @FindBy(xpath = "//p/text()[2]")
    public WebElement amount;
    @FindBy(xpath = "(//p/text())[9]")
    public WebElement id;
    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;
    @FindBy(xpath = "table[class='table table-bordered table-hover table-striped']")
    public List<WebElement> orderList;


    @Test
    public void testLaptop() {
//        • Navigate to "Laptops" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
        laptop.click();
        sony.click();
        addToCart.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Test
    public void testPhones() {
//        • Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.
        phones.click();
        samsung.click();
        addToCart.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Test
    public void testMonitors() {
        //        • Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
        monitors.click();
        apple.click();
        addToCart.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Test
    public void TestNext() {
        //        • Navigate to "Cart" → Delete "Apple monitor 24" from cart.
        cart.click();
        for (WebElement eachDelete : deleteBt) {
            System.out.println( "deleteBt = " + deleteBt.size() );
            if (eachDelete.getText().contains( "Apple" )) {
                eachDelete.click();
                break;
            }
        }
        //        • Click on "Place order".
        placeOrder.click();
        //        • Fill in all web form fields.
        Faker faker = new Faker();
        //name
        name.sendKeys( faker.name().fullName() );
        country.sendKeys( faker.country().name() );
        city.sendKeys( faker.address().cityName() );
        card.sendKeys( faker.finance().creditCard() );
        month.sendKeys( faker.numerify( "11" ) );
        year.sendKeys( faker.numerify( "2025" ) );
        //        • Click on "Purchase"
        purchase.click();
        //        • Capture and log purchase Id and Amount.
        System.out.println( "amount = " + amount.getText() );
        System.out.println( "id = " + id.getText() );
        //        • Assert purchase amount equals expected.
        String expected_amount = "Amount: 760 USD";
        Assert.assertEquals( amount.getText(), (expected_amount) );
        //        • Click on "Ok"
        OK.click();
        //        • Verify that there is no product in the cart
        samsung.click();//we need to see cart
        cart.click();
        Assert.assertEquals( orderList.size(), 3 );
        Driver.getDriver().close();
    }
}