package Base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.util.logging.Level;

public class BaseTest{
    public WebDriver driver;
    String extentReportFile = System.getProperty("user.dir")+"\\SEO.html";
    String extentReportImage = System.getProperty("user.dir")+"\\extentReportImage.png";

    String chromeDriverPath = "C:\\Users\\krish.t\\Downloads\\chromedriver.exe";
    ExtentReports extent;
    ExtentTest SEOTest;

    //Logging preferences
    ChromeOptions caps = new ChromeOptions();


    LoggingPreferences logs = new LoggingPreferences();
    public BaseTest(String browser){
        System.out.println("called from: "+browser);
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        extent = new ExtentReports(extentReportFile, true);
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        logs.enable(LogType.PERFORMANCE, Level.ALL);
        logs.enable( LogType.PERFORMANCE, Level.ALL );

        //For Server
        //  caps.addArguments("--headless");
        // caps.addArguments("--no-sandbox");
        caps.setCapability("goog:loggingPrefs", logs );
        caps.setCapability(CapabilityType.LOGGING_PREFS, logs);
        System.out.println("Inside constructor");
        driver = new ChromeDriver(caps);
    }
}
