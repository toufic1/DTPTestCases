package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_012 extends BaseTest {
    @Test
    public void SOPCategories() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        firstPage.Information_click();
        //1. Navigate to 'Standard Procedure' Screen from menu.
        firstPage.Standard_operation_click();
        StandardOperationPage standardOperationPage=new StandardOperationPage(driver);
        //2. Check if Standard Procedures screen is opened
        standardOperationPage.check_Page_isOpened(driver);
        //3. Tap on menu button from top left corner.
        standardOperationPage.click_Menu();
        //On tapping Menu icon from the 'Standard Procedure' Screen, Menu list should be open.
        standardOperationPage.check_Menu_isOpened();
    }
}
