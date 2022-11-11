package Alerts_acknowledgments_conflict;

import AVBase.SendUpdatePage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class T018 extends BaseTest {
    @Test
    public void email_icon_Test() throws InterruptedException {
        // 1. Login to AV mobile app.
        initialPage.login();
        // 2. Click on menu.
        firstPage.click_menu();
        //click on send update
        firstPage.send_update_click();
        //3.Click on +Add or select any existing send update entry  and click on Edit
        SendUpdatePage sendUpdatePage=new SendUpdatePage(driver);
        // 4.Verify that “Require Acknowledgment” toggle option is available
        sendUpdatePage.check_ack_present();


    }
}

