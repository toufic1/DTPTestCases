package ReportIssues;

import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest {
    @Test
    public void reportIssue_Test() throws InterruptedException {
        //1. Login to tNexus mobile application.
        initialPage.login();
        // 2. Tap on application menu.
        firstPage.click_menu();
        // 3. Verify if Report Issues module is available in home page.
        firstPage.check_reported_Issues_text();
    }

}
