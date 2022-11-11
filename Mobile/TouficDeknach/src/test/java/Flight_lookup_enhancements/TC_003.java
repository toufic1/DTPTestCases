package Flight_lookup_enhancements;

import AVBase.Flight_Lookup_Page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest {
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
        //Tap on dropdown and select any one option
        flight_lookup_page.click_drop_down();
        flight_lookup_page.click_Airport();
        flight_lookup_page.check_Airport_Is_Selected();
    }
}
