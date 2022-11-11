package SOP;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkPDF extends BaseTest {

//1. Tap on menu icon on top left side of the application.
//2. Tap on 'Standard Procedure' option from the menu.
//3.Tap on any category
//4. Tap on SOP
//5. Check if PDF is opened
    @Test
    public void checkPDFTest() throws InterruptedException {
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
        sop.pdfDisplayed();
        sop.clickNextPage();
        Thread.sleep(5000);
        sop.checkPreviousArrowDisplayed();
        sop.backToPreviousPage();
        Thread.sleep(5000);
    }

//1.  Navigate to 'Standard Procedure' Screen from menu.
//3. Check if Standard Procedures screen is opened
//4. Tap on category and tap on any SOP
//5. Check if 'Standard Procedure View' Screen is opened with PDF file
//6. Check the information on displayed screen
    @Test(dependsOnMethods = "checkPDFTest")
    public void checkPageNumber() throws InterruptedException {
        int currentPage = sop.firstPageNumber();
        Thread.sleep(1000);
        sop.clickNextPage();
        Thread.sleep(5000);
        if(sop.secondPageNumber() == currentPage+1){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

//1.  Navigate to 'Standard Procedure' Screen from menu.
//3. Check if Standard Procedures screen is opened
//4. Tap on any category and tap on SOP
//5. Check if 'Standard Procedure' Screen is opened with PDF document
//6. Check if first page is displayed on the Screen
//7. Tap on next arrow first and then tap on left arrow
//8. Check if previous page is displayed on the screen and page number is changed accordingly
    @Test(dependsOnMethods = "checkPageNumber")
    public void checkPrevious() throws InterruptedException {
        int currentPage = sop.secondPageNumber();
        Thread.sleep(1000);
        sop.backToPreviousPage();
        Thread.sleep(5000);
        if(sop.firstPageNumber() == currentPage-1){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

//1. Navigate to 'Standard Procedure' Screen from menu.
//3. Check if Standard Procedures screen is opened
//4. Tap on any category and tap on any SOP option
//5. Check if 'Standard Procedure' Screen is opened with PDF document
//6. Check if first page is displayed on the Screen
//7. Tap on right arrow for the first time
//8. Check if home icon appeared beside the page number
    @Test(dependsOnMethods = "checkPrevious")
    public void checkHomeIcon() throws InterruptedException {
        sop.clickNextPage();
        Thread.sleep(2000);
        sop.checkIcon();
        Thread.sleep(2000);
    }
}
