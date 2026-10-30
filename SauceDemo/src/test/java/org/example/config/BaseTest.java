//package org.example.config;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import io.cucumber.java.*;
//import org.example.reports.ExtentManager;
//import org.example.reports.ScreenshootUtil;
//import org.openqa.selenium.WebDriver;
//
//import java.io.IOException;
//
//public class BaseTest {
//
//    public WebDriver driver;
//
//    public static ExtentReports extent;
//    public static ExtentTest scenarioTest;
//
//    @BeforeAll
//    public static void beforeAllMethod() throws IOException {
//        extent = ExtentManager.getInstance();
//    }
//
//    @Before
//    public void beforeEachScenario(Scenario scenario) {
//        driver = DriverManager.getDriver();
//        scenarioTest = extent.createTest(scenario.getName());
//    }
//
//    @AfterAll //@AfterAll — bütün testlər (və ya ssenarilər) bitəndən sonra yalnız 1 dəfə işləyir.
//    public static void afterSuite() {
//        //DriverManager.quitDriver();
//
//        extent.flush();
//        ExtentManager.renameReport("C:/Users/Nizami/Desktop/SauceDemo");
//    }
//
//    @After //@After (Cucumber) — hər ssenari (Scenario) bitəndən sonra 1 dəfə işləyir.
//    public void afterEachScenario(Scenario scenario) {
//
//
//        String screenshotPath = ScreenshootUtil.captureScreenshot(driver, scenario.getName());
//        scenarioTest.addScreenCaptureFromPath("screenshots/" + scenario.getName().replaceAll("[\\\\/:*?\"<>| ]", "_") + ".png");//sekili getirir reportsun icine
//
//
//        if (scenario.isFailed()) {
//            scenarioTest.log(Status.FAIL, "Scenario failed: " + scenario.getName());
//        } else {
//            scenarioTest.log(Status.PASS, "Scenario passed: " + scenario.getName());
//        }
//
//        try {
//            scenarioTest.addScreenCaptureFromPath(screenshotPath);
//        } catch (Exception e) {
//            scenarioTest.warning("Screenshot failed! " + e.getMessage());
//        }
//
//    }
//}
