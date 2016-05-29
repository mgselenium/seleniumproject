package com.seleniumprojectjala.webtesting.page.home;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import com.seleniumprojectjala.webtesting.page.login.LoginModalPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class HomePage extends AbstractBasePage {
    public static final String URL_TODOIST = "https://en.todoist.com/";

    @FindBy(className = "sel_login")
    private WebElement loginLink;

    public HomePage() {
        driver.get(URL_TODOIST);
    }

    public LoginModalPage clickLoginLink() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
        return new LoginModalPage();
    }
}
