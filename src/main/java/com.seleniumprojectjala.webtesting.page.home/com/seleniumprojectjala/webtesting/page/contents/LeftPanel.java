package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 29/05/2016.
 */
public class LeftPanel extends AbstractBasePage {

    @FindBy(id = "filter_inbox")
    private WebElement inbox;

    @FindBy(xpath = "//div[2]/div[2]/div[2]/div[2]/ul/li[1]/table/tbody/tr/td[3]/span")
    private WebElement personalMenu;

    @FindBy(xpath = "//div[2]/div[2]/div[2]/div[2]/ul/li[2]/table/tbody/tr/td[3]/span")
    private WebElement shoppingMenu;

    public HandleContent clickInbox() {
        wait.until(ExpectedConditions.elementToBeClickable(inbox));
        inbox.click();
        return new HandleContent();
    }

    public HandleContent clickShopping() {
        shoppingMenu.click();
        return new HandleContent();
    }
}
