package com.seleniumprojectjala.webtesting;

import com.seleniumprojectjala.webtesting.page.home.HomePage;
import com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents.*;
import com.seleniumprojectjala.webtesting.page.login.LoginModalPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class TaskTest {
    private LoginModalPage loginModalPage;

    private MainContainer mainContainer;

    private LeftPanel leftPanel;
    private Header header;

    @BeforeClass
    public void setUp(){
        HomePage homePage = new HomePage();
        LoginModalPage loginModalPage = homePage.clickLoginLink();
        mainContainer = loginModalPage.loginAs("luis.marcelo.garay@hotmail.com", "Control123");
    }

    @BeforeMethod
    public void beforeMethod() {
        leftPanel = mainContainer.goToLeftPanel();
        header = mainContainer.goToHeader();
    }

    @Test
    public void testAddATaskUsingInboxPage() {
        String expectedTaskName = "New task 00001";
        HandleContent handleContent = leftPanel.clickInbox();
        handleContent.clickAddTask();
        handleContent.enterTaskName(expectedTaskName);
        handleContent.clickIconPriority(3);
        handleContent.clickAddTaskButton();
        handleContent = leftPanel.clickInbox();

        String actualTaskName = handleContent.getTaskName();

        assertEquals(expectedTaskName, actualTaskName);

        ConfirmDialog confirmDialog = handleContent.deleteLastTaskAdded();
        confirmDialog.clickOkButton();
    }

    @Test
    public void testAddAQuickTaskFromHeader(){
        String expectedTaskName = "Test Tast 1";
        FormTask formTask = header.clickPlusIcon();
        formTask.enterTaskName(expectedTaskName);
        formTask.selectProjectShopping();
        formTask.clickIconPriority(3);
        formTask.clickAddTaskButton();
        HandleContent handleContent = leftPanel.clickShopping();

        String actualTaskName = handleContent.getTaskName();

        assertEquals(expectedTaskName, actualTaskName);
        ConfirmDialog confirmDialog = handleContent.deleteLastTaskAdded();
        confirmDialog.clickOkButton();
    }
}
