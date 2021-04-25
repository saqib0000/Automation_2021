package ExpressPageObjects;

import Page_object_classes.Base_Class;
import Reusable_Library.Abstract_Class;
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

public class expressPageObjects extends Abstract_Class {

    @Test
    public void ExpressAssaignment() throws InterruptedException, IOException, BiffException, WriteException {

        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/expresswebsite.xls"));

        //create a writable workbook
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/expresswebsiteresult.xls"),readableBook);

        //read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //get the row count
        int Rowcount = writableSheet.getRows();

        driver.navigate().to("https://www.express.com");
        Base_Class.expresshomepage().ClickHomepagePOPup();


        for(int i =1; i <Rowcount; i++){

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

            driver.manage().deleteAllCookies();
            driver.navigate().to("https://www.express.com");
            Thread.sleep(2500);

            //Homepage

            Base_Class.expresshomepage().HoverMensTab();
            Base_Class.expresshomepage().SweatshitsAndHoodies();
            Thread.sleep(2500);

            //hoodies and sweatshirt page
            Base_Class.hoodiesAndSweatshirts().ClickFirstHoodie();
            Thread.sleep(2500);

            //hoodie detail page
            Base_Class.hoodieDetails().addSize(size);
            Base_Class.hoodieDetails().ClickAddTobag();
            Base_Class.hoodieDetails().ViewBag();
            Thread.sleep(2500);


            //pre-checkout page
            Base_Class.preCheckoutPage().clickQuantity();
            Base_Class.preCheckoutPage().Quantity(quantity);
            Base_Class.preCheckoutPage().continuecheckout();
            Base_Class.preCheckoutPage().checkoutasguest();
            Thread.sleep(2500);

            //payment page
            Base_Class.paymentpage().clickonName();
            Base_Class.paymentpage().entername(firstname);
            Base_Class.paymentpage().clicklastname();
            Base_Class.paymentpage().enterlastname(lastname);
            Base_Class.paymentpage().clickemail();
            Base_Class.paymentpage().enteremail(email);
            Base_Class.paymentpage().confirmemail();
            Base_Class.paymentpage().enteremail1(email);
            Base_Class.paymentpage().clickphonenumber();
            Base_Class.paymentpage().sendphonenumber(phone);
            Base_Class.paymentpage().clickcontinue();
            Base_Class.paymentpage().clickonShippingFirstName();
            Base_Class.paymentpage().enterShippingFirstName(firstname);
            Base_Class.paymentpage().clickshippinglastname();
            Base_Class.paymentpage().entershippinglastname(lastname);
            Base_Class.paymentpage().clickstreetaddress();
            Base_Class.paymentpage().sendaddresslist(address);
            Base_Class.paymentpage().clickzipcode();
            Base_Class.paymentpage().sendzipcodelist(zipcode);
            Base_Class.paymentpage().clickcity();
            Base_Class.paymentpage().citylist(city);
            Base_Class.paymentpage().clickstate();
            Base_Class.paymentpage().selectstate(state);
            Base_Class.paymentpage().continue2();
            Base_Class.paymentpage().continue3();
            Base_Class.paymentpage().ccnumber();
            Base_Class.paymentpage().ccnumberlist(cc_number);
            Base_Class.paymentpage().expmonth();
            Base_Class.paymentpage().selectyear(exp_month);
            Base_Class.paymentpage().expyear();
            Base_Class.paymentpage().selectyear(exp_year);
            Base_Class.paymentpage().cvv();
            Base_Class.paymentpage().cvvlist(cvv_code);
            Base_Class.paymentpage().clickpurchase();
            //capture text
            String error = Base_Class.paymentpage().capturetext();

            //create a label so you can add it to a cell
            Label label = new Label(14,i,error);

            //add the label back to the sheet
            writableSheet.addCell(label);

            logger.log(LogStatus.INFO,error);

        }//end of for loop

        writableWorkbook.write();
        writableWorkbook.close();
    }//end of method
}//end of java class
