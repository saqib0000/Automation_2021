package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Practice8 {
    public static void main(String[] args) throws InterruptedException, IOException {

        //kill all chrome instances that are opened
        //for windows
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        //for mac
        //Runtime.getRuntime().exec("killall -KILL chromedriver");
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

        //navigate to yahoo page
        try{
            driver.navigate().to("https://www.usps.com");
        }catch (Exception e) {
            System.out.println("unable to navigate to usps " + e);
        }//end of navigate exception

        Thread.sleep(2500);

        //define the mouse option
        Actions actions = new Actions(driver);

        //hover to quick tools tab
        try {
            WebElement quicktools = driver.findElement(By.xpath("//*[@class= 'nav-first-element menuitem']"));
            actions.moveToElement(quicktools).perform();
        }catch (Exception e) {
            System.out.println("unable to hover to Quick Tools");
        }//end of exception

        //click on track a package using mouse action
        try{
            //store element as webelement
            WebElement trackpackage = driver.findElement(By.xpath("//*[text()= 'Track a Package']"));
            actions.moveToElement(trackpackage).click().perform();
        }catch (Exception e){
            System.out.println("unable to click Track Package " + e);
        }//end of exception

        Thread.sleep(2500);

        //enter tracking number
        try{
            WebElement trackbar = driver.findElement(By.xpath("//*[@id='tracking-input']"));
            actions.moveToElement(trackbar).click().sendKeys("22222").perform();
        }catch (Exception e){
            System.out.println("unable to enter datat for track packagae " + e);
        }



























    }//end of main method
}//end of java class
