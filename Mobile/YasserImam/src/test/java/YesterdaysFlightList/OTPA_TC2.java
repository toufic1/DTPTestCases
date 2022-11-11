package YesterdaysFlightList;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OTPA_TC2 extends BaseTest {

    //1. Tap on OTPA Passenger /OTPA cargo/OTPA overall option from the home screen.
// 2. Check if OTPA page is open
// 3. Tap on 5 minutes /15 min
// 4. Tap on Today's OTP% for All Airlines /specific airlines/other airlines
// 5. Verify the Label of the screen
// 6. Tap on Yesterday's OTP% for All Airlines /specific airlines/other airlines
// 7. Verify the Label of the screen

    @Test(priority = 1)
    public void checkOTPPage() throws InterruptedException {
        main.OTPAClick();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL']")).isDisplayed());
        Thread.sleep(5000);
        //OTPA OVERALL
    }

    @Test(priority = 2)
    public void yesterdaysOTP() throws InterruptedException {
        otpa.clickFiveMinutesBtn();
        Thread.sleep(5000);
        otpa.clickAllAirlinesYesterday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).getText(), "OTPA OVERALL - YESTERDAY");
        driver.navigate().back();
        //Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void todaysOTP() throws InterruptedException{
        otpa.clickAllAirlinesToday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).getText(), "OTPA OVERALL - TODAY");
        driver.navigate().back();
        //Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void individualYesterdaysOTP() throws InterruptedException {
        otpa.clickIndividualAirlinesYesterday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).getText(), "OTPA OVERALL - YESTERDAY");
           driver.navigate().back();
    }

    @Test(priority = 5)
    public void individualTodaysOTP() throws InterruptedException {
        otpa.clickindividualAirlinesToday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).getText(), "OTPA OVERALL - TODAY");
        Thread.sleep(5000);
        driver.navigate().back();
    }

    @Test(priority = 6)
    public void othersYesterdaysOTP() throws InterruptedException {
        otpa.clickOthersYesterday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).getText(), "OTPA OVERALL - YESTERDAY");
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void othersTodaysOTP() throws InterruptedException {
        otpa.clickOthersToday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - TODAY']")).getText(), "OTPA OVERALL - TODAY");
        Thread.sleep(5000);
    }
}
