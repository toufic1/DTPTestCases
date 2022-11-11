package SOP;

import AVBase.BaseTest;
import org.testng.annotations.Test;

public class closeCategory extends BaseTest {

//1. Navigate to 'Standard Procedure' Screen from menu.
//2. Check if Standard Procedures screen is opened
//3. Tap on Caetgory
//4. Tap on close button from top right corner.
    @Test
    public void checkSOPCloses() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(2000);
        menuPage.clickInfo();
        Thread.sleep(2000);
        menuPage.clickStandardProcedure();
        Thread.sleep(2000);
        sop.checkSOPOpened();
        sop.clickCategory();
        Thread.sleep(2000);
        sop.checkPDFDocumentPage();
        sop.clickPDF();
        Thread.sleep(2000);
        sop.checkPDFPageTitle();


    }
}
