package com.seleniumprojectjala.webtesting.page.login;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents.MainContainer;
import org.openqa.selenium.By;
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

    @FindBy(linkText = "Log in")
    private WebElement loginButton;

    @FindBy (className = "GB_frame")
    private WebElement iFrameLogin;

    @FindBy (id = "GB_frame")
    private WebElement iFrameLoginNode;

    private String parentWindowHandle;
    private String parentFirst;

    public LoginModalPage() {

        parentWindowHandle = driver.getWindowHandle();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("GB_frame")));
        try
        {
            driver.switchTo().frame(iFrameLogin);
            driver.switchTo().frame(iFrameLoginNode);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

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
        driver.switchTo().window(parentWindowHandle);
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setEmailTextField(userName);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }
}
