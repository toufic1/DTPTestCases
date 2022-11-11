package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flight_Lookup_Page extends AndroidActions {
    AndroidDriver driver;
    String a,b;
    public Flight_Lookup_Page(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement drop_down;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FLIGHT NUMBER']")
    private WebElement FLight_number_choice;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AIRPORT']")
    private WebElement AIRPORT_choice;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Code Share / Call Sign / Flight Number']")
    private WebElement placeHolder;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")    private  WebElement Airport_Placeholder;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='12']")
    private WebElement Arrival12;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Departures']")
    private WebElement DeparatureButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='13']")
    private WebElement Deparature13;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement search;
    public void click_drop_down()
    {
        drop_down.click();
    }
    public void check_dropDown_Values()
    {
        Assert.assertTrue(FLight_number_choice.isDisplayed());
        Assert.assertTrue(AIRPORT_choice.isDisplayed());
    }

    public void check_FLight_number_default()
    {
        Assert.assertTrue(FLight_number_choice.isDisplayed());
    }
    public void click_Airport()
    {
        AIRPORT_choice.click();
    }
    public void click_Flight_number()
    {
        FLight_number_choice.click();
    }
    public void check_Airport_Is_Selected()
    {
        Assert.assertTrue(AIRPORT_choice.isDisplayed());
    }

    public void check_Placeholder()
    {
        Assert.assertEquals(placeHolder.getText(),"Origin/Destination/Via");
    }

    public void check_Placeholder_Airport() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Airport_Placeholder.getText(),"Airport IATA/ICAO");
    }
    public void give_FLight_number()
    {
        placeHolder.sendKeys("10");
    }
    public void give_Airport_code()
    {
        Airport_Placeholder.sendKeys("3");
    }
    public void Arrival()
    {
        Arrival12.click();
    }
    public void Deparature()
    {
        Deparature13.click();
    }

    public void click_Deparature()
    {
        DeparatureButton.click();
    }
    public void search_click()
    {
        search.click();
    }
    public void Data_page(AndroidDriver driver)
    {
        a=driver.getPageSource();
    }
    public void Result_page(AndroidDriver driver)
    {
        b=driver.getPageSource();
    }
    public void Verify_Result()
    {
        Assert.assertNotEquals(a,b);
    }


}
