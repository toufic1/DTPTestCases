package AVBase;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;

public class Menu extends AndroidActions {
    private static final Logger logger = Logger.getLogger(String.valueOf(Menu.class));
    public Menu(AndroidDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(5000);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void check_elements(AndroidDriver driver)
    {

       if(driver.findElements(By.xpath("//android.widget.TextView[@text='Home']")).size()>0)
           Assert.assertTrue(true);
       else Assert.assertTrue(false);


       if(driver.findElements(By.xpath("//android.widget.TextView[@text='Flight Operations']")).size()>0)
        {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Flight Operations']")).click();
            if(driver.findElements(By.xpath("//android.widget.TextView[@text='Arrival Flights']")).size()>0
            ||driver.findElements(By.xpath("//android.widget.TextView[@text='Departure Flights']")).size()>0 ||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='FLights Lookup']")).size()>0||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='Aircraft Tows']")).size()>0||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='Subscribed Flights']")).size()>0||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='Favorite Flights']")).size()>0)
                Assert.assertTrue(true);
            else Assert.assertTrue(false);
        }
        else Assert.assertTrue(false);


        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Terminal Operations']")).size()>0)
        {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Terminal Operations']")).click();
            if(driver.findElements(By.xpath("//android.widget.TextView[@text='Terminal Maps']")).size()>0
                    ||driver.findElements(By.xpath("//android.widget.TextView[@text='Live Status']")).size()>0)
                Assert.assertTrue(true);
            else Assert.assertTrue(false);
        }
        else Assert.assertTrue(false);



        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Information']")).size()>0)
        {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Information']")).click();
            if(driver.findElements(By.xpath("//android.widget.TextView[@text='Contacts']")).size()>0
                    ||driver.findElements(By.xpath("//android.widget.TextView[@text='Glossary']")).size()>0 ||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='FAQ']")).size()>0||
                    driver.findElements(By.xpath("//android.widget.TextView[@text='Standard Procedure']")).size()>0)
                Assert.assertTrue(true);
            else Assert.assertTrue(false);
        }
        else Assert.assertTrue(false);



        if(driver.findElements(By.xpath("//android.widget.TextView[@text='Dynamic Pages']")).size()>0)
        {
            driver.findElement(By.xpath("//android.widget.TextView[@text='Dynamic Pages']")).click();
            if(driver.findElements(By.xpath("//android.widget.TextView[@text='Page 1']")).size()>0
                    ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 2']")).size()>0
                    ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 3']")).size()>0)
                Assert.assertTrue(true);
            else {
                if(driver.findElements(By.xpath("//android.widget.TextView[@text='Page 1']")).size()==0
                        ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 2']")).size()==0
                        ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 3']")).size()==0)
                {scrollToText("497cy");
                    if(driver.findElements(By.xpath("//android.widget.TextView[@text='Page 1']")).size()==0
                            ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 2']")).size()==0
                            ||driver.findElements(By.xpath("//android.widget.TextView[@text='Page 3']")).size()==0)
                        Assert.assertTrue(false,"Page 1 2 or/and 3 does not exist");
                }
            }
        }
        else Assert.assertTrue(false);





    }
}
