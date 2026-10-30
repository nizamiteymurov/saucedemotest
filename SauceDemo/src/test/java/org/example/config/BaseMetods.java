package org.example.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseMetods {

    public  WebDriver driver;

    public BaseMetods() {
        this.driver = DriverManager.getDriver();
    }

    public void clickbutton(By button) {
        driver.findElement(button).click();
    }

    public void text(String tekst, By klik) {
        driver.findElement(klik).sendKeys(tekst);
    }
    public  void sendText3(String text, By el)
    {
        driver.findElement(el).sendKeys(text);
    }
}
