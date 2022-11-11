package ReportIssues;

import AVBase.ReportIssuesPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_004 extends BaseTest {
    @Test
    public void Report_Issues_Test() throws InterruptedException {

        initialPage.login();
        firstPage.click_menu();
        // Navigate to Report Issues screen
        firstPage.click_report_Issues();
        ReportIssuesPage reportIssuesPage=new ReportIssuesPage(driver);
       //2. Tap on +Add.
        reportIssuesPage.click_plus();
        // 3. Enter all the mandatory field values.
        // 4. Tap on Save.
        //User should not be able to save Category data without entering 'Category'.
        reportIssuesPage.Fill_Fields_save_check(driver);

    }
}
