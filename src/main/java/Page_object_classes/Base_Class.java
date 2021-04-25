package Page_object_classes;

import Reusable_Library.Abstract_Class;

public class Base_Class extends Abstract_Class {

    //this page class is a STATIC refrence for the object classes
    //so i can use it on my test class

    public static Google_Homepage googleHomepage(){
        Google_Homepage googleHomepage = new Google_Homepage(driver);
        return googleHomepage;
    }//end of method

    public static Google_Search_Result search_result(){
        Google_Search_Result search_result= new Google_Search_Result(driver);
        return search_result;
    }//end of method

    public static ExpressHomepage expresshomepage(){
        ExpressHomepage expresshomepage = new ExpressHomepage(driver);
        return expresshomepage;
    }//End of method

    public static HoodiesAndSweatshirts hoodiesAndSweatshirts(){
        HoodiesAndSweatshirts hoodiesAndSweatshirts = new HoodiesAndSweatshirts(driver);
        return hoodiesAndSweatshirts;
    }// end of method

    public static HoodieDetails hoodieDetails(){
        HoodieDetails hoodieDetails = new HoodieDetails(driver);
        return hoodieDetails;
    }//end of method

    public static PreCheckoutPage preCheckoutPage(){
        PreCheckoutPage preCheckoutPage = new PreCheckoutPage(driver);
        return preCheckoutPage;
    }//end of method

    public static PaymentPage paymentpage(){
        PaymentPage paymentpage = new PaymentPage(driver);
        return paymentpage;
    }//end of method








}//end of java class
