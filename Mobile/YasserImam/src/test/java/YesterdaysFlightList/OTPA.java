package YesterdaysFlightList;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OTPA extends BaseTest {


    @Test(priority = 1)
    public void checkOTPAPage() throws InterruptedException {
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
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void individualYesterdaysOTP() throws InterruptedException {
        otpa.clickIndividualAirlinesYesterday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(5000);
        driver.navigate().back();
    }

    @Test(priority = 4)
    public void othersYesterdaysOTP() throws InterruptedException {
        otpa.clickOthersYesterday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPA OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(5000);

    }
}
