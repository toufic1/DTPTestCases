package YesterdaysFlightList;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OTPD extends BaseTest {

    @Test(priority = 1)
    public void checkOTPDPage() throws InterruptedException {
        main.OTPDClick();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL']")).isDisplayed());
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkOTPDPage")
    public void checkAllAirlinesYesterday() throws InterruptedException {
        otpd.clickFiveMinBtn();
        Thread.sleep(5000);
        otpd.clickAllAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkAllAirlinesYesterday")
    public void checkAllAirlinesToday() throws InterruptedException {
        otpd.clickAllAirlinesToday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - TODAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void checkSpecificAirlinesYesterday() throws InterruptedException {
        otpd.clickSpecificAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkSpecificAirlinesYesterday")
    public void checkSpecificAirlinesToday() throws InterruptedException {
        otpd.clickSpecificAirlinesToday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - TODAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void checkOtherAirlinesYesterday() throws InterruptedException {
        otpd.clickOtherAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkOtherAirlinesYesterday")
    public void checkOtherAirlinesToday() throws InterruptedException {
        otpd.clickOtherAirlinesToday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPD OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpd.getTitle(), "OTPD OVERALL - TODAY");
        Thread.sleep(2000);
    }
}
