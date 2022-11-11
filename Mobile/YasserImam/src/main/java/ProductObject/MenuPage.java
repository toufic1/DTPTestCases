package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.AndroidActions;

import java.net.StandardProtocolFamily;

public class MenuPage extends AndroidActions {

    AndroidDriver driver;

    public MenuPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/" +
            "android.view.ViewGroup/android.view.ViewGroup")
    private WebElement menuBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    private WebElement settingsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Updates']")
    private WebElement sendUpdatesBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Flight Operations']")
    private WebElement flightOperationsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arrival Flights']")
    private WebElement arrivalFlightsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Departure Flights']")
    private WebElement departureFlightsBtn;

    @AndroidFindBy(xpath = "//android.widget.Switch")
    private WebElement switchBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Information']")
    private WebElement infoBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Standard Procedure']")
    private WebElement StandardProcedureBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AIRPORT ']")
    private WebElement mainTitle;

    public void clickMenu() {
        menuBtn.click();
    }

    public void clickSettings() throws InterruptedException {
        settingsBtn.click();
        Thread.sleep(2000);
    }

    public boolean switchDisplayed(){
        boolean displayed = switchBtn.isDisplayed();
        return displayed;
    }

    public boolean switchCheckOff(){
        boolean isOff = !switchBtn.isSelected();
        return isOff;
    }

    public void clickSendUpdates() throws InterruptedException {
        Thread.sleep(5000);
        sendUpdatesBtn.click();
    }

    public void clickSwitch(){
        switchBtn.click();
    }

    public void clickFlightOperationsBtn(){
        flightOperationsBtn.click();
    }

    public void clickArrivalFlightsBtn(){
        arrivalFlightsBtn.click();
    }

    public void clickDepartureFlightsBtn(){
        departureFlightsBtn.click();
    }

    public void clickInfo(){
        infoBtn.click();
    }

    public void clickStandardProcedure(){
        StandardProcedureBtn.click();
    }

    public void checkMainTitle(){
        Assert.assertTrue(mainTitle.isDisplayed());
    }

}
