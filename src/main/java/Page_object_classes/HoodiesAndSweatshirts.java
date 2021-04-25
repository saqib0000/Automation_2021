package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoodiesAndSweatshirts extends Abstract_Class {
    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public HoodiesAndSweatshirts(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//*[@class= '_191f4 _3Ix5Z']")
    WebElement FirstHoodiePic;

    public void ClickFirstHoodie(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,FirstHoodiePic,logger,"First hoodie");
    }//end of method

}//end of java class
