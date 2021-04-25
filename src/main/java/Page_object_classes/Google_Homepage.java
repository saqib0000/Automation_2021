package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Google_Homepage extends Abstract_Class {

    //Constructor is a method which uses the same name as java class
    //to store information that you want to use locally to this class
    // Especially dealing with page object

    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public Google_Homepage(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//*[@name = 'q']")
    WebElement Searchbar;

    @FindBy(xpath = "//*[@name='btnK']")
    WebElement submitButton;

    //below find by is used useful when you need to click on an element which does not have a unique property
    //so you create webelement as a list then later you pass .get(index number) on your reusable actions
    @FindBy(xpath = "//*[@class = 'btnK']")
    List<WebElement> list;

    //create a method for Searchbar
    public void Enter_Value_On_Searchbar(String uservalue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,Searchbar,uservalue,logger,"google search bar");
    }//end of method

    //create method for submit
    public void submit_on_search(){
        Reusable_Actions_PageOBJECTS.submitOnElement(driver,submitButton,logger,"submit on search");
    }//end of method











}//End of java class
