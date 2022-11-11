package Flights_Listing_Transfers;

import Base.BaseTest;
import org.testng.annotations.Test;

public class T28  extends BaseTest {
    @Test
    public void email_icon_Test() throws InterruptedException {




        // 1. Login to AV mobile app.
        initialPage.login();
        // 2. Click on menu.
        firstPage.click_menu();
       // 3. Expand Flight Operations.
        firstPage.flightOp_CLick();
        //4. Verify if arrival and departure links are removed.
        firstPage.links_Availability();
    }
}
