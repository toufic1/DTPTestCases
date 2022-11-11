package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_032
        extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {




        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        dealsPage.click_first_offer();
        //Check if offer details are displayed.
        dealsPage.check_desription_details();
        dealsPage.check_back_button();
    }
}