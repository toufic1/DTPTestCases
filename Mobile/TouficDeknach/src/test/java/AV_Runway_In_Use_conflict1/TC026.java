package AV_Runway_In_Use_conflict1;

import Base.BaseTest;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.testng.annotations.Test;

public class TC026 extends BaseTest {
    @Test
    public void email_icon_Test() throws InterruptedException {



        initialPage.login();
        firstPage.click_menu();
        // 1. Tap on Contacts from the menu
        firstPage.getContacts();
        // 2. Check the availability of Email icon
        //Email label should be replaced with the Email icon
        firstPage.Email_Availability();
    }
}
