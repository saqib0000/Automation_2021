package Reusable_Library;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Reusable_Actions_PageOBJECTS {

    //create a reusable method for navigate to a page
    public static WebDriver defineTheDriver() throws InterruptedException, IOException, IOException {
        //kill all chrome instances that are opened
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
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

        return driver;
    }//end of navigate method

    public static WebDriver defineTheDriverByHeadless() throws InterruptedException, IOException {
        //kill all chrome instances that are opened
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
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
        options.addArguments("headless");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }//end of navigate method with headless


    //method to click on any webelement by explicit wait
    public static void clickOnElement(WebDriver driver, WebElement xpathLocator,ExtentTest logger, String elementName) {
        //define by explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //use try catch to locate an element and click on it
        try {
            wait.until(ExpectedConditions.visibilityOf(xpathLocator)).click();
            logger.log(LogStatus.PASS,"Successfully clicked on element " + elementName);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + " " + e);
            System.out.println("Unable to click on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of click method

    //method to type on any webelement by explicit wait
    public static void sendKeysMethod(WebDriver driver, WebElement xpathLocator, String userValue,ExtentTest logger, String elementName) {
        //define by explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //use try catch to locate an element and click on it
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpathLocator));
            element.clear();
            element.sendKeys(userValue);
            logger.log(LogStatus.PASS,"Successfully entered a value on " + elementName);
        } catch (Exception e){
        logger.log(LogStatus.FAIL,"Unable to enter value on element " + elementName + " " + e);
            System.out.println("Unable to enter value on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of sendkeys method

    public static void dropdownByText(WebDriver driver, String xpath, String userValue, ExtentTest logger,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select dropDown = new Select(element);
            dropDown.selectByVisibleText(userValue);
            logger.log(LogStatus.PASS,"Successfully selected by dropdown " + elementName);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to select value by dropdown " + elementName + " " + e);
            System.out.println("Unable to select a value from " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of dropdown by text

    public static String captureText(WebDriver driver, WebElement xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfAllElements(xpath)).get(index);
            result = element.getText();
            logger.log(LogStatus.PASS,"Successfully captured text " + elementName);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to enter value on element " + elementName + " " + e);
            System.out.println("Unable to select a value from " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
        return result;
    }//end of capture text

    public static void MouseHover(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        Actions actions = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS,"Successfully hover to " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover to element " + elementName + " " + e);
            logger.log(LogStatus.FAIL,"Unable to hover to an element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }
    }//end of MouseHover method

    public static void MouseHoverClick(WebDriver driver, String xpath, String elementName) {
        Actions actions = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            actions.moveToElement(element).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to element " + elementName + " " + e);

        }

    }//end of MouseHoverClick


    public static void submitOnElement(WebDriver driver, WebElement xpathLocator, ExtentTest logger, String elementName) {
        //define by explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //use try catch to locate an element and click on it
        try {
            wait.until(ExpectedConditions.visibilityOf(xpathLocator)).submit();
            logger.log(LogStatus.PASS,"Successfully submit on " + elementName);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to submit on element " + elementName + " " + e);
            System.out.println("Unable to submit on element " + elementName + " " + e);
            getScreenShot(driver,elementName,logger);
        }//end of exception
    }//end of method

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method






}//end of java class

