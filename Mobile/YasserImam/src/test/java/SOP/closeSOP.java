package SOP;

import AVBase.BaseTest;
import org.testng.annotations.Test;

public class closeSOP extends BaseTest {

//1. Navigate to 'Standard Procedure' Screen from menu.
//2. Check if Standard Procedures screen is opened
//3. Tap on close button from top right corner.
    @Test
    public void closeSOPCheck() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(2000);
        menuPage.clickInfo();
        Thread.sleep(2000);
        menuPage.clickStandardProcedure();
        Thread.sleep(2000);
        sop.checkSOPOpened();
        Thread.sleep(2000);
        sop.closeSOP();
        Thread.sleep(2000);
        menuPage.checkMainTitle();
        Thread.sleep(2000);
    }
}
