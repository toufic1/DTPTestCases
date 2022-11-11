package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class MainPage extends AndroidActions {

    AndroidDriver driver;

    public MainPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'OTPA Overall']")
    private WebElement OTPABtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'OTPD Overall']")
    private WebElement OTPDBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'OTPT Overall']")
    private WebElement OTPTBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Last Bag']")
    private WebElement lastBagBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'First Bag']")
    private WebElement firstBagBtn;


    public void OTPAClick(){
        OTPABtn.click();
    }

    public void OTPDClick(){
        OTPDBtn.click();
    }

    public void OTPTClick(){
        OTPTBtn.click();
    }

    public void clickLastBag(){
        lastBagBtn.click();
    }

    public void clickFirstBag(){
        firstBagBtn.click();
    }
}
