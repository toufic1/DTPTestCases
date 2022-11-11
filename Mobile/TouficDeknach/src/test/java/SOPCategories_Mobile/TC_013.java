package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_013 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        //1. Login to Airport view application.
        initialPage.login();
        //2. Tap on menu icon on top left side of the application
        firstPage.click_menu();
        //3. Tap on 'Standard Procedure' option from the menu.
        firstPage.Information_click();
        firstPage.Standard_operation_click();
        //1. Search result should be displayed w.r.t to search text.
        //2. No result should shown for incorrect text.
        //3. Cancel button should clear search text in search text box and  screen should show all Categories.
        StandardOperationPage standardOperationPage=new StandardOperationPage(driver);
        standardOperationPage.click_search();
        standardOperationPage.search();
        standardOperationPage.click_Cancel(driver);
    }
}
