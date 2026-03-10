package utils;

import org.openqa.selenium.*;//gives access to:WebDriver,TakesScreenshot,OutputType
import java.io.File;//to create a file object where the screenshot will be stored
import org.apache.commons.io.FileUtils;//to copy screenshot file safely

public class ScreenshotUtil {
    public static String captureScreenshot(WebDriver driver, String testName) {
        try {
        	//Selenium does not take screenshot by default
        	//TakesScreenshot is an interface
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            //Cast driver → TakesScreenshot
            //Capture current browser screen
            //Store it temporarily in memory (src)
            String path = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
            FileUtils.copyFile(src, new File(path));
            return path;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}