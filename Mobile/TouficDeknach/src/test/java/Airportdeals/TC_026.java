package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_026 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        //Check if each active offer has title of the offer.
        dealsPage.check_Offer_text_KFC();
    }
}