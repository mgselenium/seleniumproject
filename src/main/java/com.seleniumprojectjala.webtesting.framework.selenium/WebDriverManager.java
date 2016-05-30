package com.seleniumprojectjala.webtesting.framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class WebDriverManager {
    private static WebDriverManager instance;

    private WebDriver driver;

    private WebDriverWait wait;

    private WebDriverManager() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
    }

    public static WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
