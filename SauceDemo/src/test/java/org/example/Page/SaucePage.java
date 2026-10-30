package org.example.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucePage {

    protected WebDriver driver;

    public SaucePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public static By username = By.id("user-name");
    public static By password = By.id("password");
    public static By button = By.id("login-button");
}
