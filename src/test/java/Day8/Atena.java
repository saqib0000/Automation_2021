package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;

public class Atena {
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<String> Zipcode = new ArrayList<>();
        Zipcode.add("11229");
        Zipcode.add("11228");
        Zipcode.add("11221");

        ArrayList<Integer> milesRange = new ArrayList<>();
        milesRange.add(25);
        milesRange.add(30);
        milesRange.add(35);

        for (int i=0;i<3;i++){

            //kill all chrome instances that are open
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");

            // define the driver path
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            //set the chrome options arguments
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            options.addArguments("start-maximized");

            WebDriver driver = new ChromeDriver(options);

            //Navigate to website
            driver.navigate().to("https://www.aetna.com");
            Thread.sleep(2000);

            String Actualtitle = driver.getTitle();
            if (Actualtitle.equals("Health Insurance Plans | Aetna")) {
                System.out.println("title matches");
            } else {
                System.out.println("title does not match " + Actualtitle);
            }//end of conditional statement

            //click on shop for a plan
            try {
                driver.findElement(By.xpath("//*[text() = 'Shop for a plan']")).click();

            }catch (Exception e){
                System.out.println("unable to click shop for a plan " + e);
            }//end of shop for plan exception

            //define the mouse actions
            Actions actions = new Actions(driver);

            //hover to medicare link
            try{
                //store your element as WebElement
                WebElement medicare  = driver.findElement(By.xpath("//*[text() = 'Medicare']"));
                //move your mouse actions to quick tools fro dropdown to appear
                //you always end your mouse actions with .perform()
                actions.moveToElement(medicare).perform();
            } catch (Exception e) {
                System.out.println("Unable to hover to medicare. " + e);
            }//end of quick tools exception

            //click on find a doctor

            try{
                driver.findElement(By.xpath("//*[text() = 'Find a doctor ']")).click();
            }catch (Exception e){
                System.out.println("unable to click find a doctor " + e);
            }//end of find a doctor exception

            Thread.sleep(2000);

            //click 2021 medicare plans you purchase yourself
            try {
                driver.findElement(By.xpath("//*[text() = '2021 Medicare plans you purchase yourself']")).click();
            }catch (Exception e){
                System.out.println("unable to click 2021 medicare plans to purchase yourself " + e);
            }//end of exception

            //type zipcode
            try {
               WebElement zipcode= driver.findElement(By.xpath("//*[@id= 'medZip']"));
               zipcode.sendKeys(Zipcode.get(i));
            }catch (Exception e){
                System.out.println("unable to send zipcode list " + e);
            }//end of zipcode exception

            Thread.sleep(2000);

            //click zipcode link

            try {
                WebElement zipcodeLink = driver.findElement(By.xpath("//*[@class = 'typeahead_grouping active']"));
                zipcodeLink.click();
            }catch (Exception e){
                System.out.println("unable to click zipcode link " + e);

            }//End of zipcode link exception
            Thread.sleep(100);

            //select miles using slider
            try {
WebElement slide = driver.findElement(By.xpath("//span[@role= 'slider']"));
Actions move = new Actions(driver);
Action actions1 = move.dragAndDropBy(slide, milesRange.get(i),0).build();
                actions.perform();
            }catch (Exception e){
                System.out.println("unable to select miles " + e);
            }






























        }//End of loop












    }//End of main method
}//End of java class
