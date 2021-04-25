package Day14;

import Page_object_classes.Base_Class;
import Reusable_Library.Abstract_Class;
import org.testng.annotations.Test;

public class Google_searchpage_object extends Abstract_Class {

    @Test
    public void GoogleSearch() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2500);
        Base_Class.googleHomepage().Enter_Value_On_Searchbar("cars");
        Base_Class.googleHomepage().submit_on_search();
        Thread.sleep(2000);
        Base_Class.search_result().capture_result_Number();
    }//end of method




}//end of java class
