package Day10;

import Day9.ReusableMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Practice {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Define the driver
        WebDriver driver = ReusableMethod.defineTheDriver();

        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com");

        //search marin
        ReusableMethod.sendKeysMethod(driver,"//*[@id= 'ybar-sbq']", "Marin", "search name ");

        //click search
        ReusableMethod.clickOnElement(driver,"//*[@id= 'ybar-search']", "Search ");

        Thread.sleep(2000);

        //scroll to bottom of page

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to the bottom by pixels
        jse.executeScript("scroll(0,10000)");

        Thread.sleep(2000);

        String Searchresult = ReusableMethod.CaptureTextElement(driver,"//div[@class='compPagination']","Search");
        String[] arrayResult = Searchresult.split("Next");
        String[] arrayNumber = arrayResult[1].split("results");



        System.out.println("my search result is " + arrayNumber[0]);










    }//end of main method
}//end of java class
