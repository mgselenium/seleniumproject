package com.seleniumprojectjala.webtesting;

import com.seleniumprojectjala.webtesting.page.home.HomePage;
import com.seleniumprojectjala.webtesting.page.home.MainContainer;
import com.seleniumprojectjala.webtesting.page.login.LoginModalPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class TaskTest {
    private LoginModalPage loginModalPage;

    private MainContainer mainContainer;

    @BeforeClass
    public void setUp(){
        HomePage homePage = new HomePage();
        LoginModalPage loginModalPage = homePage.clickLoginLink();
        mainContainer = loginModalPage.loginAs("luis.marcelo.garay@hotmail.com", "Control123");
    }

    @Test
    public void testCreateCampaign() {
        String expectedCampaignName = "New Campaign 00001";

    }
}
