package ProductObject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.AndroidActions;

import java.time.Duration;


public class ReportIssuesPage extends AndroidActions {

    AndroidDriver driver;
    String IssueTitle;

    public ReportIssuesPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Report Issues']")
    private WebElement reportIssuesEle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup")
    public WebElement addIssue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement categories;

//    @AndroidFindBy(xpath = "//android.widget.TextView[@text = ' Categories']")
//    private WebElement categoriesBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Issue Title']")
    private WebElement issueTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=' Location']")
    private WebElement location;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Location Details']")
    private WebElement locationDetails;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Issue Details']")
    private WebElement issueDetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Send  ']")
    private WebElement sendBtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement NewIssueTitle;

    public boolean checkReportIssues(){
        return reportIssuesEle.isDisplayed();
    }

    public void clickReportIssueBtn(){
        reportIssuesEle.click();
    }

    public void clickAddIssueBtn(){
        addIssue.click();
    }

    public WebElement getCategories(){
        return categories;
    }

    public void setIssueTitle(String title){
        this.IssueTitle = title;
        issueTitle.sendKeys(title);
    }

    public void setLocation(String text){
        location.click();
        driver.findElement(By.xpath("//android.widget.TextView[@text= '"+text+"']")).click();
    }

    public void setLocationDetails(String text){
        locationDetails.sendKeys(text);
    }

    public void setIssueDetails(String text){
        issueDetails.sendKeys(text);
    }

    public void clickSend(){
        sendBtn.click();
    }

    public void sendIssueAlert(){
//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeContains(driver
//                .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")),
//                "text" , "SEND ISSUE"));
        WebElement sendIssue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
        Assert.assertTrue(sendIssue.isDisplayed());
        driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();

//        WebDriverWait waitAgain =new WebDriverWait(driver, Duration.ofSeconds(5));
//        waitAgain.until(ExpectedConditions.attributeContains(driver
//                        .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")),
//                "text" , "ERROR"));
        WebElement errorAlert = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
        Assert.assertTrue(errorAlert.isDisplayed());
        driver.findElement(By.xpath("//android.widget.TextView[@text='OK']")).click();
    }

    public void save(){
        WebElement sendIssue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"));
        Assert.assertTrue(sendIssue.isDisplayed());
        driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
    }

    public void setCategory(String text) throws InterruptedException {
        categories.click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//android.widget.TextView[@text= '"+text+"']")).click();
    }

    public void checkNewIssueTitle(){
        Assert.assertEquals(NewIssueTitle.getText(), IssueTitle);
    }

    //        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeContains(driver
//                .findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));


}
