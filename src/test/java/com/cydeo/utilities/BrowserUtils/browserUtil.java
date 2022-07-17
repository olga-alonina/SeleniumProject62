package com.cydeo.utilities.BrowserUtils;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class browserUtil {
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            driver.switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();

        Assert.assertTrue( actualTitle.contains(expectedTitle), "Title verification failed!" );
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {

        Assert.assertEquals( driver.getTitle(), expectedTitle );

    }
    public static void verify_title_with_containMethods(String exp_contain, String exp_contain2) {
        String act_title = Driver.getDriver().getTitle();
        System.out.println( act_title );
        Assert.assertTrue( act_title.contains( exp_contain ) ||
                        act_title.contains( exp_contain2 ), "Test FAIL, title is not verified" );
    }

    public static void verify_title_with_equalMethod(String exp_title) {
        String act_title = Driver.getDriver().getTitle();
        Assert.assertEquals( "Test FAIL, title is not verified", exp_title, act_title );

    }
    public static boolean isButtonOnLeft(WebElement secButton, String button1, String button2){
        boolean check=false;
        String xpath = "//a@title  = '"+button1+"'/..//preceding-sibling::a[@title='"+button2+"']";
        if(secButton.isDisplayed()){
            check=true;
        }
        return check;

    }
    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static List<String> getElementsText(List<WebElement> elements) {


        List<String> elementsText=new ArrayList<>();

        for (WebElement element : elements) {
            elementsText.add( element.getText());
        }

        return elementsText;
    }


    public static List<String> getElementsTextWithStream(List<WebElement> elements) {

        return elements.stream().map(x->x.getText()).collect( Collectors.toList());
    }
}