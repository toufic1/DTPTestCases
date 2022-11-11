package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReportIssuesPage extends AndroidActions {
    public ReportIssuesPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement Categories;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement plusButton;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Issue Title']")
    private WebElement Issue_Title;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Location Details']")
    private WebElement Location_Details;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Issue Details']")
    private WebElement Issue_Details;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' Location']")
    private WebElement Location;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dutty Free']")
    private WebElement Dutty_Free;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Iii']")
    private WebElement lii;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    private WebElement send;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes']")
    private WebElement Yes;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ERROR']")
    private  WebElement Error;
    public void click_Categories()
    {
        Categories.click();
    }
    public void check_category_present(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Category']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false,"Category does not exist");
    }

    public void Fill_Fields_save_check(AndroidDriver driver) throws InterruptedException {
        Issue_Title.sendKeys("Issue Title");
        Location_Details.sendKeys("Location Details");
        Issue_Details.sendKeys("Issue details");
        Location.click();
        Dutty_Free.click();
        send.click();
        Yes.click();
        Thread.sleep(3000);
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='ERROR']")).size()>0)
            Assert.assertTrue(true,"Cannot Send");
        else Assert.assertTrue(false);

    }
    public void click_plus()
    {
        plusButton.click();
    }


}
