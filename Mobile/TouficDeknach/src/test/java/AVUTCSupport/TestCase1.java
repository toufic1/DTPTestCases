package AVUTCSupport;

import AVBase.FirstPage;
import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
    public void First() throws InterruptedException {
        //1.Login to Airport view 1.7 mob app
        initialPage.login();
        // 2.Tap on menu
        firstPage.click_menu();
        //3.Tap on Settings
        firstPage.click_settings();
        //  4.Verify the toggle button 'UTC'
        firstPage.UTC_Displayed();




    }


}
