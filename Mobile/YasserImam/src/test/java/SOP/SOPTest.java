package SOP;

import AVBase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SOPTest extends BaseTest {

//1. Tap on SOP from Menu.
//2. Tap on Search
//3. Search with valid and invalid text in search textbox.
//4. Click on cancel button from search textbox
    @Test(priority = 1)
    public void checkSop() throws InterruptedException {
        menuPage.clickMenu();
        Thread.sleep(3000);
        menuPage.clickInfo();
        Thread.sleep(2000);
        menuPage.clickStandardProcedure();
        Thread.sleep(3000);
        sop.clickSearchBtn();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver
                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText")),
                "text" , "Search"));

        sop.searchBox("Category");
        Thread.sleep(3000);
        sop.result();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void checkRandom() throws InterruptedException {
        sop.searchBox("jwdhc");
        Thread.sleep(5000);
        sop.falseInput();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void checkInitial() throws InterruptedException {
        sop.backToNormal();
        Thread.sleep(3000);
    }
}
