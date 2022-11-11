package WeatherWidgetTest;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class WeatherWidget_TC05 extends BaseTest {

    @Test
    public void WeatherTest() throws InterruptedException {
        //1.Login to Airport view 1.7 mob app
        initialPage.login();
        //2. Check if the mentioned are available in weather widget.
        firstPage.checking_weather();
        //Following should be available in weather widget;
        // - Temperature
        // - Humidity/visibility
        // - Wind Speed
        // - Next 12 hrs forecast graph

    }
}
