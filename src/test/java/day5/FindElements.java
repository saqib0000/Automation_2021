package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
    public static void main(String[] args) throws InterruptedException {
        //set the property of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the webdriver
        WebDriver driver = new ChromeDriver();

        // navigate to google home
        driver.navigate().to( "https://www.google.com");

        //maximize the driver
        driver.manage().window().maximize();

        Thread.sleep(1000);

        //using findElements click on store link from the class group
        //driver.findElements(By.xpath("//*[@class= 'MV3TNB']")).get(1).click();
        driver.findElements(By.xpath("//*[@class= 'gb_g']")).get(1).click();
        //check to see if diff elements have the same class bc they will nd then use findElements with a S.












    }//end of main method
}//end of public class
