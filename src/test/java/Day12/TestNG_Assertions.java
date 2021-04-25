package Day12;

import Day9.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNG_Assertions {

    @Test
    public void assertions() throws IOException, InterruptedException {
        WebDriver driver = ReusableMethod.defineTheDriver();

        driver.navigate().to("https://www.google.com");

        //using hard insert verify the google title
        //Assert.assertEquals("Google", driver.getTitle());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Google",driver.getTitle());

        //enter something on google search
        ReusableMethod.sendKeysMethod(driver,"//*[@name= 'q']", "cars", "search");

        //assertAll should be the last step on your test
        softAssert.assertAll();


    }//end of method

}//end of java class

