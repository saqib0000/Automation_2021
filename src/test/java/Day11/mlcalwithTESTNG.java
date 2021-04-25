package Day11;

import Day9.ReusableMethod;
import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class mlcalwithTESTNG extends Abstract_Class {


    @Test
    public void testScenario() throws WriteException, InterruptedException, IOException, BiffException {
        //Step1: locate the path for readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Mlcalc.xls"));

        //Step 2: create a writable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Mlcalcc.xls"),readableBook);

        //Ste3 : read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        int rowCount  = writableSheet.getRows();
        //this is where the for loop will start to iterate through your excel data
        for(int i =1; i <rowCount; i++){

            //columns are hard coded and row is dynamic(i)
            String pPrice = writableSheet.getCell(0,i).getContents();
            String dPayment = writableSheet.getCell(1,i).getContents();
            String mTerm = writableSheet.getCell(2,i).getContents();
            String iRate = writableSheet.getCell(3,i).getContents();
            String stMonth = writableSheet.getCell(4,i).getContents();
            String stYear = writableSheet.getCell(5,i).getContents();

            //navigate to mlcalc
            driver.navigate().to("https://www.mlcalc.com");
            Thread.sleep(3000);
            //enter the purchase price
            Reusable_Actions.sendKeysMethod(driver,"//input[@id='ma']",pPrice,logger, "Purchase Price");
            //enter the down payment
            Reusable_Actions.sendKeysMethod(driver,"//input[@id='dp']",dPayment,logger,"Down Payment");
            //enter mortgage term
            Reusable_Actions.sendKeysMethod(driver,"//input[@id='mt']",mTerm,logger,"Mortgage Term");
            //enter interest rate
            Reusable_Actions.sendKeysMethod(driver,"//input[@id='ir']",iRate,logger,"Interest Rate");
            //select start month
            Reusable_Actions.dropdownByText(driver,"//select[@name='sm']",stMonth,logger,"Start Month");
            //select start year
            Reusable_Actions.dropdownByText(driver,"//select[@name='sy']",stYear,logger,"Start Year");
            //click on Calculate
            Reusable_Actions.clickOnElement(driver,"//input[@value='Calculate']",logger,"Calculate");

            //capture monthly payment
            String monthlyPayment = Reusable_Actions.captureText(driver,"//td[@align='center']",0,logger,"Monthly Payment");
            //print out the monthly payment to see the result in my log

            //create a label so you can add it to a cell
            Label label = new Label(6,i,monthlyPayment);
            //add the label back to the sheet
            writableSheet.addCell(label);
        }//end of loop
        //outside of the cell write back to writable workbook
        writableWorkbook.write();
        //close it
        writableWorkbook.close();

    }//end of test scenario

    }//end of class

