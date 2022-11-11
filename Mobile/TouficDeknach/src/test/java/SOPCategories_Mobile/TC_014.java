package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_014 extends BaseTest {
    @Test
    public void SOPCategories() throws InterruptedException {

        initialPage.login();
        firstPage.click_menu();
        firstPage.Information_click();
        //1. Navigate to 'Standard Procedure' Screen from menu.
        firstPage.Standard_operation_click();
        StandardOperationPage standardOperationPage = new StandardOperationPage(driver);
        //2. Check if Standard Procedures screen is opened
        standardOperationPage.check_Page_isOpened(driver);
        //3. Tap on Category and tap on any SOP option
        standardOperationPage.firstCategory_click();
        standardOperationPage.check_Category1_page(driver);
        //4. Tap on close button from top right corner.
        standardOperationPage.click_cross_Button_C1();
        //Close button should close 'Standard Procedure'
        // with SOP list and Screen and should return to 'Standard Procedure' with Category  list
        standardOperationPage.check_Page_isOpened(driver);
    }
}