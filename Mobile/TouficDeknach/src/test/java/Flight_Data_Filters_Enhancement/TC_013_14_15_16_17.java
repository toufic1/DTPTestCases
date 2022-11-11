package Flight_Data_Filters_Enhancement;

import AVBase.ArrivalFLightsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_013_14_15_16_17 extends BaseTest {
    @Test
    public void departure_Test() throws InterruptedException {
        //1.Login to Airport view 1.8 mob application
        initialPage.login();
        //2.Tap on menu
        firstPage.click_menu();
        firstPage.flightOp_CLick();
        //3.Tap on arrival /departure flights
        firstPage.click_Arrival();
        ArrivalFLightsPage arrivalFLightsPage=new ArrivalFLightsPage(driver);
        //4.Tap on any flight
        arrivalFLightsPage.click_Flight();
        //Verify basic info section that handling agent is available
        arrivalFLightsPage.check_Handling_Agent_present(driver);
        //Verify basic info section that VIA is available
        arrivalFLightsPage.check_VIA_present(driver);
        //Verify basic info section that Call -sign is available
        arrivalFLightsPage.check_Call_Sign_present(driver);
        //Verify AEBT,Gate Close & Handling agent value
        arrivalFLightsPage.check_AEBT_present(driver);
        arrivalFLightsPage.check_Gate_Close_presence(driver);
    }
}
