package com.hakan.pages;


import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public class CRMAppreciationPage {

    // Constructor (to initialize the page)
    public CRMAppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        //setupUsers();
    }

    //WebElements



    @FindBy(xpath = "//span[@class ='logo-color']")
    public WebElement logo24;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profilePhoto;

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

    @FindBy(xpath = "(//span[contains(@data-role, 'item-text')])[6]")
    public WebElement calender;

    @FindBy(xpath = "//button[@class = 'ui-btn-main']")
    public WebElement addButton;

    @FindBy(css=("input[placeholder= 'Event name']"))
    public WebElement newEventArea;

    @FindBy(css=("input[value= 'Y']"))
    public WebElement allDayRadio;

    @FindBy(name="EVENT_RRULE[FREQ]")
    public WebElement repeatSection;

    @FindBy(name="EVENT_RRULE[INTERVAL]")
    public WebElement everySection;

    @FindBy(name="lo_cation")
    public WebElement locationSection;





    @FindBy(xpath = "(//input[@class='calendar-field-checkbox'])[3]")
    public WebElement dateSectionRadioButton;

    @FindBy(name="EVENT_RRULE[UNTIL]")
    public WebElement dateSection;


    @FindBy(xpath="//a[@data-date='1730764800000']")
    public WebElement date;

    @FindBy(id="calendar_slider_559490_entry_name")
    public WebElement eventNameArea;

    @FindBy(xpath = "//div[text() = 'More']")
    public WebElement secondMoreButton;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement addMoreButton;

    @FindBy(xpath = "//span[. = 'All employees']")
    public WebElement allEmployeesButton;

    @FindBy(css = "button[id='blog-submit-button-cancel']")
    public WebElement cancelButton;


    @FindBy(xpath = "//iframe[@class = 'bx-editor-iframe']")
    public WebElement secondIframe;

    @FindBy(xpath = "//body[@contenteditable ='true']")
    public WebElement secondMessageArea;

    @FindBy(xpath="//span[text()='(Ctrl+Enter)']")
    public WebElement saveButton;



//----------

//    // A Map to store user credentials
//    Map<String, String[]> users = new HashMap<>();
//
//    private void setupUsers(){
//        users.put("helpdesk", new String[]{"helpdesk1@cydeo.com", "UserUser"});
//        users.put("hr", new String[]{"hr1@cydeo.com", "UserUser"});
//        users.put("marketing", new String[]{"marketing1@cydeo.com", "UserUser"});
//
//    }
//
//    public void login(String accountType){
//        String[] credentials = users.get(accountType);
//
//        if (credentials != null) {
//        String username = credentials[0];
//        String password = credentials[1];
//
//        this.username.sendKeys(username);
//        this.password.sendKeys(password);
//        this.loginButton.click();
//
//        } else {
//            System.out.println("Invalid account type: " + accountType);
//        }
//    }
//
//    //Given user is on the CRM page
//    //#When user log in with valid "<employeeType>" credentials

}
