package resources.TestYesterdaysFlightList;

import AVBase.FirstBagPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_026 extends BaseTest {
    @Test
    public void FirstBag_Test() throws InterruptedException {
        initialPage.login();
        //Tap on First Bag option from the home screen.
        firstPage.FirstBag_click();
        FirstBagPage firstBagPage=new FirstBagPage(driver);
        // Check if BAG KPI page is open
        firstBagPage.check_Bag_Open();
        // Tap on yesterday's count for All
        firstBagPage.All_Terminal_Yesterday_click();
        //Check if Flight List Screen is open w.r.t. selected time
        firstBagPage.FLightPage_IsOpen();
        firstBagPage.go_back();
        // Tap on yesterday's count for individual terminals
        firstBagPage.Individual_Yesterday_click();
        //Check if Flight List Screen is open w.r.t. selected time
        firstBagPage.FLightPage_IsOpen();
        firstBagPage.go_back();

    }
}