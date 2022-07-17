package com.cydeo.selenium.OH.AH_2;

import com.cydeo.pages.TempMail;
import com.cydeo.utilities.utility_driver.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTempMail {
    @Test
    public void Test() throws InterruptedException {
        TempMail tempMail = new TempMail();
        // Step 2. Copy and save email as a string.
        String gotEmail = tempMail.email.getText();
//    Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
        Driver.getDriver().navigate().to( "https://practice-cybertekschool.herokuapp.com" );
//    Step 4. And click on “Sign Up For Mailing List"
        tempMail.emailList.click();
//    Step 5. Enter any valid name.
        tempMail.full_name.sendKeys( "Alonina Olga" );
//    Step 6. Enter email from the Step 2.
        tempMail.emailInput.sendKeys( gotEmail );
//    Step 7. Click Sign Up
        tempMail.signUp.click();
//    Step 8. Verify that following message is displayed:
//            “Thank you for signing up. Click the button below to return to the home page.”
        Assert.assertEquals( tempMail.signup_message.getText(),
                "Thank you for signing up. Click the button below to return to the home page." );
//    Step 9. Navigate back to the “https://www.fakemail.net/”
        Driver.getDriver().navigate().to( "https://www.fakemail.net/" );
        Actions actions = new Actions( Driver.getDriver() );
        actions.moveToElement( tempMail.cydeoMail );
//    Step 10. Verify that you’ve received an email from -> “do-not-reply@practice.cydeo.com”
        Assert.assertTrue( tempMail.cydeoMail.getText().contains( "do-not-reply@practice.cydeo.com") );
//    Step 11. Click on that email to open it.
        tempMail.cydeoMail.click();
//            Step 12. Verify that email is from: “do-not-reply@practice.cydeo.com”
        Assert.assertEquals( tempMail.fromAddress.getText(), "do-not-reply@practice.cydeo.com" );

//    Step 13. Verify that subject is: “Thanks for subscribing to practice.cydeo.com!”
        Assert.assertEquals( tempMail.subject.getText(), "Thanks for subscribing to practice.cydeo.com!" );

        //close
        Driver.getDriver().close();
    }
}
