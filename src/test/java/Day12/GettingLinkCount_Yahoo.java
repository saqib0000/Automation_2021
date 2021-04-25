package Day12;

import Day9.ReusableMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class GettingLinkCount_Yahoo {

    @Test
    public void linkcount () throws InterruptedException, IOException {

        WebDriver driver = ReusableMethod.defineTheDriver();

        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(2000);

        //store the arraylist with class attribute for the links
        ArrayList  <WebElement> linkcount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class, '_yb_tgcvx')]")));

        //print out the count of the links
        System.out.println("Link count is " + linkcount.size());

        //i want to click on each link and navigate back to the page
        for (int i = 0;i<linkcount.size();i++){
            driver.navigate().to("https://www.yahoo.com");
            Thread.sleep(5000);
            linkcount =  new ArrayList(driver.findElements(By.xpath("//*[contains(@class, '_yb_tgcvx')]")));
            linkcount.get(i).click();
            Thread.sleep(2000);
        }// end of for loop

    }//end of test

}//end of java class
