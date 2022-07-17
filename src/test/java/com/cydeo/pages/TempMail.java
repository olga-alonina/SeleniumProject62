package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempMail {
    public TempMail() {
        Driver.getDriver().get( "https://www.fakemail.net/" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(id = "email")
    public WebElement email;
    @FindBy(css = "a[href='/sign_up']")
    public WebElement emailList;
    @FindBy(css = "input[type='text']")
    public WebElement full_name;
    @FindBy(css = "input[type='email']")
    public WebElement emailInput;
    @FindBy(css = "button[type='submit']")
    public WebElement signUp;
    @FindBy(css = "h3[name='signup_message']")
    public WebElement signup_message;
    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement cydeoMail;
    @FindBy(id="odesilatel")
    public WebElement fromAddress;
    @FindBy(xpath = "//span[.='From:']")
    public WebElement wordFrom;
    @FindBy(id="predmet")
    public WebElement subject;
    @FindBy(xpath = "//span[.='Subject:']")
    public WebElement wordSubject;

}
