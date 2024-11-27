package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CRMAppreciationPage {

    // Constructor (to initialize the page)
    public CRMAppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[@class= 'feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[text()= 'Appreciation']")
    public WebElement appriciationButton;

    @FindBy(xpath = "//iframe[@class = 'bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable ='true']")
    public WebElement messageArea;

    @FindBy(css = "button[id= 'blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement specifyOnePersonWarningMessage;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement messageTitleNotSpecifiedWarningMessage;

    @FindBy(xpath = ("(//div[@class='feed-post-text-block-inner-inner'])[1]"))
    public WebElement lastMessage;

    @FindBy(css = ".feed-add-post-del-but")
    public WebElement allEmployeesButton;

    @FindBy(css = "button[id='blog-submit-button-cancel']")
    public WebElement cancelButton;





}
