package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_25 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        // 2. Check if each active offer has category logo of the offer before the title.
        dealsPage.check_Logo_exist();
        dealsPage.check_logo_Before_OfferText();
    }
}