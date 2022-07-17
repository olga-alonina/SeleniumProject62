package com.cydeo.selenium.OH.OH_day5;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class Crunch {
    @Test
    public void crunch_Test() {
//    1- Go to https://techcrunch.com/
        Driver.getDriver().get( "https://techcrunch.com/" );
//            2- For “The Latest News” list, verify followings;
        List<WebElement> newsList = Driver.getDriver().findElements
                ( By.xpath( "//article[@class='post-block post-block--image post-block--unread']" ) );
        System.out.println( "newsList.size() = " + newsList.size() );

//       a. each news has an author
        List<WebElement> listAuthors = Driver.getDriver().findElements( By.xpath( "//article// header// div// div// span// span//a" ) );
        for (WebElement each : listAuthors) {
            Assert.assertTrue( each.getAttribute( "href" ).contains( "author" ),
                    "This news doesnot have author, Test FAILED" );
        }
        System.out.println( "listAuthors.size() = " + listAuthors.size() );
        //b. each news has an image
        List<WebElement> listIMG = Driver.getDriver().findElements( By.xpath( "// article//footer//figure//picture//img" ) );
        for (WebElement each : listIMG) {
            Assert.assertEquals( each.getTagName(), "img", "This news doesnot have image, Test FAILED" );
        }
        System.out.println( "listIMG.size() = " + listIMG.size() );
        //	3- Click one of news from “The Latest News” list to reach the full content and verify followings;
        //    a. the browser title is the same with the news title
        WebElement news = Driver.getDriver().findElement( By.xpath(
                "(//a[@class=\"post-block__title__link\"])[1]" ) );
        news.click();
        String browserTitle = Driver.getDriver().getTitle();
        System.out.println( "browserTitle = " + browserTitle );
        String newsTitle = news.getText();
        System.out.println( "newsTitle = " + newsTitle );
        Assert.assertTrue(  browserTitle.contains( newsTitle ), "Titles is not match, Test Failed" );
//    b. the links within the news content
        List<WebElement> content = Driver.getDriver().findElements( By.xpath( "//a[@class='post-block__title__link']" ) );
        for (WebElement inside : content) {
            System.out.println( "Link content " + inside.getText() );
        }
    }

    @AfterTest
    public void close() {
        Driver.getDriver().close();
    }

}

