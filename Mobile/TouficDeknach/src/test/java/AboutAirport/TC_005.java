package AboutAirport;

import Base.BaseTest;
import org.testng.annotations.Test;

import java.util.Base64;

public class TC_005 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        //1.Tap on slider menu
        initialPage.login();
        firstPage.click_menu();
        //2.Verify the DTP logo is not present
        firstPage.check_DTP_Logo_present(driver);

    }
}
