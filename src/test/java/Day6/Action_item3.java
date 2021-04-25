package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import java.sql.Driver;

public class Action_item3 {
    public static void main(String[] args) throws InterruptedException {


        // Declare and define Int adn String
        String[] Purchaseprice = new String[]{"300000","400000","500000"};
        String[] DownPayment = new String[]{"15", "10", "20",};
        String[] MortgageTerm = new String[]{"25","30","35"};
        String[] InterestRate = new String[]{"4", "3", "5",};
        String[] Pmi = new String[]{"1","2","3"};
        String[] StartMonth = new String[]{"Jan", "Feb", "Apr"};
        String[] StartYear = new String[]{"2024","2022","2023"};

        //define the driver path
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //set the chrome options arguments
        ChromeOptions options = new ChromeOptions();

        //maximize the driver
        options.addArguments("start-maximized");

        //set it to incognito/private
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

         //set the for loop
        for (int i=0;i<3;i++){

            driver.navigate().to("https://www.mlcalc.com");

            Thread.sleep(2000);



            //clear and enter payment price
            WebElement PurchasePrice = driver.findElement(By.xpath("//*[@value='312,500']"));

            PurchasePrice.clear();
            // enter new purchasepprice
            PurchasePrice.sendKeys(Purchaseprice[i]);


            WebElement Downpayment = driver.findElement(By.xpath("//*[@value='20']"));

            Downpayment.clear();
            // enter new downpayment
            Downpayment.sendKeys(DownPayment[i]);



            WebElement Mortgageterm = driver.findElement(By.xpath("//*[@value='30']"));
            Mortgageterm.clear();
            Mortgageterm.sendKeys(MortgageTerm[i]);


            WebElement Interestrate = driver.findElement(By.xpath("//*[@value='4.5']"));
            Interestrate.clear();
            Interestrate.sendKeys(InterestRate[i]);


            WebElement PMI = driver.findElement(By.xpath("//*[@value='0.52']"));
            PMI.clear();
            PMI.sendKeys(Pmi[i]);


            WebElement Startmonth = driver.findElement(By.xpath("//*[@name='sm']"));
            Select dropdown = new Select(Startmonth);
            dropdown.selectByVisibleText(StartMonth[i]);


            WebElement Startyear = driver.findElement(By.xpath("//*[@name='sy']"));
            Startyear.click();
            driver.findElement(By.xpath("//*[text()='" + StartYear[i] + "']")).click();


            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
            Thread.sleep(2000);

            String mntPayment = driver.findElements(By.xpath("//td[@class= 'big']")).get(0).getText();
            System.out.println("My monthly payment is " + mntPayment);

        }//end of for loop


        //verify the title with your expected
        String actualtitle = driver.getTitle();
        if (actualtitle.equals("Auto Loan Calculator")) {
            System.out.println("title matches");
        }else {
            System.out.println("title does not match" + actualtitle);
        }//end of conditional statement





    }//end of method
}//end of java class
