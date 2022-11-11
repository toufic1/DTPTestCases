package resources.TestYesterdaysFlightList;

import AVBase.OTPD_PAGE;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_009 extends BaseTest {
    @Test
    public void OTPD_test() throws InterruptedException {
        initialPage.login();
        //Tap on OTPD Passenger /OTPD cargo/OTPD overall option from the home screen.
        firstPage.otpd_click();
        OTPD_PAGE otpd_page=new OTPD_PAGE(driver);
        //Check if OTPD page is open
        otpd_page.otpd_is_open();
        //Tap on 5 minutes /15 min
        otpd_page.tap_on_5mins();
        //Tap on Yesterday's OTP% for All Airlines
        otpd_page.All_Airline_Yesterday_click();
        // Verify the Label of the screen
        otpd_page.check_yesterday_Label();
        otpd_page.go_back();
        // Tap on Today's OTP% for All Airlines
        otpd_page.All_Today_click();
        // Verify the Label of the screen
        otpd_page.check_today_label();
        otpd_page.go_back();
        //Tap on Yesterday's OTP% for specific airlines
        otpd_page.Astana_Yesterday_click();
        // Verify the Label of the screen
        otpd_page.check_yesterday_Label();
        otpd_page.go_back();
        // Tap on Today's OTP% for specific airlines
        otpd_page.Astana_Today();
        // Verify the Label of the screen
        otpd_page.check_today_label();
        otpd_page.go_back();
        //Tap on Yesterday's OTP% for other airlines
        otpd_page.Scroll_To_Other();
        otpd_page.Other_Yesterday_click();
        // Verify the Label of the screen
        otpd_page.check_yesterday_Label();
        otpd_page.go_back();
        // Tap on Today's OTP% for other airlines
        otpd_page.Other_Today();
        // Verify the Label of the screen
        otpd_page.check_today_label();
        otpd_page.go_back();

    }
}
