package FlightFiltersActivitiesChanges;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Airports_IATA_ICAO extends BaseTest {

//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Arrival/Departure flights.
//3. Tap on filter icon an tap on Airports.
//4. Verify if IATA/IACO code are available along with airport name.
    @Test
    public void clickAllAirports() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickFlightOperationsBtn();
        Thread.sleep(2000);
        menuPage.clickDepartureFlightsBtn();
        Thread.sleep(3000);
        departurePage.clickFilterBtn();
        Thread.sleep(5000);
        departurePage.clickAllAirportsBtn();
    }

    @Test(dependsOnMethods = "clickAllAirports")
    public void checkIATAICAO(){
        Assert.assertTrue(departurePage.iataAirportCheck());
        Assert.assertTrue(departurePage.icaoAirportCheck());
    }

//1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airports.
//3. Tap on search icon.
//4. Type any airport IATA code in search textbox.
//5. Verify if all the airports matching the search text are displayed.
    @Test(dependsOnMethods = "checkIATAICAO")
    public void searchIATAAirports() throws InterruptedException {
        departurePage.searchAirportIATA();
        departurePage.checkSearchMatchIATAAirport();
        Thread.sleep(2000);
    }

//1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airports.
//3. Tap on search icon.
//4. Type any airport IACO code in search textbox.
//5. Verify if all the airports matching the search text are displayed.
    @Test(dependsOnMethods = "searchIATAAirports")
    public void searchICAO() throws InterruptedException {
        departurePage.searchAirportICAO();
        departurePage.checkSearchMatchICAOAirport();
        Thread.sleep(2000);
    }

//1. Tap on application menu and tap on Arrival/Departure flights.
//2. Tap on filter icon an tap on Airports.
//3. Tap on search icon.
//4. Type any airport Airport name code in search textbox.
//5. Verify if all the airports matching the search text are displayed.
    @Test(dependsOnMethods = "searchICAO")
    public void searchAirportName() throws InterruptedException {
        departurePage.searchAirportName();
        departurePage.checkSearchMatchAirportName();
        Thread.sleep(2000);
    }


}
