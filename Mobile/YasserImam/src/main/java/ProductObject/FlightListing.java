package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class FlightListing extends AndroidActions {

    AndroidDriver driver;

    public FlightListing(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView['Flight Operations']")
    private WebElement flightBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView['Arrival Flights']")
    private WebElement arrivalFlights;

    @AndroidFindBy(xpath = "//android.widget.TextView['Departure Flights']")
    private WebElement departureFlights;

    public void clickFlightBtn(){
        flightBtn.click();
    }

    public boolean arrivalExists(){
        return arrivalFlights.isDisplayed();
    }

    public boolean departureExists(){
        return departureFlights.isDisplayed();
    }




}
