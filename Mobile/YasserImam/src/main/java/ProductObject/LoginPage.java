package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;


public class LoginPage extends AndroidActions {
    AndroidDriver driver;

    public LoginPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Use Credentials']")
    private WebElement useCredentials;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username']")
    private WebElement username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Client']")
    private WebElement client;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement login;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    private WebElement ok;


    public void logIn() throws InterruptedException {
        useCredentials.click();
        Thread.sleep(1000);
        username.sendKeys("mobileuser");
        password.sendKeys("Dtp@2022");
        client.sendKeys("Leb_qa");
        login.click();
        Thread.sleep(50000);
    }
}
