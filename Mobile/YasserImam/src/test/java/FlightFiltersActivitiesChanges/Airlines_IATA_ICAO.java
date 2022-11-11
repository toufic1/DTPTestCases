package FlightFiltersActivitiesChanges;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Airlines_IATA_ICAO extends BaseTest {

//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Arrival/Departure flights.
//3. Tap on filter icon an tap on Airlines.
//4. Verify if IATA/IACO code are available along with airline name.
    @Test
    public void clickAllAirlines() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickFlightOperationsBtn();
        Thread.sleep(2000);
        menuPage.clickDepartureFlightsBtn();
        Thread.sleep(3000);
        departurePage.clickFilterBtn();
        Thread.sleep(5000);
        departurePage.clickAllAirlinesBtn();
    }

    @Test(dependsOnMethods = "clickAllAirlines")
    public void checkIATAICAO(){
        Assert.assertTrue(departurePage.iataAirlineCheck());
        Assert.assertTrue(departurePage.icaoAirlineCheck());
    }

//1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airlines.
//3. Tap on search icon.
//4. Type any airline IATA code in search textbox.
//5. Verify if all the airlines matching the search text are displayed.
    @Test(dependsOnMethods = "checkIATAICAO")
    public void searchIATAAirline() throws InterruptedException {
        departurePage.searchAirlineIATA();
        departurePage.checkSearchMatchIATAAirline();
        Thread.sleep(2000);
    }

//1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airlines.
//3. Tap on search icon.
//4. Type any airline IACO code in search textbox.
//5. Verify if all the airlines matching the search text are displayed.
    @Test(dependsOnMethods = "searchIATAAirline")
    public void searchICAO() throws InterruptedException {
        departurePage.searchAirlineICAO();
        departurePage.checkSearchMatchICAOAirline();
        Thread.sleep(2000);
    }

// 1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airlines.
//3. Tap on search icon.
//4. Type any airline Airline name code in search textbox.
//5. Verify if all the airlines matching the search text are displayed.
    @Test(dependsOnMethods = "searchICAO")
    public void searchAirlineName() throws InterruptedException {
        departurePage.searchAirlineName();
        departurePage.checkAirlineName();
        Thread.sleep(3000);
    }
}
