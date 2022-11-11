package AV_UTC_Support;

import AVBase.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners({listenerPackage.Listeners.class})
public class AV_UTC_Support extends BaseTest {


//  1.Login to Airport view 1.7 mob app
//  2.Tap on menu
//  3.Tap on Settings
//  4.Verify the toggle button 'UTC'
    @Test
    @Description("Verify UTC is Present")
    @Epic("EP000")
    @Feature("Button Check")
    @Story("Button Present")
    @Step("Verify Presence")
    @Severity(SeverityLevel.BLOCKER)
    public void UTCExists() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(5000);
        menuPage.clickSettings();
        Thread.sleep(2000);
        menuPage.scrollToText("UTC");
        Assert.assertTrue(menuPage.switchDisplayed());
    }

//  1.Verify the default mode of toggle button 'UTC'
    @Test(dependsOnMethods = "UTCExists")
    @Description("Verify UTC is Off")
    @Epic("EP001")
    @Feature("Button Check")
    @Story("Button Status")
    @Step("Verify Status")
    @Severity(SeverityLevel.MINOR)
    public void UTCisOff(){
        Assert.assertTrue(menuPage.switchCheckOff());
    }

//  1. Tap on UTC toggle button to 'on'
//  2.Tap on UTC toggle button to 'off'
    @Test(dependsOnMethods = "UTCisOff")
    @Description("Verify UTC is Clicked")
    @Epic("EP002")
    @Feature("Button Check")
    @Story("Button Clicked")
    @Step("Verify Clicked")
    @Severity(SeverityLevel.CRITICAL)
    public void UTCClick() throws InterruptedException {
        menuPage.clickSwitch();
        Thread.sleep(3000);
        Assert.assertFalse(menuPage.switchCheckOff());
        menuPage.clickSwitch();
        Thread.sleep(3000);
        Assert.assertTrue(menuPage.switchCheckOff());

    }

}
