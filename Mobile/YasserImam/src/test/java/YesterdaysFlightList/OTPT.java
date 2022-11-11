package YesterdaysFlightList;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OTPT extends BaseTest {

    @Test(priority = 1)
    public void checkOTPTPage() throws InterruptedException {
        main.OTPTClick();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL']")).isDisplayed());
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkOTPTPage")
    public void checkAllAirlinesYesterday() throws InterruptedException {
        otpt.clickFiveMinBtn();
        Thread.sleep(5000);
        otpt.clickAllAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkAllAirlinesYesterday")
    public void checkAllAirlinesToday() throws InterruptedException {
        otpt.clickAllAirlinesToday();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - TODAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void checkSpecificAirlinesYesterday() throws InterruptedException {
        otpt.clickSpecificAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkSpecificAirlinesYesterday")
    public void checkSpecificAirlinesToday() throws InterruptedException {
        otpt.clickSpecificAirlinesToday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - TODAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void checkOtherAirlinesYesterday() throws InterruptedException {
        otpt.clickOtherAirlinesYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - YESTERDAY");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "checkOtherAirlinesYesterday")
    public void checkOtherAirlinesToday() throws InterruptedException {
        otpt.clickOtherAirlinesToday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='OTPT OVERALL - TODAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(otpt.getTitle(), "OTPT OVERALL - TODAY");
        Thread.sleep(2000);
    }
}
