package com.seleniumprojectjala.webtesting.framework.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.seleniumprojectjala.webtesting.framework.selenium.WebDriverManager;

/**
 * Created by Marcelo on 27/05/2016.
 */
public abstract class AbstractBasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public AbstractBasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }
}
