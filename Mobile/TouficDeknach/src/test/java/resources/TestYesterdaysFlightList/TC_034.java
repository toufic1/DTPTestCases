package resources.TestYesterdaysFlightList;

import AVBase.LastBagPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_034 extends BaseTest {
    @Test
    public void LastBag_Test() throws InterruptedException {
        initialPage.login();
        //Tap on last Bag option from the home screen.
        firstPage.LastBag_click();
        LastBagPage lastBagPage=new LastBagPage(driver);
        // Check if BAG KPI page is open
        lastBagPage.BagPage_IsOpen();
        // Tap on yesterday's count for all
        lastBagPage.All_Yesterday_click();
        // Verify the Label of the screen
        lastBagPage.Flight_page_Yesterday_Label();
        lastBagPage.go_back();
        //Tap on today's count for all
        lastBagPage.All_today_click();
        // Verify the Label of the screen
        lastBagPage.Flight_page_Today_Label();
        lastBagPage.go_back();
        // Tap on yesterday's count for individual terminals
        lastBagPage.Individual_Yesterday_click();
        // Verify the Label of the screen
        lastBagPage.Flight_page_Yesterday_Label();
        lastBagPage.go_back();
        //Tap on today's count for individual terminals
        lastBagPage.Individual_Today_test();
        // Verify the Label of the screen
        lastBagPage.Flight_page_Today_Label();
    }
}