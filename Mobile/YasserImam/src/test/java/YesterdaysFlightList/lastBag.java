package YesterdaysFlightList;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lastBag extends BaseTest {

//1. Tap on last Bag option from the home screen.
// 2. Check if BAG KPI page is open
// 3. Tap on yesterday's count for All/individual terminal
// 4. Check if Flight List Screen is open w.r.t. selected time
    @Test(priority = 1)
    public void checkLastBagPage() throws InterruptedException {
        main.clickLastBag();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='BAG KPI']")).isDisplayed());
        Thread.sleep(5000);
    }

//1. Tap on last Bag option from the home screen.
// 2. Check if BAG KPI page is open
// 3. Tap on today's count for all/individual terminals
// 4. Verify the Label of the screen
// 5. Tap on yesterday's count for all/individual terminals
// 6. Verify the Label of the screen
    @Test(dependsOnMethods = "checkLastBagPage")
    public void checkAllTerminalsYesterday() throws InterruptedException {
        firstBag.clickAllTerminalsYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='BAG KPI - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(firstBag.getTitle(), "BAG KPI - YESTERDAY");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = "checkAllTerminalsYesterday")
    public void checkIndividualTerminalsYesterday() throws InterruptedException {
        firstBag.clickIndividualTerminalYesterday();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text='BAG KPI - YESTERDAY']")).isDisplayed());
        Thread.sleep(3000);
        Assert.assertEquals(firstBag.getTitle(), "BAG KPI - YESTERDAY");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }
}
