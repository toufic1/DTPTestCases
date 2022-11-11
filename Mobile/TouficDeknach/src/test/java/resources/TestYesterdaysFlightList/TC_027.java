package resources.TestYesterdaysFlightList;

import AVBase.FirstBagPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_027 extends BaseTest {
    @Test
    public void FirstBag_Test() throws InterruptedException {

        initialPage.login();
        //Tap on First Bag option from the home screen.
        firstPage.FirstBag_click();
        FirstBagPage firstBagPage=new FirstBagPage(driver);
        // Check if BAG KPI page is open
        firstBagPage.check_Bag_Open();
        // Tap on yesterday's count for All
        firstBagPage.All_Terminal_Yesterday_click();
        // Verify the Label of the screen
        firstBagPage.check_Yesterday_label();
        firstBagPage.go_back();
        // Tap on today's count for all
        firstBagPage.All_Today_click();
        // Verify the Label of the screen
        firstBagPage.check_today_Label();
        firstBagPage.go_back();
        // Tap on yesterday's count for individual terminals
        firstBagPage.Individual_Yesterday_click();
        // Verify the Label of the screen
        firstBagPage.check_Yesterday_label();
        firstBagPage.go_back();
        // Tap on today's count for Individual terminals
        firstBagPage.Individual_Today_click();
        // Verify the Label of the screen
        firstBagPage.check_today_Label();


    }
}































  //  Tap on Menu
//  Tap on any Reported Issues
//  Tap on Reported Issues share icon
//the reported issues share icon does not exist