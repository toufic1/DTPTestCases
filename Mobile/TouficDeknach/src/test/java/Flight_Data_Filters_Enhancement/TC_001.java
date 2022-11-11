package Flight_Data_Filters_Enhancement;

import AVBase.ArrivalFLightsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest {
    @Test
    public void test() throws InterruptedException {

        //1.Login to Airport view 1.8 application
        initialPage.login();
        //2.Tap on menu
        firstPage.click_menu();
        //3.Tap on Flight operations -->Arrival flight
        firstPage.flightOp_CLick();
        firstPage.click_Arrival();
        ArrivalFLightsPage arrivalFLightsPage=new ArrivalFLightsPage(driver);
        //4.Tap on Filter icon
        arrivalFLightsPage.click_Filter();
        //5.Verify the newly drop down filter
        //A new dropdown filter should be available in arrival flight list in Airport view with following options
        //1.Global Flights -->All flights
        //2.Domestic Flights
        //3.International flights A
        arrivalFLightsPage.click_GlobalFlights();
        arrivalFLightsPage.check_Filters(driver);
    }
}
