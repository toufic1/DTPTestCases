package FlightFiltersActivitiesChanges;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionsArrival extends BaseTest {

//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Arrival Flights.
//3. Tap on filter icon.
//4. Verify if a new filter 'Conditions' is available.
    @Test(priority = 1)
    public void checkConditionsExistence() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(5000);
        menuPage.clickFlightOperationsBtn();
        menuPage.clickArrivalFlightsBtn();
        Thread.sleep(5000);
        arrivalPage.clickFilterBtn();
        Assert.assertTrue(arrivalPage.conditionsOptionDisplayed());
    }
//1. Login to tNexus mobile app.
//2. Tap on application menu and tap on Arrival Flights.
//3. Tap on filter icon and tap on Conditions.
//4. Verify the options available in Conditions filter.
    @Test(dependsOnMethods = "checkConditionsExistence" )
    public void checkConditionsComponents(){
        arrivalPage.checkConditionsOptions();
    }

//1. Tap on application menu and tap on Arrival Flights.
//2. Tap on filter icon and tap on Conditions.
//3. Tap on Scheduled Flights and tap on apply.
//4. Verify if the selected filter is applied to arrival flights list.
    @Test(dependsOnMethods = "checkConditionsComponents")
    public void scheduledFlightsCheck() throws InterruptedException {
        arrivalPage.clickScheduledFlights();
        Thread.sleep(2000);
        arrivalPage.clickApplyBtn();
        Thread.sleep(15000);
        arrivalPage.clickFilterResultComponent();
        Thread.sleep(5000);
        arrivalPage.scheduledAssertion();
    }
}
