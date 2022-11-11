package AV_Weather;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeatherWidget extends BaseTest {

//  1. Login to mobile app.
//  2. Check if the mentioned are available in weather widget.
    @Test(priority = 2)
    public void checkTemp() throws InterruptedException {
        Assert.assertTrue(weather.tempExists());
    }

    @Test(priority = 3)
    public void checkHumidity() {
        Assert.assertTrue(weather.humidityExists());
    }

    @Test(priority = 4)
    public void checkWind() {
        Assert.assertTrue(weather.windSpeedExists());
    }

    @Test(priority = 1)
    public void checkGraph() throws InterruptedException {
        weather.NextGraphBtnClick();
        //Thread.sleep(5000);
        weather.NextNextGraphBtnClick();
        Thread.sleep(5000);
        weather.NextNextGraphBtnClick();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
                        "/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup" +
                        "/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.widget.TextView")).getText(), "Next 12 Hours");
    }
}
