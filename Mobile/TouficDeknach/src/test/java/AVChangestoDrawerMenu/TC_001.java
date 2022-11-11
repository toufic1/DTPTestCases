package AVChangestoDrawerMenu;

import AVBase.Menu;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest {
    @Test
    public void Menu_test() throws InterruptedException {

        //1.Login to Airportview mob app
        initialPage.login();
        // 2.Tap on slider menu
        firstPage.click_menu();
        Menu menu=new Menu(driver);
        //3.Verify the items shown on slider menu
        menu.check_elements(driver);
        //•        Home
        //•        Flight Operations
        //                oArrival Flight
        //                oDeparture Flight
        //                oFlight Lookup
        //                oAircraft Tows
        //                oSubscribed Flights
        //                oFavorite Flights
        //•        Terminal Operations
        //                oLive status
        //                oTerminal Map
        //•        Information
        //                oContacts
        //                oGlossary
        //                oStandard Procedures
        //                oFAQ
        //•        Dynamic Pages
        //           oPage 1
        //           oPage 2
        //           oPage 3
        //•        Events
        //•        Report Issues
        //•        Send Updates
        //•        Settings
        //•        Feedback
        //•        About
        //•        Log out
    }

}
