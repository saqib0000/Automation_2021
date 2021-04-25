package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

public class practice7 {
    public static void main(String[] args) throws InterruptedException, IOException {

        //kill all chrome instances that are opened
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        Thread.sleep(1000);
        //set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");
        //set the driver to incognito(private)
        options.addArguments("incognito");
        //set it to headless
        //options.addArguments("headless");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);


        String[] FindLocationZip = new String[]{"11228", "11223", "11224"};
        String[] LocationType = new String[]{"Post Office", "Collection Boxes", "gopost"};
        String[] LocationMile = new String[]{"10 Miles", "20 Miles", "25 Miles"};


        for (int i = 0; i < 3; i++) {
            //Navigate to usps.com
            try {
                driver.navigate().to("https://www.usps.com");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to navigate to website " + e);
            }//end of exception

            //verify the title of the website
            String Actualtitle = driver.getTitle();
            if (Actualtitle.equals("Welcome | USPS")) {
                System.out.println("title matches");
            } else {
                System.out.println("title does not match " + Actualtitle);
            }//end of conditional statement

            //define mouse options
            Actions actions = new Actions(driver);

            //Hover to "send" tab
            try {
                WebElement Send = driver.findElement(By.xpath("//*[@id= 'mail-ship-width']"));
                actions.moveToElement(Send).perform();
            } catch (Exception e) {
                System.out.println("Unable to hover to SEND " + e);
            }// end of send exception

            //click on find locations
            try {
                WebElement FindLocation = driver.findElement(By.xpath("//*[contains(@href,'/find-location.htm')]"));
                actions.moveToElement(FindLocation).click().perform();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("unable to click on find usps locations " + e);
            }//end of find usps locations exception


            //search find a location and send the string
            try {
                WebElement findalocation = driver.findElement(By.xpath("//*[@id= 'city-state-input']"));
                findalocation.click();
                findalocation.sendKeys(FindLocationZip[i]);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("unable to search zipcodes " + e);
            }//end of findalocation exception

            //search for location type using string
            try {
                WebElement LocationTypes = driver.findElement(By.xpath("//*[@id= 'post-offices-select']"));
                LocationTypes.click();
                driver.findElement(By.xpath("//*[text()= '" + LocationType[i] + "']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("unable to search location types " + e);
            }// end of location exception

            //search miles
            try {
                WebElement location = driver.findElement(By.xpath("//*[@id='within-select']"));
                location.click();
                driver.findElement(By.xpath("//*[text()= '" + LocationMile[i] + "']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("unable to search miles " + e);
            }//end of mile exception

            //click search
            try {
                WebElement search = driver.findElement(By.xpath("//*[@id= 'searchLocations']"));
                search.click();
            } catch (Exception e) {
                System.out.println("unable to search " + e);
            }// end of search exception

            Thread.sleep(2000);

            try {
                //  ArrayList<WebElement> links = new ArrayList <> (driver.findElement(By.xpath("//*[@id='resultBox']")));
            } catch (Exception e) {
                System.out.println("Unable to linksss man " + e);
            }

        }//end of main method
    }//end of java class
}
