package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.List;

public class TC_003 extends BaseTest {
    @Test
    public void deals_Test() throws InterruptedException {
        initialPage.login();
        //Tap on application menu.
        firstPage.click_menu();
        //Tap on Deals.
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Verify the Deals screen.
        dealsPage.Verify_Deals_screen();

          //throw new SkipException("Skipping this test");=>to skip a test
    }
}
