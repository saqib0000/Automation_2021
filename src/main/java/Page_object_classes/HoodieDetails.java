package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoodieDetails extends Abstract_Class {

    ExtentTest logger;
    public HoodieDetails (WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class


    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddtoBag;

    @FindBy(xpath = "//*[text()= 'View Bag']")
    WebElement ViewBag;

    public void addSize(String size){
        WebDriverWait wait = new WebDriverWait(driver,8);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='" + size + "']"))).click();
            logger.log(LogStatus.PASS, "clicked on size" + size);
        }catch (Exception e){
            logger.log(LogStatus.FAIL,"unable to click on size" + size + " " + e);
            Reusable_Actions_PageOBJECTS.getScreenShot(driver, "size",logger);
        }//end of exception

    }//end of method

    public void ClickAddTobag(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,AddtoBag,logger,"Add to bag");
    }//end of method

    public void ViewBag(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ViewBag,logger,"View bag");
    }//end of method



}//end of java class
