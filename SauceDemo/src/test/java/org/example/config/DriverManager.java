package org.example.config;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;


    public static WebDriver getDriver()
    {
        if (driver == null)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    @After
    public static void quitDriver()
    {
        if (driver != null)
        {
            driver.quit();

            driver = null;
        }
    }
}
