package Page_object_classes;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageOBJECTS;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.write.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends Abstract_Class {

    //declare local logger so you can use it in your page class
    ExtentTest logger;
    public PaymentPage(WebDriver driver){
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//End of constructor class

    //define all the webelements you need using @findby concept
    @FindBy(xpath = "//*[@name= 'firstname']")
    WebElement ClickonName;

    @FindBy(xpath = "//*[@name= 'lastname']")
    WebElement ClickonLastname;

    @FindBy(xpath = "//*[@name= 'email']")
    WebElement Clickemail;

    @FindBy(xpath = "//*[@name= 'confirmEmail']")
    WebElement ClickConfirmemail;

    @FindBy(xpath = "//*[@name= 'phone']")
    WebElement ClickPhonenumber;

    @FindBy(xpath ="//*[@type = 'submit']")
    WebElement Clickcontinue;

    @FindBy(xpath ="//*[@name = 'shipping.firstName']")
    WebElement ClickShippingFName;

    @FindBy(xpath ="//*[@name = 'shipping.lastName']")
    WebElement ClickShippingLName;

    @FindBy(xpath ="//*[@name= 'shipping.line1']")
    WebElement ClickStreetaddress;

    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement ClickZipcode;

    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement ClickOncity;

    @FindBy(xpath = "//*[@name= 'shipping.state']")
    WebElement ClickState;

    @FindBy(xpath = "//*[@type = 'submit']")
    WebElement Clickcontinue2;

    @FindBy(xpath = "//span[text()= 'Continue']")
    WebElement ClickContinue3;

    @FindBy(xpath = "//*[@name = 'creditCardNumber']")
    WebElement Clickccnumber;

    @FindBy(xpath = "//*[@name = 'expMonth']")
    WebElement ClickexpMonth;

    @FindBy(xpath = "//*[@name = 'expYear']")
    WebElement ClickexpYear;

    @FindBy(xpath = "//*[@name= 'cvv']")
    WebElement ClickCvv;

    @FindBy(xpath = "//*[@type= 'submit']")
    WebElement ClickPurchase;

    @FindBy(xpath = "//*[@id= 'rvn-note-NaN']")
    WebElement CaptureText;

    public void clickonName(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickonName,logger,"click on name");
    }// end of method

    public void entername (String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickonName,userValue,logger,"enter first name");
    }//end of method

    public void clicklastname(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickonLastname,logger,"click on last name");
    }//end of method

    public void enterlastname(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickonLastname,userValue,logger,"enter last name");
    }//end of method


    public void clickemail(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,Clickemail,logger,"click email ");
    }//end of method

    public void enteremail(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,Clickemail,userValue,logger,"enter email ");
    }//end of method

    public void confirmemail(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickConfirmemail,logger,"confirm email ");
    }//end of method

    public void enteremail1(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickConfirmemail,userValue,logger,"enter re confirm email");
    }//end of method

    public void clickphonenumber(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickPhonenumber,logger,"click on phone number");
    }//end of method

    public void sendphonenumber(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickPhonenumber,userValue,logger,"enter phone number");
    }//end of method

    public void clickcontinue(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,Clickcontinue,logger,"click continue");
    }//end of method

    public void clickonShippingFirstName(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickShippingFName,logger,"click on shipping name");
    }// end of method

    public void enterShippingFirstName (String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickShippingFName,userValue,logger,"enter shipping first name");
    }//end of method

    public void clickshippinglastname(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickShippingLName,logger,"click on  shipping last name");
    }//end of method

    public void entershippinglastname(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickShippingLName,userValue,logger,"enter shipping last name");
    }//end of method

    public void clickstreetaddress(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickStreetaddress,logger,"click on street address");
    }//end of method

    public void sendaddresslist(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickStreetaddress,userValue,logger,"send address list");
    }//end of method

    public void clickzipcode(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickZipcode,logger,"click zipcode");
    }//end of method

    public void sendzipcodelist(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickZipcode,userValue,logger,"send zipcode list");
    }//end of method

    public void clickcity(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickOncity,logger,"click on city");
    }//end of method

    public void citylist(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickOncity,userValue,logger,"send city list");
    }//end of method

    public void clickstate(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickState,logger,"click on state");
    }//end of method

    public void selectstate (String state) {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='" + state + "']"))).click();
            logger.log(LogStatus.PASS, "clicked on state" + state);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "unable to click on state" + state + " " + e);
            Reusable_Actions_PageOBJECTS.getScreenShot(driver, "size", logger);
        }//end of exception
    }//end of method

    public void continue2(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,Clickcontinue2,logger,"click continue 2");
    }//end of method

    public void continue3(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickContinue3,logger,"click continue 3");
    }//end of method

    public void ccnumber(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,Clickccnumber,logger,"click cc number");
    }//end of method

    public void ccnumberlist(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,Clickccnumber,userValue,logger,"cc number list");
    }//end of method

    public void expmonth(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickexpMonth,logger,"click exp month");
    }//end of method

    public void expmonth (String exp_month) {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='" + exp_month + "']"))).click();
            logger.log(LogStatus.PASS, "clicked on expmonth" + exp_month);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "unable to click on expmonth" + exp_month + " " + e);
            Reusable_Actions_PageOBJECTS.getScreenShot(driver, "expmonth", logger);
        }//end of exception
    }//end of method

    public void expyear(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickexpYear,logger,"click exp year");
    }//end of method

    public void selectyear(String exp_year) {
        WebDriverWait wait = new WebDriverWait(driver, 8);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='" + exp_year + "']"))).click();
            logger.log(LogStatus.PASS, "clicked on expyear" + exp_year);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "unable to click on expyear" + exp_year + " " + e);
            Reusable_Actions_PageOBJECTS.getScreenShot(driver, "expyear", logger);
        }//end of exception
    }//end of method

    public void cvv(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickCvv,logger,"click cvv");
    }//end of method

    public void cvvlist(String userValue){
        Reusable_Actions_PageOBJECTS.sendKeysMethod(driver,ClickCvv,userValue,logger,"cvv list");

    }//end of method

    public void clickpurchase(){
        Reusable_Actions_PageOBJECTS.clickOnElement(driver,ClickPurchase,logger,"click on purchase");
    }//end of method

    public String capturetext(){
         String captureText = Reusable_Actions_PageOBJECTS.captureText(driver,CaptureText,0,logger,"capture text");
         return captureText;

    }//end of method









































}//end of java class
