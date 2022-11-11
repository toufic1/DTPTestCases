package listenerPackage;

import AVBase.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener {

//    AppiumDriver driver;
//    ExtentTest test;
//    ExtentReports extent = ExtentReporterNG.getReporterOption();

//    private static String getTestMethodName(ITestResult iTestResult){
//        return iTestResult.getMethod().getConstructorOrMethod().getName();
//    }
//
//    @Attachment
//    public byte[] saveFailureScreenshots(AppiumDriver driver){
//        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//    }
//
//    @Attachment(value = "{0}", type = "text/plain")
//    public static String saveTextLog(String message){
//        return message;
//    }

    @Override
    public void onTestStart(ITestResult result){
        //test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
//        System.out.println("I am in onStart method" + iTestContext.getName());
//        iTestContext.setAttribute("AndroidDriver", BaseTest.getDriver());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

//        test.fail(result.getThrowable());
//
//        try {
//            driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
//                    .get(result.getInstance());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Object testClass = result.getInstance();
//        AndroidDriver driver = BaseTest.getDriver();
//
//        if(driver instanceof AndroidDriver){
//            System.out.println("ScreenShot of: " + getTestMethodName(result));
//            saveFailureScreenshots(driver);
//        }
//        saveTextLog(getTestMethodName(result)+ " ScreenShot Taken");

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onFinish(ITestContext context) {
        //extent.flush();
    }

}
