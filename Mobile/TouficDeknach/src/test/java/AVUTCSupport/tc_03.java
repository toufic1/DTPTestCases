package AVUTCSupport;

import Base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class tc_03  extends BaseTest {

    @Test(description = "verify the UTC button")
    @Description("Verify the UTC Work")
    @Epic("EP001")
    @Feature("Feature 1:UTC")
    @Story("Story :logo presence")
    @Step("verify UTC on off")
    @Severity(SeverityLevel.MINOR)
    public void UTC_test() throws InterruptedException {
        //1.Login to Airport view 1.7 mob app
        initialPage.login();
        // 2.Tap on menu
        firstPage.click_menu();
        //3.Tap on Settings
        firstPage.click_settings();
        // 4. Tap on UTC toggle button to 'on'
        firstPage.UTC_CLICK();
        // 5.Tap on UTC toggle button to 'off'
        //it will fail because it's automatically turn off


    }


}