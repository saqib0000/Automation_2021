package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResults {
    public static void main(String[] args) throws InterruptedException {

        //.sendKeys()- to type something in the field
        //.click()- to click on a element
        /*submit()- sometimes click does not work when there is a pop up and it is blocking the element to click on so u
         can use submit which is like hitting enter key on your keyboard/*
         */

   //set the property of the chrome driver
   System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
   //define the webdriver
        WebDriver driver = new ChromeDriver();

        // navigate to google home
        driver.navigate().to( "https://www.google.com");

        //maximize the driver
        driver.manage().window().maximize();

        //enter a keyword on google search field
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys( "cars");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();

// new page appears so put additional wait
        Thread.sleep(1000);

        //capture the search result but only print out the search number
        String searchResult= driver.findElement(By.xpath("//*[@id= 'result-stats']")).getText();

        //split and extract out the search number
        String[] arrayResults = searchResult.split(" ");

        //print the search number
        System.out.println("My search number is " + arrayResults[1]);

        driver.quit();



    }//end of main method
}//end of java class



