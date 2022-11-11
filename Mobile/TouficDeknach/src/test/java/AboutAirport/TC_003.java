package AboutAirport;

import AVBase.AboutAirportPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        //1. Login to Airport view Mob app
        initialPage.login();
        //2.Tap on slider menu
        firstPage.click_menu();
        //3.Tap on 'About Airport view'
        firstPage.aboutAirport_click();
        //4.Verify the screen
        AboutAirportPage aboutAirportPage=new AboutAirportPage(driver);
        //1.Page should show the version of the application deployed at client site
        aboutAirportPage.version_IsDisplayed();
        //2.It should show the release notes (list of features enabled) for the user and the version number.
        aboutAirportPage.check_List();
        //3.DTP logo should show in bottom of  'About Airport view Page'
        aboutAirportPage.Dtp_logo_IsDisplayed();
    }
}
