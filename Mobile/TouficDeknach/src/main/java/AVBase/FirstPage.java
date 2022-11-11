package AVBase;

import Utils.AndroidActions;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FirstPage extends AndroidActions {

    AndroidDriver driver;
    public FirstPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement menu_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    private WebElement setting_btn;
    @AndroidFindBy(className = "android.widget.Switch")
    private WebElement UTC;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private WebElement temperature;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private WebElement visibility;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[3]")
    private WebElement windSpeed;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement next1h;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement next3h;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement next6h;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement next12hText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']")
    private WebElement information;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Contacts']")
    private WebElement contacts;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private WebElement description;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[4]")
    private WebElement email;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[3]")
    private WebElement tel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='customs@dubaiairports.ae']")
    private WebElement hisMail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='80080080']")
    private WebElement hisNumber;

    @AndroidFindBy(id ="com.google.android.gm:id/peoplekit_chip")
    private WebElement toMail;

    @AndroidFindBy(id="com.google.android.dialer:id/digits")
    private WebElement tocall;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Flight Operations']")
    private WebElement FlightOp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Information']")
    private WebElement Information;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Standard Procedure']")
    private WebElement StandardProcedure;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arrival Flights']")
    private WebElement ArrivalFlight;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Departure Flights']")
    private WebElement FlightDep;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Updates']")
    private WebElement SendUpdates;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Events']")
    private WebElement events;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OTPA Overall']")
    private WebElement OTPA;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OTPD Overall']")
    private WebElement Otpd_button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OTPT Overall']")
    private WebElement otpt_button;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='First Bag']")
    private WebElement firstBag;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Last Bag']")
    private WebElement lastBag;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Deals']")
    private WebElement Deals;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Flights Lookup']")
    private WebElement Flight_lookup;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chat']")
    private WebElement Chat;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terminal Operations']")
    private WebElement TerminalOperations;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Physical Distance Monitoring']")
    private WebElement physicalDistance;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='About Airport View']")
    private WebElement AboutAirport;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement Logo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Report Issues']")
    private WebElement Reported_Issues;
    public void click_menu() throws InterruptedException {
        menu_btn.click();
    }
    public void click_settings() throws InterruptedException {
        setting_btn.click();
        Thread.sleep(3000);
    }

    public void UTC_Displayed()
    {
        UTC.isDisplayed();
    }

    public void UTC_OFF()
    {
        Assert.assertTrue(!UTC.isSelected());
    }

    public void UTC_CLICK() throws InterruptedException {
        UTC.click();
        Thread.sleep(3000);
        Assert.assertTrue(UTC.isSelected());



    }


    public void checking_weather() throws InterruptedException {
      Thread.sleep(5000);
        next1h.click();
        Thread.sleep(5000);
        next3h.click();
        Thread.sleep(5000);
        next6h.click();
        Thread.sleep(5000);
        Assert.assertEquals("Next 12 Hours",next12hText.getText());
        scrollToText("Alerts");
      temperature.isDisplayed();
      visibility.isDisplayed();
      windSpeed.isDisplayed();
    }

    public void getContacts() throws InterruptedException {
        Thread.sleep(5000);
        information.click();
        Thread.sleep(5000);
        contacts.click();
        Thread.sleep(4000);
    }
    public void checkContactDescription()
    {
        Assert.assertFalse(description.isDisplayed());
    }

    public void Email_Availability()
    {

        Assert.assertFalse(email.isDisplayed());
    }

    public void Phone_Availability()
    {

        Assert.assertFalse(tel.isDisplayed());
    }

    public void same_mail()
    {
        String Email=hisMail.getText();
        hisMail.click();
        Assert.assertEquals(Email,toMail.getText());
    }

    public void same_phone_Number()
    {
        String Nmuber=hisNumber.getText();
        hisNumber.click();
        Assert.assertEquals(Nmuber,tocall.getText());
    }

    public void flightOp_CLick()
    {
        FlightOp.click();
    }

    public void links_Availability()
    {
        Assert.assertFalse(ArrivalFlight.isDisplayed());
        Assert.assertFalse(FlightDep.isDisplayed());
    }

     public void send_update_click()
     {
         SendUpdates.click();
     }

     public void events_click()
     {
         events.click();
     }

     public void click_otpa()
     {
         OTPA.click();
     }
    public void otpd_click()
    {
        Otpd_button.click();
    }

    public void otpt_click()
    {
        otpt_button.click();
    }

    public void FirstBag_click()
    {
        firstBag.click();
    }
    public void LastBag_click()
    {
        lastBag.click();
    }
    public void Deals_click() throws InterruptedException {
        Deals.click();
        Thread.sleep(10000);
    }

    public void FLight_lookup_click()
    {
        Flight_lookup.click();
    }
    public void chat_click()
    {
        Chat.click();
    }
    public void terminal_Operation_click()
    {
        TerminalOperations.click();
    }
    public void Physical_Distance_click()
    {physicalDistance.click();}
    public void aboutAirport_click()
    {
        AboutAirport.click();
    }
    public void logo_isPresent()
    {
        Assert.assertTrue(Logo.isDisplayed());
    }
    public void check_DTP_Logo_present(AndroidDriver driver)
    {
        if (driver.findElements(By.id("DTP_Logo")).size()>0) {
          Assert.assertTrue(false,"Logo is present");
        }
        else Assert.assertTrue(true,"Logo is not present");
    }
    public void Information_click()
    {
        Information.click();
    }
    public void Standard_operation_click()
    {
        StandardProcedure.click();
    }
    public void click_Arrival()
    {
        ArrivalFlight.click();
    }

    public void check_reported_Issues_text()
    {
        Assert.assertEquals(Reported_Issues.getText(),"Report Issues");
    }
    public void click_Departure_Flight()
    {
        FlightDep.click();
    }

    public void click_report_Issues()
    {
        Reported_Issues.click();
    }

}
