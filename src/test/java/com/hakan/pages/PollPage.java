package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {

    @FindBy(xpath = "//span[text() ='Poll']")
    public WebElement taskButton;

    @FindBy(css = "span[title = 'Topic']")
    public WebElement bottomTopicButton;

    @FindBy(id = "POST_TITLE")
    public WebElement aboveTopicButton;

    @FindBy(css = "iframe.bx-editor-iframe")
    public WebElement iframe;

    @FindBy(css = "body[contenteditable ='true'] ")
    public WebElement iframeMessageBody;

    @FindBy(css = "span[title~='Quote']") // ~ mean is to consist part of the text inside the value
    public WebElement quoteText;

    @FindBy(css = "blockquote.bxhtmled-quote")
    public WebElement addQuote;

    @FindBy(id = "input[id ='question_0']")
    public WebElement question0;

    @FindBy(css = "ol.vote-answers")
    public WebElement allAnswers;

    // arraylist can be created in there

    @FindBy(css = "a.vote-new-question-link.addq")
    public WebElement addQuestion;

    @FindBy(css= "button#blog-submit-button-save" )
    public WebElement sendButtonPoll;

    @FindBy(xpath = "(//div[@class ='feed-post-block feed-post-block-short feed-post-block-separator'])[1]" )
    public WebElement verifyPollOnTheActiveStream;

    @FindBy(css= "button#blog-submit-button-cancel" )
    public WebElement cancelButtonPoll;





































    public PollPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
