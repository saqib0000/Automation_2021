package Day10;

import Day9.ReusableMethod;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Action_Item5 {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {

        //call the driver
        WebDriver driver = ReusableMethod.defineTheDriver();

        //locate path for excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/expresswebsite.xls"));

        //create a writable workbook
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/expresswebsiteresult.xls"),readableBook);

        //read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //get the row count
        int rowCount = writableSheet.getRows();

        driver.navigate().to("https://www.express.com");

        //close the popup
        ReusableMethod.clickOnElement(driver,"//*[@id= 'closeModal']","popup");


        for(int i =1; i <rowCount; i++) {

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
            ReusableMethod.MouseHover(driver, "//*[@href='/mens-clothing']", "men");

            Thread.sleep(1500);

            //click on sweaters
            ReusableMethod.clickOnElement(driver, "//a[text()= 'Sweatshirts & Hoodies']", "Sweaters");
            Thread.sleep(2000);

            //click on first sweater
            ReusableMethod.clickOnElement(driver, "//*[@class= '_1ddDj _136PD']", "first sweater");

            //click on size
            ReusableMethod.clickOnElement(driver,"//*[@value='" + size + "']", "size");
            Thread.sleep(2000);

            //click dd to bag
            ReusableMethod.clickOnElement(driver,"//*[text()='Add to Bag']","Add to bag");
            Thread.sleep(2000);

            //click view bag
            ReusableMethod.clickOnElement(driver,"//*[text()= 'View Bag']","View bag");

            //click on quantity
            ReusableMethod.clickOnElement(driver,"//select[@id= 'qdd-0-quantity']","quantity");

            //using string change the quantity
            ReusableMethod.clickOnElement(driver,"//*[text()='" + quantity + "']","Quantity");
            Thread.sleep(2000);

            //click on checkout
            ReusableMethod.clickOnElement(driver,"//*[@id='continue-to-checkout']","Checkout");

            //click checkout as guest
            ReusableMethod.clickOnElement(driver,"//*[text()= 'Checkout as Guest']","checkout as guest");

            //click on name
            ReusableMethod.clickOnElement(driver,"//*[@id= 'contact-information-firstname']","name");

            //send the name string
            ReusableMethod.sendKeysMethod(driver,"//*[@id= 'contact-information-firstname']", firstname,"names");

            //click on  last name
            ReusableMethod.clickOnElement(driver,"//*[@name= 'lastname']"," last name");

            //send the name string
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'lastname']", lastname,"last names");

            //click email
            ReusableMethod.clickOnElement(driver,"//*[@name= 'email']", "email");

            //send email string
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'email']",email,"emails");

            //click confirm email
            ReusableMethod.clickOnElement(driver,"//*[@name= 'confirmEmail']","Confirm email");

            //send email string
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'confirmEmail']",email,"Confirm email");

            //click phone number
            ReusableMethod.clickOnElement(driver,"//*[@name= 'phone']","phone number");

            // send phone string
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'phone']",phone,"Phone number");

            //click continue
            ReusableMethod.clickOnElement(driver,"//*[@type = 'submit']","continue");

            //click street address
            ReusableMethod.clickOnElement(driver,"//*[@name= 'shipping.line1']","street address");

            //send street address list
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'shipping.line1']",address,"address ");

            //click on zipcode
            ReusableMethod.clickOnElement(driver,"//*[@name='shipping.postalCode']","zipcode");

            //send zipcode list
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'shipping.postalCode']",zipcode,"zipcode ");

            //click city
            ReusableMethod.clickOnElement(driver,"//*[@name='shipping.city']","clickcity ");

            //send city string
            ReusableMethod.sendKeysMethod(driver,"//*[@name='shipping.city']", city,"city ");

            //click state
            ReusableMethod.clickOnElement(driver,"//*[@name= 'shipping.state']","clickstate");

            //send state string
            ReusableMethod.clickOnElement(driver,"//*[text() = '" + state + "']","state");

            //click continue
            ReusableMethod.clickOnElement(driver,"//*[@type = 'submit']","continue2");
            Thread.sleep(2000);

            //click continue again
            ReusableMethod.clickOnElement(driver,"//span[text()= 'Continue']","continue3");

            //click cc number
            ReusableMethod.clickOnElement(driver,"//*[@name = 'creditCardNumber']","cc");

            //send cc number string
            ReusableMethod.sendKeysMethod(driver,"//*[@name = 'creditCardNumber']",cc_number,"cc1");

            //click exp month
            ReusableMethod.clickOnElement(driver,"//*[@name = 'expMonth']", "expMonth");

            //send exp month string
            ReusableMethod.clickOnElement(driver,"//*[text() = '" + exp_month + "']","exp-month");

            //click exp year
            ReusableMethod.clickOnElement(driver,"//*[@name = 'expYear']", "expyear");

            //send exp year string
            ReusableMethod.clickOnElement(driver,"//*[text() = '" + exp_year + "']","exp-year");

            //click cvv
            ReusableMethod.clickOnElement(driver,"//*[@name= 'cvv']","cvv");

            //send cvv string
            ReusableMethod.sendKeysMethod(driver,"//*[@name= 'cvv']", cvv_code,"cvvcode");

            //click submit
            ReusableMethod.clickOnElement(driver,"//*[@type= 'submit']","submit");

            //capture the error

            String error = ReusableMethod.captureText(driver,"//*[@id= 'rvn-note-NaN']",0, "error_message");

            //create a label so you can add it to a cell
            Label label = new Label(14,i,error);

            //add the label back to the sheet
            writableSheet.addCell(label);

        }//end of loop

        //outside of the cell write back to writable workbook
        writableWorkbook.write();

        //close it
        writableWorkbook.close();

        driver.quit();

    }//end of main method
}//end of java class
