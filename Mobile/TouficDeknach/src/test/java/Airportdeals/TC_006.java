package Airportdeals;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_006 extends BaseTest {
    @Test
    public void Deals_Test() throws InterruptedException {
        initialPage.login();
        //Tap on application menu.
        firstPage.click_menu();
        //Tap on Deals.
        firstPage.Deals_click();
        //Verify if vendors card in the vendors list have the logo of the vendor.
        int VendorsCount =	driver.findElements(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/*")).size();
        int ImageCount=driver.findElements(By.className("android.widget.ImageView")).size();
        Assert.assertEquals(VendorsCount,ImageCount);
        //only three elements have a logo


    }




}

