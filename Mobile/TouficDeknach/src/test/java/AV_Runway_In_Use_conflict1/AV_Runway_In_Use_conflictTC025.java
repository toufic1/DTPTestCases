package AV_Runway_In_Use_conflict1;

import Base.BaseTest;
import org.testng.annotations.Test;

public class AV_Runway_In_Use_conflictTC025 extends BaseTest {

    @Test
    public void contact_decription() throws InterruptedException {



        // 1. Login to Mobile app
        initialPage.login();
        // 2. Tap on Contacts from the menu
        firstPage.click_menu();
        firstPage.getContacts();
        //3. Check the description availability for each contact
        //The contacts descriptions should not be displayed in the latest version of the mobile app.
        firstPage.checkContactDescription();
    }
}
