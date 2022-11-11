package ReportIssues;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SuccessfulIssue extends BaseTest {

// 1. Navigate to Report Issues screen.
// 2. Tap on +Add.
// 3. Enter all the mandatory field values.
// 4. Tap on Save.
// 5. Check if issue is saved.
    @Test
    public void saveIssue() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(5000);
        report.clickReportIssueBtn();
        Thread.sleep(3000);
        report.clickAddIssueBtn();
        Thread.sleep(3000);
        report.setIssueTitle("sfjbvisjf");
        Thread.sleep(3000);
        report.setCategory("Iii");
        Thread.sleep(5000);
        report.setLocation("Gate 33");
        //driver.hideKeyboard();
        Thread.sleep(3000);
        report.setLocationDetails("ojsfn");
        //driver.hideKeyboard();
        report.setIssueDetails("lkdfnb");
        report.clickSend();
        Thread.sleep(3000);
        report.save();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = "saveIssue")
    public void AssertSaved(){
        report.checkNewIssueTitle();
    }
}
