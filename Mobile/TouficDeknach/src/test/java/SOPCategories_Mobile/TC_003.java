package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        //1. Login to Airport view application.
        initialPage.login();
        //2. Tap on menu icon on top left side of the application
        firstPage.click_menu();
        //3. Tap on 'Standard Procedure' option from the menu.
        firstPage.Information_click();
        firstPage.Standard_operation_click();
        StandardOperationPage standardOperationPage=new StandardOperationPage(driver);
        //On tapping 'Standard Procedure' option from menu,
        // 'Standard Procedure's screen should be open and should show following options
        //1. 'Standard Procedure's label with menu on top left and cancel button on top right corner of the header
            standardOperationPage.Title_isDisplay(driver);
        //2.Search box
        standardOperationPage.search_isDisplay();

        //1.when user clicks on Category
        //the screen should display all the SOP with description  added to that category
        //2.The screen should have option to go back to the category list
        standardOperationPage.firstCategory_click();
        standardOperationPage.check_description();
        standardOperationPage.check_crossButton();

        //1. 'Standard Procedures' screen should be opened
        //2. On tapping SOP option, PDF file on 'Standard Procedure ' screen should be opened in user's screen
        standardOperationPage.pdf_click();
        standardOperationPage.check_pdf_View_open();




    }
}
