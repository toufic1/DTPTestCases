package AllureListener;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.BaseTestMethod;

public class AllureListener implements ITestListener {
   private static String getTestMethodName(ITestResult iTestResult)
   {
       return iTestResult.getMethod().getConstructorOrMethod().getName();
   }
   @Attachment
    public byte[] saveFailureScreenShot(WebDriver webDriver)
   {
       return ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
   }

   @Attachment(value = "{0}",type = "text/plain")
    public static String saveTextLog(String message)
   {
       return message;
   }

    public void onTestStart(ITestResult result) {
        System.out.println("I am start a method"+result.getName());
        result.setAttribute("AndroidDriver", BaseTest.getDriver());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("sucess"+getTestMethodName(result));
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("failure"+getTestMethodName(result));

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        System.out.println("I am start a method"+context.getName());
    }
}
