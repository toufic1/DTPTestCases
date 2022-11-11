package AVChangestoDrawerMenu;

import AVBase.SettingsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_002 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        initialPage.login();
        //1.Tap on slider menu
        firstPage.click_menu();
        //2.Tap on Settings
        firstPage.click_settings();
        SettingsPage settingsPage=new SettingsPage(driver);
        //3.Verify 'Notification configuration ' screen
        settingsPage.check_notification_config_Displayed(driver);

    }
}
