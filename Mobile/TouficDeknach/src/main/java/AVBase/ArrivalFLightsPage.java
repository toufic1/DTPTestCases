package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ArrivalFLightsPage extends AndroidActions {
    public ArrivalFLightsPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup")
    private WebElement Filter;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    private WebElement Global_Flights;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement Flight;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INBOUND']")
    private WebElement Inbound;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement T;
    public void click_Filter()
    {
        Filter.click();
    }

    public void click_GlobalFlights()
    {
        Global_Flights.click();
    }
    public void check_Filters(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
       if(driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")).size()>0)
           Assert.assertTrue(true);
       else Assert.assertTrue(false,"Global Flights does not exist");
       if(driver.findElements(By.xpath("//android.widget.TextView[@text='International Flights']")).size()>0)
           Assert.assertTrue(true);
       else Assert.assertTrue(false,"International flights does not exist");
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Domestic Flights']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false,"Domestic Flights does not exist");

    }
    public  void click_Flight()
    {
        Flight.click();
    }
    public void click_T()
    {
     T.click();
    }
    public void check_Gate_Close_presence(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Gate Close']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }

    public void check_Handling_Agent_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='H.Agent:']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }
    public void check_VIA_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='VIA List:']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }

    public void check_Call_Sign_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Call Sign:']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }
    public void check_Stand_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Stand:']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }
    public void check_AEBT_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='AEBT']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false,"AEBT does not exist");
    }

    public void check_Gate_close_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Gate CLose']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false,"Gate close does not exist");
    }

}
