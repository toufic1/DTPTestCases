package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SettingsPage extends AndroidActions {
    public SettingsPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void check_notification_config_Displayed(AndroidDriver driver)
    {
        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Notifications Configurations']")).size()>0)
            Assert.assertTrue(true);
        else Assert.assertTrue(false);
    }

}
