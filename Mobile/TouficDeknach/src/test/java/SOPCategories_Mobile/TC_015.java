package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_015 extends BaseTest {
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
        //3. Tap on close button from top right corner.
        standardOperationPage.cross_button_List_click();
        // Close button should close 'Standard Procedure' Screen and should return to 'Home' screen
        standardOperationPage.check_Home_page(driver);
    }
}
