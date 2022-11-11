package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.AndroidActions;

public class ArrivalFlightsPage extends AndroidActions {

    AndroidDriver driver;

    public ArrivalFlightsPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup")
    private WebElement filterBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' Conditions']")
    private WebElement conditionsOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enroute Flights']")
    private WebElement enrouteFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tmo Flights']")
    private WebElement tmoFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Flights On Final Approach']")
    private WebElement flightsOnFinalApproachCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Landed Flights']")
    private WebElement landedFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arrived Flights']")
    private WebElement arrivedFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Scheduled Flights']")
    private WebElement scheduledFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apply']")
    private WebElement applyBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
    private WebElement filterResultComponent;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[15]/android.widget.TextView[2]")
    private WebElement scheduledALDTStatus;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[22]/android.widget.TextView[1]")
    private WebElement scheduledAIBTStatus;

    public void clickFilterBtn(){
        filterBtn.click();
    }

    public void clickApplyBtn(){
        applyBtn.click();
    }

    public boolean conditionsOptionDisplayed(){
        return conditionsOption.isDisplayed();
    }

    public void checkConditionsOptions(){
        conditionsOption.click();
        Assert.assertTrue(enrouteFlightsCondition.isDisplayed());
        Assert.assertTrue(tmoFlightsCondition.isDisplayed());
        Assert.assertTrue(flightsOnFinalApproachCondition.isDisplayed());
        Assert.assertTrue(landedFlightsCondition.isDisplayed());
        Assert.assertTrue(arrivedFlightsCondition.isDisplayed());
        Assert.assertTrue(scheduledFlightsCondition.isDisplayed());
    }

    public void clickScheduledFlights(){
        scheduledFlightsCondition.click();
    }

    public void clickFilterResultComponent(){
        filterResultComponent.click();
    }

    public void scheduledAssertion() throws InterruptedException {
        Assert.assertEquals(scheduledALDTStatus.getText(), "--:--");
        //scrollToText("AIBT");
        //scrollToEndAction();
        WebElement aldt = getScheduledALDTStatus();
        actions = new AndroidTouchAction(driver);
        actions.tap(ElementOption.element(aldt)).perform();
        scrollDown();
        Assert.assertEquals(scheduledAIBTStatus.getText(), "--:--");
    }

    public WebElement getScheduledALDTStatus(){
        return scheduledALDTStatus;
    }
}
