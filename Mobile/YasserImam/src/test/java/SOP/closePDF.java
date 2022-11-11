package SOP;

import AVBase.BaseTest;
import org.testng.annotations.Test;

public class closePDF extends BaseTest {

//1. Navigate to 'Standard Procedure' Screen from menu.
//2. Check if Standard Procedures screen is opened
//3. Tap on Category and tap on any SOP option
//4. Check if 'Standard Procedure View' Screen is opened with PDF document
//5. Tap on close button from top right corner.
    @Test
    public void closePDFPage() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickInfo();
        Thread.sleep(3000);
        menuPage.clickStandardProcedure();
        Thread.sleep(3000);
        sop.checkSOPOpened();
        sop.clickCategory();
        Thread.sleep(2000);
        sop.checkPDFDocumentPage();
        sop.clickPDF();
        Thread.sleep(2000);
        sop.checkPDFPageTitle();
        Thread.sleep(2000);
        sop.close();
        Thread.sleep(2000);
        sop.checkPDFDocumentPage();
        Thread.sleep(2000);
    }
}
