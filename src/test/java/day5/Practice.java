package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import javax.naming.directory.SearchResult;
import java.sql.Driver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        //path to driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://www.mlcalc.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //verify title with expected
        String actualtitle = driver.getTitle();
        if (actualtitle.equals("Mortgage Calculator")) {
            System.out.println("title matches");
        } else {
            System.out.println("title does not match ");
        }//end of condition

        WebElement PurchasePrice = driver.findElement(By.xpath("//*[@value='312,500']"));
        PurchasePrice.clear();
        PurchasePrice.sendKeys("200,000");

        WebElement InterestRate = driver.findElement(By.xpath("//*[@value= '30']"));
        InterestRate.clear();
        InterestRate.sendKeys("15");

        WebElement Calculate = driver.findElement(By.xpath("//*[@value= 'Calculate']"));
        Calculate.click();
        Thread.sleep(3000);

        String TotalMonthly_Payment = driver.findElements(By.xpath("//td[@class= 'big']")).get(0).getText();
        System.out.println("my monthly payment is " + TotalMonthly_Payment);

        //select April on dropdown
        WebElement April = driver.findElement(By.xpath("//*[@name= 'sm']"));
        Select dropdown = new Select(April);
        dropdown.selectByVisibleText("Jul");

        WebElement year= driver.findElement(By.xpath("//*[@name= 'sy']"));
        year.click();
        driver.findElement(By.xpath("//*[text()= '2022']")).click();










    }//end of main method
}//end of java class
