package utils;
import com.aventstack.extentreports.ExtentReports;//Main class that generates the test report.
import com.aventstack.extentreports.reporter.ExtentSparkReporter;//Creates the HTML report file

public class ExtentReport {


    private static ExtentReports extent;//Represents the main report engine.

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter("reports/ExtentReport.html");

            extent = new ExtentReports();//Report Manager
            extent.attachReporter(reporter);//connects Report Engine -> HTML Reporter         
        }
        return extent;
    }

}
