package AVChangestoDrawerMenu;

import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest {
    @Test
    public void test() throws InterruptedException {
        initialPage.login();
        firstPage.click_menu();
        //'Reported Issue' shall be renamed as 'Report Issues'
        firstPage.check_reported_Issues_text();
    }
}
