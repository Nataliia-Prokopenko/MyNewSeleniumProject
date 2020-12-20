package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeMessagePage extends BasePage{
    @FindBy(xpath = "//textarea[@id='to']")
    private WebElement inputTo;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputSubject;

    @FindBy(xpath = "//textarea[@id='text']")
    private WebElement inputBody;

    @FindBy(xpath = "//input[@name='send']")
    private WebElement btSubmitEMail;

    @FindBy(xpath = "//ul[@class='list_underlined']/li[1]")
    private WebElement btCurrentNewMails;

    public void makeMessage(String recipient, String subject, String body) {
        inputTo.clear();
        inputTo.sendKeys(recipient);
        inputSubject.clear();
        inputSubject.sendKeys(subject);
        inputBody.clear();
        inputBody.sendKeys(body);
        btSubmitEMail.click();
        btCurrentNewMails.click();
    }
}
