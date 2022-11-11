package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import io.appium.java_client.TouchAction;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.testng.annotations.Test;

public class TC_020 extends BaseTest {
    @Test
    public void Deals_Test() throws InterruptedException {
        initialPage.login();
       firstPage.click_menu();
       firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        // Tap on Favorite tab.
        dealsPage.click_Favorite();
        //click all Vendors
        dealsPage.click_Allvendors();
        // Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        // Tap on favorite icon.
        dealsPage.click_favorite_KFC();
        dealsPage.go_back();
        //go to favorite page
        dealsPage.click_Favorite();
        // Check if  removed from favorite page
        //not completed
    }
}
