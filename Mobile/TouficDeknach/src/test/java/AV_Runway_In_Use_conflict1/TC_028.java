package AV_Runway_In_Use_conflict1;

import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_028 extends BaseTest {

    @Test
    public void Email_same_Test() throws InterruptedException {



        // 1. Login to Mobile app
        initialPage.login();
        // 2. Tap on Contacts from the menu
        firstPage.click_menu();
        firstPage.getContacts();
        //2. Tap on Email
        //3. Check if the system opens the default email client with the sender set as the email tapped.
        firstPage.same_mail();
    }
}
