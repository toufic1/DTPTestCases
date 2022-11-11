package resources.TestYesterdaysFlightList;

import AVBase.LastBagPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_033  extends BaseTest {
    @Test
    public void LastBag_Test() throws InterruptedException {
        initialPage.login();
        //Tap on last Bag option from the home screen.
        firstPage.LastBag_click();
        LastBagPage lastBagPage=new LastBagPage(driver);
        //Check if BAG KPI page is open
        lastBagPage.BagPage_IsOpen();
        //Tap on yesterday's count for All
        lastBagPage.All_Yesterday_click();
        //Check if Flight List Screen is open w.r.t. selected time
        lastBagPage.FLightPage_yesterday_Open();
        lastBagPage.go_back();
        //Tap on yesterday's count for individual terminal
        lastBagPage.Individual_Yesterday_click();
        //Check if Flight List Screen is open w.r.t. selected time
        lastBagPage.FLightPage_yesterday_Open();
    }
}