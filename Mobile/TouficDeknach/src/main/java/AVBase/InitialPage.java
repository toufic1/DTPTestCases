package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class InitialPage extends AndroidActions {

    public AndroidDriver driver;


    public InitialPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        this.driver = driver;

        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this); //init elements behind the screen,construct the objects

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Use Credentials']")
    public WebElement useCredential;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username']")
    public WebElement Username;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public  WebElement Password;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Client']")
    public  WebElement Client;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    public  WebElement login;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    public  WebElement Ok;
    public void login() throws InterruptedException {
        useCredential.click();
        Username.sendKeys("mobileuser");
        Password.sendKeys("Dtp@2022");
        Client.sendKeys("Leb_qa");
        login.click();
        Thread.sleep(3000);
        Ok.click();
        Thread.sleep(20000);
    }

}
