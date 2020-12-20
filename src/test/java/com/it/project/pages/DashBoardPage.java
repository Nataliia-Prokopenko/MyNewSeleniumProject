package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbEmail;

    @FindBy(xpath = "//p[@class='make_message']")
    private WebElement btMakeMessage;

    @FindBy(xpath = "//span[@class='sbj']")
    private WebElement lbSubject;

    public String getLbEmail() {
        return lbEmail.getText();
    }

    public String getSubject() {
        return lbSubject.getText();
    }

    public void makeMessage() {
        btMakeMessage.click();
    }

}
