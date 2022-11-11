package Base;

import AVBase.FirstPage;
import AVBase.InitialPage;

import Utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;


public class BaseTest  {
    public static AndroidDriver driver;
    public InitialPage initialPage;
    public FirstPage firstPage;

    public static synchronized AndroidDriver getDriver() {
        return driver;
    }

    @BeforeClass(alwaysRun = true)//run before every thing in the class
    public void configurationAppium() throws IOException, InterruptedException {


        UiAutomator2Options options = new UiAutomator2Options();
        //options.setChromedriverExecutable("C:\\Users\\Toufic\\Desktop\\Udemy\\Appium\\src\\test\\java\\chromedriver.exe");
        options.setDeviceName("android-container");
        //options.setApp("/Users/Toufic/Desktop/Udemy/AVTestCases/src/test/java/resources/airportview-2.1.apk");
        options.setApp("/Users/Toufic/Desktop/airportview-2.1.apk");
        options.autoGrantPermissions();
      //  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);//we are using android device
        driver = new AndroidDriver(new URL("http://127.0.0.1:49153/wd/hub"), options);
        //automation start after we open the app in the device
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//wait 10 seconds until element visible
        initialPage =new InitialPage(driver);
        firstPage=new FirstPage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

