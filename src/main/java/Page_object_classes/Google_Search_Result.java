package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Search_Result extends Abstract_Class {

    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public Google_Search_Result(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement SearchResultdata;

    //create method
    public void capture_result_Number(){
        String result = Reusable_Actions_PageOBJECTS.captureText(driver,SearchResultdata,0,logger,"search result for cars");
        String[] arrayResult = result.split(" ");
        System.out.println("my result is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"My search number is " + arrayResult[1]);
    }//end of method

}//end of java class
