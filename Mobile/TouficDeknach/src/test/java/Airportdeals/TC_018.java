package Airportdeals;

import AVBase.DealsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_018 extends BaseTest {
    @Test
    public void Deals_test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Deals_click();
        DealsPage dealsPage=new DealsPage(driver);
        //Tap on any vendor card from list of vendors.
        dealsPage.click_KFC();
        //Check if mentioned are available.
        dealsPage.check_element_presence();

        //On clicking on a vendor, user should see the vendor profile page will have the following;
        //  - Favorite icon
        //  - Vendor Name: The name of the vendor
        //  - Average Rating: The average rating calculated by the system. If the rating is not available, the rating will not show (0/5 is not correct, it should be empty)
        //  - User Rating: Allow users to rate and see previous rating as defined in the following subsection
        //  - Offers List: Offers of the vendor shown in a card design as detailed in the respective subsection
        //  - Outlets List: List of outlets
        //  - Website card: available only if the vendor has a website.
    }
}
