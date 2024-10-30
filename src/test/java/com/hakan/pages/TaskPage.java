package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage extends BasePage {

    @FindBy(xpath = "//span[@class ='logo-color']")
    public WebElement logo24;

    @FindBy (xpath = "//span[text() ='Task']")
    public WebElement taskButton;

    @FindBy(css = "input[data-bx-id='task-edit-title']")
    public WebElement thingToDoArea;

    @FindBy(xpath = "//body[contains(@style, 'min-height:')]")
    public WebElement taskBodyArea;

    @FindBy(css = "button[id = 'blog-submit-button-save']")
    public WebElement sendButton;

    /*

    @FindBy(xpath = "(//span[@class='feed-task-info-text-cont'])[1]")
    public WebElement taskOnActiveStreamPage;

    */

    @FindBy(css = "button[id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(css = "span.feed-add-post-micro-title" )
    public WebElement taskMessageAreaCollapsed;

    @FindBy(xpath ="(//iframe[@class = 'bx-editor-iframe'])[2]")
    public WebElement iframeElement;


    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
