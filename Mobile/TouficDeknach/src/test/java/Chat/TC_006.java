package Chat;

import AVBase.Chat_page;
import Base.BaseTest;
import org.testng.annotations.Test;

public class TC_006 extends BaseTest {
    @Test
    public void Chat_test() throws InterruptedException {
        //1. Login to Airport view 1.9 application as a user with chat activated
        initialPage.login();
        //2.Tap on main menu
        firstPage.click_menu();
        //3.Tap on chat
        firstPage.chat_click();
        Chat_page chat_page = new Chat_page(driver);
        //If the user doesn’t have any existing chat conversation, the screen should show “No Conversations yet, start
         // a new Conversation by clicking here”, and if the user clicks, he will be taken to the directory screen to select a conversation.
        chat_page.check_Text();
        //the page only load

    }}