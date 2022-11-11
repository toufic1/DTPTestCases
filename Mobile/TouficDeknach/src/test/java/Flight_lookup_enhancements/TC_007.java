package Flight_lookup_enhancements;

import AVBase.Flight_Lookup_Page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_007 extends BaseTest {
    @Test
    public void FLight_lookup_test() throws InterruptedException {
        //Login to Airpotview 1.9 mobile application
        initialPage.login();
        //Tap on Main menu
        firstPage.click_menu();
        //Tap on Flight Operations -->Flight Lookup
        firstPage.flightOp_CLick();
        firstPage.FLight_lookup_click();
        Flight_Lookup_Page flight_lookup_page=new Flight_Lookup_Page(driver);
        flight_lookup_page.click_drop_down();
        flight_lookup_page.click_Airport();
        //Give code number
        flight_lookup_page.give_Airport_code();
        //Select arrival/Departure
        flight_lookup_page.Arrival();
        flight_lookup_page.click_Deparature();
        flight_lookup_page.Deparature();
        //Tap on search
        flight_lookup_page.Data_page(driver);
        flight_lookup_page.search_click();
        //Verify the result
        flight_lookup_page.Result_page(driver);
        flight_lookup_page.Verify_Result();
    }
}
