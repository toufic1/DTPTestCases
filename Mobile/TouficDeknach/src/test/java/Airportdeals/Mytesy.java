package Airportdeals;

import Base.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.Test;

public class Mytesy extends BaseTest {
    @Test
    public void myTest()
    {
        driver.startActivity(new Activity("ae.dtp.airportview","com.onesignal.PermissionsActivity - Airport View"));
    }
}
