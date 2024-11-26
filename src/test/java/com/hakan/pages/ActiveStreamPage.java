package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActiveStreamPage {

    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text() ='Message']")
    public WebElement messageButton;

    @FindBy(xpath = "//span[text() ='Task']")
    public WebElement taskButton;

    @FindBy(xpath = "//span[text()='Event']")
    public WebElement eventButton;

    @FindBy(xpath = "//span[text() ='Poll']")
    public WebElement pollButton;

    @FindBy(xpath = "//span[text() ='More']")
    public WebElement moreButton;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span")
    //css= "div.feed-add-post-form-variants>span" // same locator
    public List<WebElement> allTopButtons;

    @FindBy(xpath = "//div[@class = 'menu-popup-items']/span")
    public List<WebElement> moreOptions;








}
