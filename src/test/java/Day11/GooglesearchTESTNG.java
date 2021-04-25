package Day11;

import Day9.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class GooglesearchTESTNG {
    /** capture search result for google **/
//declare the global variables outside of annotation method
//you have to initialize global variables with some null/empty values
    WebDriver driver = null;
    private ReusableMethod Reusable_Methods;

    //use before suite when you have multiple @test methods
    @BeforeSuite
    public void setupDriver() throws IOException, InterruptedException {
        driver = ReusableMethod.defineTheDriver();
    }//end of driver set up

    //navigate to google, enter a keyword and hit submit
    @Test(priority = 1)
    public void googleSearch() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //enter a keyword
        ReusableMethod.sendKeysMethod(driver,"//*[@name='q']","cars","Google Search Field");
        //submit on google search button
        ReusableMethod.submitOnElement(driver,"//*[@name='btnK']","Google Search Button");
        Thread.sleep(2500);
    }//end of google search

    //capture the search number from search result page
    @Test(priority = 2)
    public void captureSearchNumber(){
        String result = ReusableMethod.captureText(driver,"//*[@id='result-stats']",0,"Google Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
    }//end of google search

    //quit my driver
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }//end of close browser












}//end of java class
