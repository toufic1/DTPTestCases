package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_008 extends BaseTest {
    @Test
    public void Deals_Test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Check if all the vendor cards (for which rating is available) displays avg. rating.
        dealsPage.every_Vendor_has_rating();

    }
}
