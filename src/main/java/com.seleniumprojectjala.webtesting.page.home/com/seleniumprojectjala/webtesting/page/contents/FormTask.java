package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 29/05/2016.
 */
public class FormTask extends HandleContent {

    @FindBy(xpath = "//div[14]/descendant::ul/li[2]/a[3]/img")
    private WebElement setPriority3;

    @FindBy(className = "select_project")
    private WebElement selectProject;

    @FindBy(xpath = "//div[19]/descendant::tr[2]/td/div/span")
    private WebElement personalOption;

    @FindBy(xpath = "//div[19]/descendant::tr[3]/td/div/span")
    private WebElement shoppingOption;

    public void clickIconPriority(int numberPriority){
        wait.until(ExpectedConditions.elementToBeClickable(priorityIcon));
        priorityIcon.click();

        if (numberPriority == 3)
        {
            setPriority3.click();
        }
    }

    public void selectProjectShopping() {
        wait.until(ExpectedConditions.elementToBeClickable(selectProject));
        selectProject.click();
        shoppingOption.click();
    }
}
