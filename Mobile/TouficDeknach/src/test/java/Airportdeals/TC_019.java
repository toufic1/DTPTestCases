package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_019  extends BaseTest {
    @Test
    public void Deals_test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        // Tap on favorite icon.
        dealsPage.check_favorite_is_Display();
        dealsPage.click_favorite_KFC();
        dealsPage.go_back();
        //Check if selected vendor card is added to Favorite tab.
        dealsPage.click_Favorite();
        dealsPage.check_KFC_Added_TO_Favorite();
    }
}
