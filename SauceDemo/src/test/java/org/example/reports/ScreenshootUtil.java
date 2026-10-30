//package org.example.reports;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//public class ScreenshootUtil {
//
//    public static String captureScreenshot(WebDriver driver, String scenarioName) {
//
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//
//        String fileName = scenarioName.replaceAll("[\\\\/:*?\"<>| ]", "_");
//
//        String screenShotPath = System.getProperty("user.dir") + "/reports/screenshots/" + fileName + ".png";
//
//        try {
//            Files.createDirectories(Paths.get(System.getProperty("user.dir"), "reports", "screenshots"));
////            Files.copy(src.toPath(), Paths.get(screenShotPath));
//            Files.copy(
//                    src.toPath(),
//                    Paths.get(screenShotPath),
//                    StandardCopyOption.REPLACE_EXISTING
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return screenShotPath;
//    }
//}
//
//
//
