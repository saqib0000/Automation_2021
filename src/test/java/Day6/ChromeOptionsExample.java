package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {

        //set path to driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the chrome options arguements
        ChromeOptions options = new ChromeOptions();

        // maximize my driver
        options.addArguments("start-maximized");

        //set it to incognito/private
        options.addArguments("incognito");

        //set it to headless
        options.addArguments("headless");

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo page
        driver.navigate().to ( "https://www.yahoo.com");
        driver.manage(). window().maximize();








    }//end of main method
}//end of java class
