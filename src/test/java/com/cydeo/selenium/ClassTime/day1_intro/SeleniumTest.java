package com.cydeo.selenium.ClassTime.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //- setting up web driver manager
       WebDriverManager.chromedriver().setup();
       // manually setting up web driver manager
       //System.setProperty( "webdriver.chrome.driver", "C:\\Users\\wifec\\Desktop\\ExercisesCydeo\\Ausun\\chromedriver.exe" );
        //2) create instance for chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.google.com" );

    }
}
