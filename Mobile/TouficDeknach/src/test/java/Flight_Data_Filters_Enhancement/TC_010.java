package Flight_Data_Filters_Enhancement;

import AVBase.ArrivalFLightsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_010 extends BaseTest {
    @Test
    public void test() throws InterruptedException {

        //1.Login to Airport view 1.8 application
        initialPage.login();
        //2.Tap on menu
        firstPage.click_menu();
        //3.Tap on Flight operations -->Arrival flight
        firstPage.flightOp_CLick();
        firstPage.click_Arrival();
        ArrivalFLightsPage arrivalFLightsPage = new ArrivalFLightsPage(driver);
        //4.Tap on any flight
        arrivalFLightsPage.click_Flight();
        //5.Select turnaround option
        arrivalFLightsPage.click_T();
        //6.Verify that "Gate Close" field is available
        arrivalFLightsPage.check_Gate_Close_presence(driver);
    }
}