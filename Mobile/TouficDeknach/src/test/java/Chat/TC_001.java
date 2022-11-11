package Chat;

import AVBase.Chat_page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest{
    @Test
    public void Chat_test() throws InterruptedException {
        //1. Login to Airport view 1.9 application as a user with chat activated
        initialPage.login();
        //2.Tap on main menu
        firstPage.click_menu();
        //3.Tap on chat
        firstPage.chat_click();
        Chat_page chat_page=new Chat_page(driver);
        //3.Tap on chat
        chat_page.verify_Chat_page();
        //3.Tap on Directory
        chat_page.Directory_button();
        //4.Tap on chat option from the bottom of the screen
        chat_page.click_Chat();
        chat_page.verify_Chat_page();
        //verify the screen
        chat_page.verify_Screen_element();
        chat_page.click_chat_icon();
        chat_page.verify_chat_ICON_ELEMENT();
        //Conversation list should have following options :
        //1.'Chat' shall be shown as heading
        //2.Chat and Directory tab at the bottom of the screen
        //3.The list of existing conversations
        //4.Filters (All, Users ,Groups, Public Groups, Unread )
        //5.Floating icon at the bottom of the screen with options New chat ,New group chat and Join public group
        //6.Search icon below the header
        //7. Main menu icon on the top left corner
    }
}















