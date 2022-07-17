package com.cydeo.selenium.ClassTime.ExtraTasks;

import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

//        1. Add a new class GasMileageCalculatorTest
public class GasMileageCalculatorTest {
    @Test
    public void gasMileage_test() throws InterruptedException {
        //        Task #: Gas Mileage Calculator Automation Test

        //        2. Go to https://www.calculator.net
        Driver.getDriver().get( "https://www.calculator.net" );
        //        3. Search for “gas mileage” using search box
        Driver.getDriver().findElement( By.id( "calcSearchTerm" ) ).sendKeys( "gas mileage" + Keys.ENTER );
        //        4. Click on the “Gas Mileage Calculator” link
        Driver.getDriver().findElement( By.linkText( "Gas Mileage Calculator" ) ).click();
        Thread.sleep( 6000 );
        //        5. On Next page verify:
        //        a. Title equals: “Gas Mileage Calculator”
        assertEquals( "Title is different, Test FAILED", "Gas Mileage Calculator", Driver.getDriver().getTitle() );
        //        b. “Gas Mileage Calculator” label is displayed
        WebElement label = Driver.getDriver().findElement( By.xpath( "//h1[.='Gas Mileage Calculator']" ) );
        assertTrue( "label is not displayed, Test FAILED", label.isDisplayed() );
//        6. Locate, clear and type “7925” into “Current odometer” field
        Actions actions = new Actions( Driver.getDriver() );
        WebElement COR = Driver.getDriver().findElement( By.id( "uscodreading" ) );
        actions.doubleClick( COR ).sendKeys( Keys.DELETE + "7925" ).perform();
//        7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement POR = Driver.getDriver().findElement( By.id( "uspodreading" ) );
        actions.doubleClick( POR ).sendKeys( Keys.DELETE + "7550" ).perform();
//        8. Locate, clear and type “16” into “Gas added” field
        WebElement GAttT = Driver.getDriver().findElement( By.id( "usgasputin" ) );
        actions.doubleClick( GAttT ).sendKeys( Keys.DELETE + "16" ).perform();
//        9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gas_price = Driver.getDriver().findElement( By.id( "usgasprice" ) );
        gas_price.clear();
        gas_price.sendKeys( "3.55" );

//        10. Click on Calculate button
        Driver.getDriver().findElement( By.xpath( "(//input[@type=\"image\"])[1]" ) ).click();
//        11. Verify mpg value is as expected:
//        Expected value: “23.44 mpg”
        WebElement result = Driver.getDriver().findElement( By.xpath( "(//b)[1]" ) );
        assertEquals( "result displayed incorrectly,Test FAILED", result.getText(), "23.44 mpg" );

    }

    @AfterTest
    public void close() {
        Driver.getDriver().close();
    }
}
