package ExtentReporterNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter{
    public  static ExtentReports extentReports;
    public static ExtentReports getReporterObject(){
        String path=System.getProperty("user.dir")+"//report//index.html";//where i want to store the reports
        ExtentSparkReporter reporter=new ExtentSparkReporter(path);//responsible for creating the report
        reporter.config().setReportName("AV's report");//to give name to the report;
        reporter.config().setDocumentTitle("Test Results");

        extentReports=new ExtentReports();//responsible to drive all reporting execution
        extentReports.attachReporter(reporter);//attach report
        extentReports.setSystemInfo("Tester","Toufic");
        return extentReports;
    }
}