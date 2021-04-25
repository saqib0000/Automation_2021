package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculator {
    public static void main(String[] args) throws InterruptedException {

        //set path to driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the chrome options arguements
        ChromeOptions options = new ChromeOptions();

        // maximize my driver
        options.addArguments("start-maximized");

        //set it to incognito/private
        options.addArguments("incognito");

        //set it to headless
        //options.addArguments("headless");

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.mortgagecalculator.org");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //verify the title with your expected
        String actualtitle = driver.getTitle();
        if (actualtitle.equals("mortgage calculator")) {
            System.out.println("title matches");
        }else {
            System.out.println("title does not match" + actualtitle);
        }//end of conditional statement


        //you have to name the variables after WebElement
        //store home value first
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));

        //clear the previous data
        homeValue.clear();
        //enter the new home value
        homeValue.sendKeys("350000");

        Thread.sleep(1000);

        //store down payment first
        WebElement dpayment = driver.findElement(By.xpath("//*[@id='downpayment']"));

        // clear the previous data
        dpayment.clear();
        //
        //enter the new downpayment
        dpayment.sendKeys("2349999");

        Thread.sleep(1000);

        //select april on month dropdown
        WebElement startmonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //select the locator using select command
        Select dropdown = new Select(startmonth);

        //using by visible text command select month April
        //has to be the exact text that you see
        dropdown.selectByVisibleText("Apr");

        Thread.sleep(3000);

        //if dropdown is not under select tag then you have to use click command twice
        //click on dropdown

        startmonth.click();
        //click on dropdown value by text
        driver.findElement(By.xpath("//*[text()= 'May']")).click();


        //click on calculate button
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(3000);

        //capture the monthly payment using FindElemnts with first index
        String mntPayment = driver.findElements(By.xpath("//div[@class= 'left-cell']")).get(0).getText();
        System.out.println("My monthly payment is " + mntPayment);

        Thread.sleep(3000);

        driver.quit();

         /* you can only use select command if there is a select name. If an element
           does not have a select name when u inspect, you should use click command.

            */
        //WebElement Startmonth = driver.findElement(By.xpath("//*[@name= 'sm']"));
        //Select dropdown= new Select(Startmonth);
        //dropdown.selectByVisibleText(startMonth[i]);

            /*in click command, you have to identify the element by the TEXT name, which is
            usually a black or white color when you inspect the element .
             */
        //WebElement Startyear = driver.findElement(By.xpath("//*[@name = 'sy']"));
        //Startyear.click();
        //driver.findElement(By.xpath("//*[text()='" + startYear[i] + "']")).click();

       // driver.findElement(By.xpath("//*[@value='Calculate']")).click();
















    }//end of main method
}//end of java class
