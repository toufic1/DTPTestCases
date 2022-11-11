package ReportIssues;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportIssuesTest extends BaseTest {

//1. Login to tNexus mobile application.
// 2. Tap on application menu.
// 3. Verify if Report Issues module is available in home page.
    @Test
    public void checkExistence() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(5000);
        Assert.assertTrue(report.checkReportIssues());
        Thread.sleep(3000);
    }

// 1. Navigate to Report Issues screen.
// 2. Tap on +ADD button or select an existing issue.
// 3. Tap on 'Category' field.
// 4. Check if new field 'Category' is available.
    @Test(dependsOnMethods = "checkExistence")
    public void checkCategory() throws InterruptedException {
        report.clickReportIssueBtn();
        Thread.sleep(2000);
        report.clickAddIssueBtn();
        Thread.sleep(3000);
        Assert.assertEquals(report.getCategories().getText().trim(), "Categories");
        Thread.sleep(3000);
    }

// 1. Navigate to Category screen.
// 2. Tap on +ADD button.
// 3. Leave 'Category' field as blank.
// 5. Enter info for other mandatory fields.
// 6. Tap on Save button.
    @Test(dependsOnMethods = "checkCategory")
    public void checkCategoryEffect() throws InterruptedException {
        report.setIssueTitle("Block");
        report.setLocation("Dutty Free");
        Thread.sleep(3000);
        report.setLocationDetails("lhsdbvlks");
        driver.hideKeyboard();
        report.setIssueDetails("lsjdbvkjsdv");
        driver.hideKeyboard();
        report.clickSend();
        Thread.sleep(3000);
        report.sendIssueAlert();
        Thread.sleep(3000);
    }


}
