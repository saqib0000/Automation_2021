package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressHomepage extends Abstract_Class {
    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public ExpressHomepage(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//*[@id= 'closeModal']")
    WebElement HomepagePopUp;

    @FindBy(xpath ="//*[@href='/mens-clothing']")
    WebElement MensTab;

    @FindBy(xpath ="//a[text()= 'Sweatshirts & Hoodies']")
    WebElement SweatshirtAndHoodies;

    //create a method for Searchbar
    public void ClickHomepagePOPup(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,HomepagePopUp,logger,"Click homepage popup");
    }//end of method

   public void HoverMensTab(){
        Reusable_Actions_PageOBJECTS.MouseHover(driver,MensTab,logger,"Hover to mens tab");
   }//end of method

    public void SweatshitsAndHoodies(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,SweatshirtAndHoodies,logger,"Sweatshirt and hoodies");
    }//end of method







}//end of java class
