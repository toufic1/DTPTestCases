package chat_enhancements;

import AVBase.EventsPage;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest{
    @Test
    public void Event_Share() throws InterruptedException {
        //1.Login to Airport view 2.1
        initialPage.login();
        //2.Tap on Menu
        firstPage.click_menu();
        //3.Tap on event
        firstPage.events_click();
        EventsPage eventsPage=new EventsPage(driver);
        eventsPage.add_event();
        eventsPage.Enter_Info();
        eventsPage.save();
        //4.Tap on event share icon
        //        //5.Select any individual chat or group chat from list of
        //        //6.Tap on send
    }
}