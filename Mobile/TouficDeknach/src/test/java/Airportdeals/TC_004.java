package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC_004 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {

         initialPage.login();
        //1. Tap on application menu.
        firstPage.click_menu();
        // 2. Tap on Deals.
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        // 3. Verify the list of vendors displayed in Deals screen.
        dealsPage.verify_offer_displayed();

    }
}
