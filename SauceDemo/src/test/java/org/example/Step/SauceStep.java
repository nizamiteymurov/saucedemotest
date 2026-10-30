package org.example.Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Page.SaucePage;
import org.example.config.BaseMetods;
import org.example.config.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Map;

public class SauceStep extends BaseMetods {

    private String user;

    WebDriver driver = DriverManager.getDriver();
    SaucePage pg = new SaucePage(driver);




    @Given("Sauce sayta daxil olmaq")
    public void step1() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }

    @When("Username and password check")
    public void step2(Map<String, String> formData) throws InterruptedException {
        user = formData.get("First Username");

        clickbutton(SaucePage.username);
        Thread.sleep(2000);
        sendText3(formData.get("First Username"), SaucePage.username);
        Thread.sleep(2000);
        clickbutton(SaucePage.password);
        Thread.sleep(2000);
        sendText3(formData.get("Password"), SaucePage.password);
    }

    @Then("Yoxlama")
    public void step3() throws InterruptedException, AWTException {

        Thread.sleep(2000);
        clickbutton(SaucePage.button);
        Thread.sleep(2000);
        new Robot().keyPress(KeyEvent.VK_ENTER);
        String url = DriverManager.getDriver().getCurrentUrl();

        if (url.contains("inventory")) {
            System.out.println(user + " - qeydiyyatdan kecdi ✅");
        } else {
            System.out.println(user + " - qeydiyyatdan kecmedi ❌");
        }
//        Assert.assertTrue(
//                user + "- Login ugursuz oldu ...!",
//                url.contains("inventory")
//        );

    }
}