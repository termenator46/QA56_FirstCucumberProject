package com.ilcarro.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Basepage {
    public static WebDriver driver;
    public static JavascriptExecutor js;

    public Basepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;

    }

    public void launchBrowser() {
        System.err.close();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void openURL() {
        driver.get("https://ilcarro.web.app");
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public boolean isContainsText(String text, WebElement element) {
        return element.getText().contains(text);
    }

    public boolean isElementVisible(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException exception) {
            exception.getMessage();
            return false;
        }

    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void quiteBrowser() {
        driver.quit();
    }
    public void scrollWithJs(int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");

    }

    public void clickWithJs(WebElement element, int x, int y) {
        scrollWithJs(x, y);
        click(element);
    }
}
