package AV_Runway_In_Use_conflict1;

import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_029 extends BaseTest {

    @Test
    public void same_phone_Test() throws InterruptedException {



        // 1. Login to Mobile app
        initialPage.login();
        // 2. Tap on Contacts from the menu
        firstPage.click_menu();
        firstPage.getContacts();
        //2. Tap on phone  icon
        //3. Check if system opens the default phone’s call app with the number set as the phone number tapped.
        firstPage.same_phone_Number();
    }
}
