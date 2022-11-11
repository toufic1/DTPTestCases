package AV_Runaway;

import AVBase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsScreenEnhancements extends BaseTest {

    @Test(priority = 1)
    public void checkDetails() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        contacts.clickInfoBtn();
        Thread.sleep(5000);
        contacts.clickContactsBtn();
        Thread.sleep(10000);
        Assert.assertFalse(contacts.checkContactDetails());
    }

    @Test (priority = 2)
    public void checkMail() throws InterruptedException {
        Thread.sleep(3000);
        String mail = contacts.getEmail();
        contacts.clickMail();
        Assert.assertTrue(contacts.SendTo().contains(mail));
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test (priority = 3)
    public void checkPhone() throws InterruptedException {
        Thread.sleep(5000);
        String phone = contacts.clickphoneNo();
        Assert.assertEquals(phone, contacts.getAppNo());
    }
}
