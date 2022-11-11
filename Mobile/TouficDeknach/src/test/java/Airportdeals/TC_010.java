package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_010 extends BaseTest {
    @Test
    public void deals_Test() throws InterruptedException {

        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Check if 'Featured' badge is available on vendor card for a vendor that has at least 1 active featured offer.
        //Check if 'Featured' badge is not available on vendor card for a vendor that does not have any active featured offer.
        dealsPage.check_Every_Offer_has_Featured_badge();
        //only 3 of the 8 vendors have the Featured Badge
    }
}
