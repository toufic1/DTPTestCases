package resources.TestYesterdaysFlightList;

import AVBase.OTPT_PAGE;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_015 extends BaseTest {
    @Test
    public void otpt_Test() throws InterruptedException {
        initialPage.login();
        //Tap on OTPT Passenger
        firstPage.otpt_click();
        OTPT_PAGE otpt_page=new OTPT_PAGE(driver);
        //Check if OTPT page is open
        otpt_page.otpt_isOpened();
        //Tap on 5 minutes /15 min
        otpt_page.click_5mins();
        //Tap on Yesterday's OTP% for All Airlines
        otpt_page.All_Airlines_Yesterday_click();
        //Check if Flight list screen is open
        otpt_page.check_FLightPage_IsDisplayed();
        otpt_page.go_back();
        //Tap on Yesterday's OTP% for specific airlines
        otpt_page.Astana_yesterday_click();
        //Check if Flight list screen is open
        otpt_page.check_FLightPage_IsDisplayed();
        otpt_page.go_back();
        //Tap on Yesterday's OTP% for Other Airlines
        otpt_page.scroll_TO_Other();
        otpt_page.Other_Yesterday_click();
        //Check if Flight list screen is open
        otpt_page.check_FLightPage_IsDisplayed();
        otpt_page.go_back();
    }
}
