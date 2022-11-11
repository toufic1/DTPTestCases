package SOP;

import AVBase.BaseTest;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

//1. Navigate to 'Standard Procedure' Screen from menu.
//2. Check if Standard Procedures screen is opened
//3. Tap on menu button from top left corner.
    @Test
    public void checkMenu() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickInfo();
        Thread.sleep(3000);
        menuPage.clickStandardProcedure();
        Thread.sleep(3000);
        sop.clickSOPMenu();
        Thread.sleep(3000);
    }
}
