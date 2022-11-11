package ProductObject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.AndroidActions;

import java.awt.font.TextHitInfo;
import java.time.Duration;

public class DepartureFlightsPage extends AndroidActions {

    AndroidDriver driver;

    public DepartureFlightsPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup")
    private WebElement filterBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' Conditions']")
    private WebElement conditionsOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Scheduled Flights']")
    private WebElement scheduledFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Departed Flights']")
    private WebElement departedFlightsCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tobt Within 1 Hour']")
    private WebElement tobtCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tsat Within 1 Hour']")
    private WebElement tsatCondition;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INBOUND']")
    private WebElement inboundOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TURNAROUND']")
    private WebElement turnaroundOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OUTBOUND']")
    private WebElement outboundOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ME 633']")
    private WebElement firstFilterResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[1]")
    private WebElement aobtStatus;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apply']")
    private WebElement applyBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[2]")
    private WebElement aobtText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FLIGHT DETAILS']")
    private WebElement title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All Airlines']")
    private WebElement allAirlinesBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All Airports']")
    private WebElement allAirportsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='IATA']")
    private WebElement iataText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ICAO']")
    private WebElement icaoText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement searchIcon;

    @AndroidFindBy(className = "android.widget.EditText")
    private WebElement editTextBar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement iataResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement iataAirportResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement icaoResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement icaoAirportResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    private WebElement nameResult;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement airportNameResult;

    public void clickFilterBtn(){
        filterBtn.click();
    }

    public boolean conditionsOptionDisplayed(){
        return conditionsOption.isDisplayed();
    }

    public void checkConditionsOptions() {
        conditionsOption.click();
        Assert.assertEquals(scheduledFlightsCondition.getText(), "Scheduled Flights");
        Assert.assertEquals(departedFlightsCondition.getText(), "Departed Flights");
        Assert.assertEquals(tobtCondition.getText(), "Tobt Within 1 Hour");
        Assert.assertEquals(tsatCondition.getText(), "Tsat Within 1 Hour");
    }

    public void scheduledCheck() throws InterruptedException {
        scheduledFlightsCondition.click();
        Thread.sleep(3000);
        applyBtn.click();

    }

    public void checkAOBT() throws InterruptedException {
        firstFilterResult.click();
        Thread.sleep(5000);
        //swipeAction(inboundOption);
        turnaroundOption.click();
        Thread.sleep(5000);
        //swipeAction(turnaroundOption);
        outboundOption.click();
        Thread.sleep(5000);
        System.out.println(aobtText.getText());
        Assert.assertEquals(aobtStatus.getText(), "--:--");
        Thread.sleep(5000);
    }

    public void clickAllAirlinesBtn(){
        allAirlinesBtn.click();
    }

    public boolean iataAirlineCheck(){
        return iataText.isDisplayed();
    }

    public boolean iataAirportCheck(){
        return iataText.isDisplayed();
    }

    public boolean icaoAirlineCheck(){
        return icaoText.isDisplayed();
    }

    public boolean icaoAirportCheck(){
        return icaoText.isDisplayed();
    }

    public void searchAirlineIATA() throws InterruptedException {
        searchIcon.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver
                .findElement(AppiumBy.className("android.widget.EditText")),"text" , "Search"));
        editTextBar.sendKeys("Q5");
        Thread.sleep(3000);
    }

    public void searchAirportIATA() throws InterruptedException {
        searchIcon.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver
                .findElement(AppiumBy.className("android.widget.EditText")),"text" , "Search"));
        editTextBar.sendKeys("DIR");
        Thread.sleep(5000);
    }

    public void checkSearchMatchIATAAirline(){
        Assert.assertEquals(iataResult.getText(), "Q5");
    }

    public void searchAirlineICAO() throws InterruptedException {
        editTextBar.sendKeys("ABX");
        Thread.sleep(5000);
    }

    public void checkSearchMatchICAOAirline(){
        Assert.assertEquals(icaoResult.getText(), "ABX");
    }

    public void searchAirlineName() throws InterruptedException {
        editTextBar.sendKeys("ACM");
        Thread.sleep(5000);
    }

    public void checkAirlineName(){
        Assert.assertTrue(nameResult.getText().contains("ACM"));
    }

    public void clickAllAirportsBtn() {
        allAirportsBtn.click();
    }

    public void checkSearchMatchIATAAirport(){
        Assert.assertEquals(iataAirportResult.getText(), "DIR");
    }

    public void searchAirportICAO() throws InterruptedException {
        editTextBar.sendKeys("GMAD");
        Thread.sleep(5000);
    }

    public void checkSearchMatchICAOAirport(){
        Assert.assertEquals(icaoAirportResult.getText(), "GMAD");
    }

    public void searchAirportName() throws InterruptedException {
        editTextBar.sendKeys("Alamosa Municipal Airport");
        Thread.sleep(5000);
    }

    public void checkSearchMatchAirportName(){
        Assert.assertEquals(airportNameResult.getText(), "Alamosa Municipal Airport");
    }
}
