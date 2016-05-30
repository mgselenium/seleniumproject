package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 29/05/2016.
 */
public class ConfirmDialog extends AbstractBasePage {

    @FindBy(xpath = "//div[19]/div/div[2]/div/div/div/center/div/a[1]")
    private WebElement okButton;

    public void clickOkButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        okButton.click();
    }
}
