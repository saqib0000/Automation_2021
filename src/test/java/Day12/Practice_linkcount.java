package Day12;

import Day9.ReusableMethod;
import Reusable_Library.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

public class Practice_linkcount {

    @Test
    public void linkcount () throws IOException, InterruptedException {

        WebDriver driver = Reusable_Actions.defineTheDriver();

        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);

        ExtentTest logger = null;
        Reusable_Actions.clickOnElement(driver,"//*[id= 'ybar-sbq']", logger,"searchbar");

        Reusable_Actions.sendKeysMethod(driver,"//*[id= 'ybar-sbq']","cars",logger,"cars");

        }












    }
//end of java class
