package AlertsAck;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdatesTest extends BaseTest {

    @Test
    public void checkACK() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickSendUpdates();
        Thread.sleep(5000);
        Assert.assertTrue(update.ACKLabelExists());
        Thread.sleep(1000);
        Assert.assertTrue(update.ACKSwitchExists());
}
}
