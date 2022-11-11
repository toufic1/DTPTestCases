//package ExtentReporterNG;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import io.appium.java_client.AppiumDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class Listeners  implements ITestListener {
//    ExtentTest test;
//    AppiumDriver driver;
//    ExtentReports extent=ExtentReporter.getReporterObject();
//    @Override
//    public void onTestStart(ITestResult result) {//before start executing any test
//        //  ITestListener.super.onTestStart(result);
//        test=extent.createTest(result.getMethod().getMethodName());//the result paramter hold all the information sbout our test
//        //get the name of the test
//
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {//run if test successfully run
//        //ITestListener.super.onTestSuccess(result);
////        test.log(Status.PASS,"Test Pass");
////        try {
////            driver=(AppiumDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
////            //add screenshot to the report
////            test.addScreenCaptureFromPath(getScreenShot(result.getMethod().getMethodName(),driver),result.getMethod().getMethodName());
////        } catch (Exception e) {
////            throw new RuntimeException(e);
////        }
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {//when test fail it
//        // ITestListener.super.onTestFailure(result);
//        test.fail(result.getThrowable());//getThrowable to get the error message
//        //screenshot code when test failed
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        ITestListener.super.onTestSkipped(result);
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//    }
//
//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//        ITestListener.super.onTestFailedWithTimeout(result);
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//        ITestListener.super.onStart(context);
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//        //  ITestListener.super.onFinish(context);
//        extent.flush();
//    }
//}
