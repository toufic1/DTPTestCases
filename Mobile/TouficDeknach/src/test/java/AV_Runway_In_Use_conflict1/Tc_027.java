package AV_Runway_In_Use_conflict1;

import Base.BaseTest;
import org.testng.annotations.Test;

public class Tc_027 extends BaseTest {
    @Test
    public void Phone_icon_Test() throws InterruptedException {



        initialPage.login();
        firstPage.click_menu();
        // 1. Tap on Contacts from the menu
        firstPage.getContacts();
        // 2. Check the availability of Phone icon
        // Phone label should be replaced with the Phone icon
        firstPage.Phone_Availability();
    }
}

