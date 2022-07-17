package com.cydeo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.cydeo.utilities.Driver_TestBase.WebDriverFactory.getDriver;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public static void setUp() {
        driver = getDriver( "chrome" );
      //  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      //driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );

        //        WebDriverManager.chromedriver().setup();
        //        driver = new ChromeDriver();
        //        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
