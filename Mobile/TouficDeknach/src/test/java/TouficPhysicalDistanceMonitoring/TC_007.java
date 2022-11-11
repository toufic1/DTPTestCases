package TouficPhysicalDistanceMonitoring;

import AVBase.PhysicalDistancePage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_007 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.terminal_Operation_click();
        firstPage.Physical_Distance_click();
        PhysicalDistancePage physicalDistancePage=new PhysicalDistancePage(driver);
        //Click on cross button
        physicalDistancePage.cross_button_click();

    }
}
