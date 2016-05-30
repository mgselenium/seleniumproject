package com.seleniumprojectjala.webtesting.page.home.com.seleniumprojectjala.webtesting.page.contents;

import com.seleniumprojectjala.webtesting.framework.util.AbstractBasePage;

/**
 * Created by Marcelo on 27/05/2016.
 */
public class MainContainer extends AbstractBasePage {

    public Header goToHeader() {
        return new Header();
    }

    public LeftPanel goToLeftPanel() { return new LeftPanel();}

}
