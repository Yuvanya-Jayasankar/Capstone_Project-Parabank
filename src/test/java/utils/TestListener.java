package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.MediaEntityBuilder;

import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentReport.getReport();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = BaseTest.getDriver();

        String testName = result.getName();

        // Capture Screenshot
        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, testName);

        try {

            test.fail(result.getThrowable(),
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(result.getMethod().getRetryAnalyzer(result) == null) {
            result.getMethod().setRetryAnalyzerClass(RetryAnalyzer.class);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}