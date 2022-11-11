package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_027 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {

        //Check if each active offer has description of the offer.
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        //Check if each active offer has description of the offer.
        dealsPage.each_offer_has_description();
    }
}
