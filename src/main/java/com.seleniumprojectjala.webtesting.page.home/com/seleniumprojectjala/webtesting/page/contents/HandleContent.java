package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marcelo on 29/05/2016.
 */
public class HandleContent extends AbstractBasePage {

    @FindBy(linkText = "Add Task")
    private WebElement addTask;

    @FindBy(css = ".richtext_editor")
    private WebElement emptyTextField;

    @FindBy(css = ".td_submit > a.submit_btn")
    private WebElement addTaskButton;

    @FindBy(css = ".form_icon_holder > img.cmp_priority4")
    protected WebElement priorityIcon;

    @FindBy(xpath = "//div[13]/descendant::ul/li[2]/a[3]/img")
    private WebElement setPriority3;

    @FindBy(xpath = "//ul[@class='items']/li[last()]/descendant::tr/td[2]/span")
    private WebElement nameLastTaskAdded;

    @FindBy(xpath = "//ul[@class='items']/li[last()]/descendant::tr/td[3]/div")
    private WebElement enableOptionTask;

    @FindBy(xpath = "//div[12]/descendant::tr[14]/td/div/span")
    private WebElement deleteTaskOption;

    public void clickAddTask() {
        wait.until(ExpectedConditions.elementToBeClickable(addTask));
        addTask.click();
    }

    public void enterTaskName(String taskName){
        emptyTextField.clear();
        emptyTextField.sendKeys(taskName);
    }

    public void clickAddTaskButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addTaskButton));
        addTaskButton.click();
    }

    public void clickIconPriority(int numberPriority){
        wait.until(ExpectedConditions.elementToBeClickable(priorityIcon));
        priorityIcon.click();

        if (numberPriority == 3)
        {
            setPriority3.click();
        }
    }

    public String getTaskName() {
        return nameLastTaskAdded.getText();
    }

    public ConfirmDialog deleteLastTaskAdded() {
        Actions actions = new Actions(driver);
        actions.moveToElement(nameLastTaskAdded).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(enableOptionTask));
        enableOptionTask.click();

        wait.until(ExpectedConditions.elementToBeClickable(deleteTaskOption));
        deleteTaskOption.click();

        return new ConfirmDialog();
    }
}
