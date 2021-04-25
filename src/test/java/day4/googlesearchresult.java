package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchresult {

    public static void main(String[] args) {

        //set the system property of where the driver is located so u can use it
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the webdriver with variable to use
        WebDriver driver = new ChromeDriver();

        //navigate/get to google home page
        //driver.navigate().to("https://www.yahoo.com");
        driver.navigate().to("https://www.youtube.com");







    }//end of main method







}//end of java class
