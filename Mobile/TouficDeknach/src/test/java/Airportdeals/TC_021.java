package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_021 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {


        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        //Check if rating entry is available.
        dealsPage.check_rating_IS_Displayed();

    }
}
