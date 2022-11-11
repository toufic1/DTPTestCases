package AVUTCSupport;

import AllureListener.AllureListener;
import Base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class Tc_02 extends BaseTest {

    @Test
    public void First() throws InterruptedException {
        //1.Login to Airport view 1.7 mob app
        initialPage.login();
        // 2.Tap on menu
        firstPage.click_menu();
        //3.Tap on Settings
        firstPage.click_settings();
        //4.Verify the default mode of toggle button 'UTC'
        firstPage.UTC_OFF();






    }


}