package TouficPhysicalDistanceMonitoring;

import AVBase.PhysicalDistancePage;
import Base.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC_001 extends BaseTest {
    @Test
    public void PhysicalDistanceTest() throws InterruptedException {

        //1.Login to Airport view 1.6 mob app
        initialPage.login();
        // 2.Tap on Menu --> Physical distance monitoring
        firstPage.click_menu();
        firstPage.terminal_Operation_click();
        firstPage.Physical_Distance_click();
        // 3.Verify the screen
        PhysicalDistancePage physicalDistancePage=new PhysicalDistancePage(driver);
        // 1.Header as 'PHYSICAL DISTANCE MONITORING'
        physicalDistancePage.check_Title();
        // Arrival and Departure section with Areas with physical distance indicator from airport
        physicalDistancePage.check_Arrival_Departures();
        // Menu icon on top left corner
        physicalDistancePage.check_Menu();
        // Terminals with sliding option
        physicalDistancePage.check_T1();
        physicalDistancePage.click_right_side();
        // Terminals with sliding option
        physicalDistancePage.check_T1A();
        // Terminals with sliding option
        physicalDistancePage.click_right_side();
        physicalDistancePage.check_T3();



    }
}
