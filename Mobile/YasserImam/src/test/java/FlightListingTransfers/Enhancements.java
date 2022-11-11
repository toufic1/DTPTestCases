package FlightListingTransfers;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Enhancements extends BaseTest {

    @Test(priority = 1)
    public void ArrivalExists() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(2000);
        flightListing.clickFlightBtn();
        Assert.assertFalse(flightListing.arrivalExists());
    }

    @Test(priority = 2)
    public void DepartureExists(){
        Assert.assertFalse(flightListing.departureExists());
    }
}
