package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Uitestpractice_page {
    public Uitestpractice_page() {
        Driver.getDriver().get( "http://www.uitestpractice.com/" );
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(css = "div[class='container BurlyWood']")
    public WebElement slider_control;
    @FindBy(css = "div[class='scroll-content-item ui-widget-header']")
    public List<WebElement > setNumbers;
    @FindBy(xpath = "//div[.='20']")
    public WebElement twenty;
    @FindBy(css = "div[class='container body-content']")
    public WebElement main_page;
    @FindBy(css = "a[class='navbar-brand']")
    public WebElement testing_controls;
    @FindBy(xpath = "//a[.='Home']")
    public WebElement home;
    @FindBy(id="Search_Data")
    public WebElement search_name;
    @FindBy(xpath = "(//div[1]/text())[18]")
    public WebElement error_message;
    @FindBy(xpath = "//body/input[@id='name']")
    public WebElement enter_name_iframe;
    @FindBy(name = "iframe_a")
    public WebElement iframe;
    @FindBy(xpath = "//a[@target='iframe_a']")
    public WebElement link;
@FindBy(xpath = "//h3[@style='color: crimson;']")
   public WebElement drag_and_drop_control;





}
