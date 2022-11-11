package SOPCategories_Mobile;

import AVBase.StandardOperationPage;
import Base.BaseTest;
import org.testng.annotations.Test;

import java.util.Base64;

public class TC_0013 extends BaseTest {
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
        //3. Tap on Category and tap on any SOP option
        standardOperationPage.firstCategory_click();
        standardOperationPage.pdf_click();
        //4. Check if 'Standard Procedure View' Screen is opened with PDF document
        standardOperationPage.check_pdf_View_open();
        //5. Tap on close button from top right corner.
        standardOperationPage.cross_Button_click();
        //Close button should close 'Standard Procedure' with PDF and Screen and should return to 'Standard Procedure' with SOP list
        standardOperationPage.check_Category1_page(driver);
}}
