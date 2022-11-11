package AboutAirport;

import AVBase.AboutAirportPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_004  extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        //1.Tap on slider menu
        initialPage.login();
        firstPage.click_menu();
        //2.Verify the client logo is present
        firstPage.logo_isPresent();
    }}
