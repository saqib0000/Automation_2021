package Day12;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExpressNG extends Abstract_Class {

    @Test
    public void loop() throws InterruptedException, WriteException, IOException, BiffException {


        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/expresswebsite.xls"));

        //create a writable workbook
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/expresswebsiteresult.xls"),readableBook);

        //read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //get the row count
        int Rowcount = writableSheet.getRows();

        driver.navigate().to("https://www.express.com");

        //close the popup
        Reusable_Actions.clickOnElement(driver,"//*[@id= 'closeModal']",logger,"popup");

        for(int i =1; i <Rowcount; i++) {

            String size = writableSheet.getCell(0,i).getContents();
            String quantity = writableSheet.getCell(1,i).getContents();
            String firstname = writableSheet.getCell(2,i).getContents();
            String lastname = writableSheet.getCell(3,i).getContents();
            String email = writableSheet.getCell(4,i).getContents();
            String phone = writableSheet.getCell(5,i).getContents();
            String address= writableSheet.getCell(6,i).getContents();
            String zipcode = writableSheet.getCell(7,i).getContents();
            String city= writableSheet.getCell(8,i).getContents();
            String state = writableSheet.getCell(9,i).getContents();
            String cc_number = writableSheet.getCell(10,i).getContents();
            String exp_month = writableSheet.getCell(11,i).getContents();
            String exp_year = writableSheet.getCell(12,i).getContents();
            String cvv_code = writableSheet.getCell(13,i).getContents();

            //delete all cookies
            driver.manage().deleteAllCookies();

            //navigate to express.com
            driver.navigate().to("https://www.express.com");


            //hover to men
            Reusable_Actions.MouseHover(driver, "//*[@href='/mens-clothing']", logger,"men");

            Thread.sleep(1500);

            //click on sweaters
            Reusable_Actions.clickOnElement(driver, "//a[text()= 'Sweatshirts & Hoodies']",logger,"Sweaters");
            Thread.sleep(2000);

            //click on first sweater
            Reusable_Actions.clickOnElement(driver, "//*[@class= '_191f4 _3Ix5Z']",logger,"first sweater");

            //click on size
            Reusable_Actions.clickOnElement(driver,"//*[@value='" + size + "']",logger, "size");
            Thread.sleep(2000);

            //click add to bag
            Reusable_Actions.clickOnElement(driver,"//*[text()='Add to Bag']",logger,"Add to bag");
            Thread.sleep(2000);

            //click view bag
            Reusable_Actions.clickOnElement(driver,"//*[text()= 'View Bag']",logger,"View bag");

            //click on quantity
            Reusable_Actions.clickOnElement(driver,"//select[@id= 'qdd-0-quantity']",logger,"quantity");

            //using string change the quantity
            Reusable_Actions.clickOnElement(driver,"//*[text()='" + quantity + "']",logger,"Quantity");
            Thread.sleep(2000);

            //click on checkout
            Reusable_Actions.clickOnElement(driver,"//*[@id='continue-to-checkout']",logger,"Checkout");

            //click checkout as guest
            Reusable_Actions.clickOnElement(driver,"//*[text()= 'Checkout as Guest']",logger,"checkout as guest");

            //click on name
            Reusable_Actions.clickOnElement(driver,"//*[@id= 'contact-information-firstname']",logger,"name");

            //send the name string
            Reusable_Actions.sendKeysMethod(driver,"//*[@id= 'contact-information-firstname']", firstname,logger,"names");

            //click on  last name
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'lastname']",logger," last name");

            //send the name string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'lastname']", lastname,logger,"last names");

            //click email
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'email']",logger, "email");

            //send email string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'email']",email,logger,"emails");

            //click confirm email
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'confirmEmail']",logger,"Confirm email");

            //send email string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'confirmEmail']",email,logger,"Confirm email");

            //click phone number
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'phone']",logger,"phone number");

            // send phone string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'phone']",phone,logger,"Phone number");

            //click continue
            Reusable_Actions.clickOnElement(driver,"//*[@type = 'submit']",logger,"continue");

            //click street address
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'shipping.line1']",logger,"street address");

            //send street address list
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'shipping.line1']",address,logger,"address ");

            //click on zipcode
            Reusable_Actions.clickOnElement(driver,"//*[@name='shipping.postalCode']",logger,"zipcode");

            //send zipcode list
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'shipping.postalCode']",zipcode,logger,"zipcode ");

            //click city
            Reusable_Actions.clickOnElement(driver,"//*[@name='shipping.city']",logger,"clickcity ");

            //send city string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='shipping.city']", city,logger,"city ");

            //click state
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'shipping.state']",logger,"clickstate");

            //send state string
            Reusable_Actions.clickOnElement(driver,"//*[text() = '" + state + "']",logger,"state");

            //click continue
            Reusable_Actions.clickOnElement(driver,"//*[@type = 'submit']", logger, "continue2");
            Thread.sleep(2000);

            //click continue again
            Reusable_Actions.clickOnElement(driver,"//span[text()= 'Continue']", logger, "continue3");

            //click cc number
            Reusable_Actions.clickOnElement(driver,"//*[@name = 'creditCardNumber']", logger, "cc");

            //send cc number string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name = 'creditCardNumber']",cc_number, logger, "cc1");

            //click exp month
            Reusable_Actions.clickOnElement(driver,"//*[@name = 'expMonth']", logger,  "expMonth");

            //send exp month string
            Reusable_Actions.clickOnElement(driver,"//*[text() = '" + exp_month + "']", logger, "exp-month");

            //click exp year
            Reusable_Actions.clickOnElement(driver,"//*[@name = 'expYear']", logger,  "expyear");

            //send exp year string
            Reusable_Actions.clickOnElement(driver,"//*[text() = '" + exp_year + "']", logger, "exp-year");

            //click cvv
            Reusable_Actions.clickOnElement(driver,"//*[@name= 'cvv']", logger, "cvv");

            //send cvv string
            Reusable_Actions.sendKeysMethod(driver,"//*[@name= 'cvv']", cvv_code, logger, "cvvcode");

            //click submit
            Reusable_Actions.clickOnElement(driver,"//*[@type= 'submit']", logger, "submit");

            //capture the error

            String error = Reusable_Actions.captureText(driver,"//*[@id= 'rvn-note-NaN']",0, logger, "error_message");

            //create a label so you can add it to a cell
            Label label = new Label(14,i,error);

            //add the label back to the sheet
            writableSheet.addCell(label);

            logger.log(LogStatus.INFO,error);


        }//end of loop

        writableWorkbook.write();
        writableWorkbook.close();
    }//end of test method 2
}//end of java class
