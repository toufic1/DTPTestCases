package TouficPhysicalDistanceMonitoring;

import AVBase.PhysicalDistancePage;
import Base.BaseTest;
import org.testng.annotations.Test;

import java.text.ParseException;

public class TC_004 extends BaseTest {
    @Test
    public void test() throws InterruptedException, ParseException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.terminal_Operation_click();
        firstPage.Physical_Distance_click();
        PhysicalDistancePage physicalDistancePage=new PhysicalDistancePage(driver);
        //Arrival section of the main screen should display the values
        // for each area in a row displaying the current PDI value and PDI
        // value for the upcoming 3 hours from the last week's data
        physicalDistancePage.check_pdi();
        physicalDistancePage.check_next_3Hours();

    }
}
