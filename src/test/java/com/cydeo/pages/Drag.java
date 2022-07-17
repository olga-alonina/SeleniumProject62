package com.cydeo.pages;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Drag {

    @FindBy(css = "img[alt='The peaks of High Tatras']")
    public WebElement tatras;
    @FindBy(css = "img[alt='The chalet at the Green mountain lake']")
    public WebElement tatras2;

    @FindBy(xpath = "//div[@id='trash']")
    public WebElement trashCan;

    @FindBy(xpath = "//div[@id='trash']//h5")
    public List<WebElement> trashList;
    @FindBy(xpath = "//iframe[@class='demo-frame lazyloaded']")
    public WebElement iframe;

    public Drag() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

}