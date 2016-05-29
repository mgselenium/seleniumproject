package com.seleniumprojectjala.webtesting.login;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import com.seleniumprojectjala.webtesting.home.MainContainer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class LoginModalPage extends AbstractBasePage {
    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(className = "submit > a")
    private WebElement loginButton;

    public void setEmailTextField(String username) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.clear();
        emailTextField.sendKeys(username);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public MainContainer clickLoginButtonToMainContainer() {
        clickLoginButton();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setEmailTextField(userName);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }
}
