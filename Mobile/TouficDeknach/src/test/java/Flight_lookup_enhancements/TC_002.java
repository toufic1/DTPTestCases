package Flight_lookup_enhancements;

import AVBase.Flight_Lookup_Page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_002 extends BaseTest {
    @Test
    public void FLight_Lookup_Test() throws InterruptedException {
        //Login to Airpotview 1.9 mobile application
        initialPage.login();
        //Tap on Main menu
        firstPage.click_menu();
        //Tap on Flight Operations -->Flight Lookup
        firstPage.flightOp_CLick();
        firstPage.FLight_lookup_click();
        Flight_Lookup_Page flight_lookup_page=new Flight_Lookup_Page(driver);
       //Flight number in the drop down should be selected by default .
        flight_lookup_page.check_FLight_number_default();

    }
}
