package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_016 extends BaseTest {
    @Test
    public void deals_test() throws InterruptedException {



        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        dealsPage.click_Favorite();
        //Search text box should be available in Category tab of vendors list.
        dealsPage.Search_Icon_isDisplayed();
        // User should be able to enter any text and vendors list should be displayed based on entered search text.
        dealsPage.click_Allvendors();
        dealsPage.click_Search_bar();
        //If no vendor is available based on entered text, 'No data found' message should be displayed on the screen.
        dealsPage.Send_text_TOsearch("KFC");
        dealsPage.Send_text_TOsearch("KFCC");
    }
}












