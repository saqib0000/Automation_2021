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

public class PreCheckoutPage extends Abstract_Class {

    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public PreCheckoutPage(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//select[@id= 'qdd-0-quantity']")
    WebElement ClickQuantity;

    //define all the webelements you need using @findby concept
    @FindBy(xpath ="//*[@id='continue-to-checkout']")
    WebElement ContinueCheckout;

    //define all the webelements you need using @findby concept
    @FindBy(xpath ="//*[text()= 'Checkout as Guest']")
    WebElement CheckoutAsGuest;

    public void clickQuantity(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickQuantity,logger,"click on quantity");
    }//end of method

    public void Quantity(String quantity){
        WebDriverWait wait = new WebDriverWait(driver,8);
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='" + quantity + "']"))).click();
            logger.log(LogStatus.PASS, "clicked on quantity" + quantity);
        }catch (Exception e){
            logger.log(LogStatus.FAIL,"unable to click on quantity" + quantity+ " " + e);
            Reusable_Actions_PageOBJECTS.getScreenShot(driver, "quantity",logger);
        }//end of exception
    }//end of method


    public void continuecheckout(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ContinueCheckout,logger,"continue to checkout");

    }//end of method

    public void checkoutasguest(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,CheckoutAsGuest,logger,"checkout as guest");
    }//end of method
}//end of java class




