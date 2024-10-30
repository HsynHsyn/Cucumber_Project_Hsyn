package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage {

    @FindBy(xpath = "//span[text() ='Poll']")
    public WebElement pollButton;

    @FindBy(css = "span[title = 'Topic']")
    public WebElement bottomTopicButton;

    @FindBy(id = "POST_TITLE")
    public WebElement aboveTopicButton;

//    @FindBy(css = "iframe.bx-editor-iframe")
//    public WebElement iframe;

    @FindBy(xpath ="(//iframe[@class = 'bx-editor-iframe'])")
    public WebElement iframe;

    @FindBy(css = "body[contenteditable ='true'] ")
    public WebElement iframeMessageBody;

    @FindBy(xpath = "(//span[@data-bx-action='quote'])[1]") // ~ mean is to consist part of the text inside the value
    public WebElement quoteButton;

    @FindBy(xpath = "(//span[@title='Upload files'])[1]") // ~ mean is to consist part of the text inside the value
    public WebElement uploadFilesButton;

//    @FindBy(xpath = "//span[text()='Drag files here to upload']") // ~ mean is to consist part of the text inside the value
//    public WebElement uploadFilesButton;

    @FindBy(name = "bxu_files[]")
    public WebElement pickFile;

    @FindBy(css = "blockquote.bxhtmled-quote")
    public WebElement addQuote;

    @FindBy(id = "question_0")
    public WebElement question0;

//    @FindBy(css = "ol.vote-answers")
//    public WebElement allAnswers;

    @FindBy(css = "[class = 'vote-block-inp adda']")
    public List<WebElement> allAnswers;



    // arraylist can be created in there

    @FindBy(css = "a.vote-new-question-link.addq")
    public WebElement addQuestion;

    @FindBy(css= "button#blog-submit-button-save" )
    public WebElement sendButtonPoll;

    @FindBy(xpath = "(//div[@class ='feed-post-block feed-post-block-short feed-post-block-separator'])[1]" )
    public WebElement verifyPollOnTheActiveStream;

    @FindBy(css= "button#blog-submit-button-cancel" )
    public WebElement cancelButtonPoll;

    @FindBy(css = "span.feed-add-post-micro-title" )
    public WebElement pollMessageAreaCollapsed;







































    public PollPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
