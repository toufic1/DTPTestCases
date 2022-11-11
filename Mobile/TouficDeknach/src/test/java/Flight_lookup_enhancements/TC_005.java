package Flight_lookup_enhancements;

import AVBase.Flight_Lookup_Page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_005 extends BaseTest {
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
        //When user selects the flight number the hint text should show "Origin/Destination/Via" .
        flight_lookup_page.check_Placeholder_Airport();
    }
}
