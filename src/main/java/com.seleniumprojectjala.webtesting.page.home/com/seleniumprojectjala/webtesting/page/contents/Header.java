package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 29/05/2016.
 */
public class Header extends AbstractBasePage {

    @FindBy(id = "icon_add_task")
    private WebElement plusIcon;

    public FormTask clickPlusIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(plusIcon));
        plusIcon.click();
        return new FormTask();
    }
}
