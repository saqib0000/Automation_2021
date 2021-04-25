package Day12;

import Reusable_Library.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.sql.Driver;

public class fuckthis {
    public static void main(String[] args) throws InterruptedException {

        //set the property of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the webdriver
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.yahoo.com");

        WebElement searchbar = driver.findElement(By.xpath("//*[@id= 'ybar-sbq']"));
        searchbar.sendKeys("cars");
        driver.findElement(By.xpath("//*[@id= 'ybar-search']")).click();

        Thread.sleep(2000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,5000)");

        String searchresult = driver.findElement(By.xpath("//*[@class='compPagination']")).getText();
        String[] arrayresult = searchresult.split("Next");
        System.out.println("my number is " + arrayresult[1]);

        driver.quit();

    }



    }













