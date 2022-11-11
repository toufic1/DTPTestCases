package ReportIssues;

import AVBase.ReportIssuesPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_002_003 extends BaseTest {
    @Test
    public void Report_Issues_Test() throws InterruptedException {

        initialPage.login();
        firstPage.click_menu();
        // Navigate to Report Issues screen
        firstPage.click_report_Issues();
        ReportIssuesPage reportIssuesPage=new ReportIssuesPage(driver);
        //  Tap on +ADD button or select an existing issue.
        reportIssuesPage.click_plus();
        //  Check if new field 'Category' is available.
        reportIssuesPage.check_category_present(driver);


        // Tap on 'Category' field.
        reportIssuesPage.click_Categories();
        // Check the values available in 'Category' dropdown.
        reportIssuesPage.check_category_present(driver);


//        reportIssuesPage.click_plus();
//        reportIssuesPage.Fill_Fields(driver);

    }
}
