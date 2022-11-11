package resources.TestYesterdaysFlightList;

import AVBase.EventsPage;
import AVBase.OTPA_PAGE;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest {
    @Test
    public void Event_Share() throws InterruptedException {
        //Login to Airport view 2.1
        initialPage.login();
        // Tap on OTPA  from the home screen.
        firstPage.click_otpa();
        OTPA_PAGE otpa_page=new OTPA_PAGE(driver);
        // Check if OTPA page is open
        otpa_page.check_otpa_isOpen();
        // Tap on 5 minutes /15 min
        otpa_page.click_Fivemins();
        // Tap on Yesterday's OTP% for All Airlines
        otpa_page.click_Yesterday_AllAirlines();
        // Check if Flight list screen is open
        otpa_page.check_isOpened_YesterdayOTPA();
        otpa_page.Back();
        //Tap on Yesterday's OTPA for specific airlines
        otpa_page.asia_yest_click();
        // Check if Flight list screen is open
        otpa_page.check_isOpened_YesterdayOTPA();
        otpa_page.Back();
        //Tap on Yesterday's OTP% for other airlines
        otpa_page.scroll_TO_OtherAirlines();
        otpa_page.other_Airline_yesterday_click();
        // Check if Flight list screen is open
        otpa_page.check_isOpened_YesterdayOTPA();

    }
}