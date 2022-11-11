package AVBase;

import ProductObject.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    //public static ThreadLocal<AndroidDriver> tdriver = new ThreadLocal<AndroidDriver>();


    public LoginPage login;
    public MenuPage menuPage;
    public WeatherPage weather;
    public ContactsPage contacts;
    public FlightListing flightListing;
    public UpdatesPage update;
    public MainPage main;
    public OTPAPage otpa;
    public ArrivalFlightsPage arrivalPage;
    public DepartureFlightsPage departurePage;
    public OTPDPage otpd;
    public OTPTPage otpt;
    public LastBagPage firstBag;
    public ReportIssuesPage report;
    public SOPPage sop;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException, InterruptedException {
        service = new AppiumServiceBuilder().withAppiumJS(
                new File("C:\\Users\\Yasser\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        //options.setDeviceName("Pixel 4 XL API 29");
        options.setDeviceName("127.0.0.1:21503 device");
        options.setPlatformName("android");
        options.autoGrantPermissions();
        //options.setChromedriverExecutable("C:\\Users\\Yasser\\Desktop\\DTP\\Tools\\chromedriver.exe");
        //options.setApp("/Users/Yasser/Desktop/DTP/Appium/src/test/java/resources/ApiDemos1.apk");
        options.setApp("C:\\Users\\Yasser\\Desktop\\DTP\\AirportViewTest\\src\\test\\java\\resources\\airportview-2.1.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        login = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        weather = new WeatherPage(driver);
        contacts = new ContactsPage(driver);
        flightListing = new FlightListing(driver);
        update = new UpdatesPage(driver);
        main = new MainPage(driver);
        otpa = new OTPAPage(driver);
        arrivalPage = new ArrivalFlightsPage(driver);
        departurePage = new DepartureFlightsPage(driver);
        otpd = new OTPDPage(driver);
        otpt = new OTPTPage(driver);
        firstBag = new LastBagPage(driver);
        report = new ReportIssuesPage(driver);
        sop = new SOPPage(driver);

        //AndroidDriver init = init_driver();
        login.logIn();
        
    }
    
//    public AndroidDriver init_driver(){
//        tdriver.set(driver);
//        return getDriver();
//    }
//
//    public static synchronized AndroidDriver getDriver() {
//        return tdriver.get();
//    }


    @AfterClass(alwaysRun = true)
    public void TearDown(){
        driver.quit();
        service.stop();
    }
}
