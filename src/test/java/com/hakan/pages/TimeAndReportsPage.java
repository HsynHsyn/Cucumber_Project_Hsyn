package com.hakan.pages;

import com.hakan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimeAndReportsPage {

    public TimeAndReportsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//a[contains(@title, 'Time and Reports')]")
    @FindBy(css = "a[title ='Time and Reports']")
    public WebElement timeAndReportsButton;

    @FindBy(xpath = "//span[text() ='Worktime']")
    public WebElement workTimeButton;

    //five modules`
    @FindBy(css = "div.main-buttons-inner-container")
    public WebElement modules;

    @FindBy(css = "span.main-buttons-item-text-title")
    public List<WebElement> allModules;

    @FindBy(css = "input#stats")
    public WebElement statsRadioButton;

    @FindBy(xpath = "//label[text() ='Show start and end times']")
    public WebElement showStartRadioButton;

    @FindBy(xpath = "//span[text() ='Meetings and Briefings']")
    public WebElement meetingsAndBriefingsButton;

    @FindBy(xpath = "//span[text() ='Absence Chart']")
    public WebElement absenceChartButton;

    @FindBy(xpath = "//span[text() ='Bitrix24.Time']")
    public WebElement bitrix24TimeButton;

    @FindBy(xpath = "//span[text() ='Work Reports']")
    public WebElement workReportsButton;

    @FindBy(xpath = "//span[text() ='New meeting']")
    public WebElement newMeetingButton;

    @FindBy(css = "input.meeting-new-title")
    public WebElement meetingNewTitle;

    @FindBy(css = ".meeting-new-create-d-date")
    public WebElement dateButton;


    @FindBy(xpath = "//a[@class='bx-calendar-cell bx-calendar-active' and contains(text(), '1')]")
    public WebElement dateButton30;

    @FindBy(css = ".meeting-new-create-d-time")
    public WebElement timeButton;

    @FindBy(xpath = "//input[@title='Hours']")
    public WebElement hourButton;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement minutesButton;

    @FindBy(css = "input[value='Set Time']")
    public WebElement setTimeButton;

    @FindBy(name = "DURATION")
    public WebElement durationButton;

    @FindBy(xpath = "//input[@name ='PLACE']")
    public WebElement locationButton;

    @FindBy(css = ".lha-iframe")
    public WebElement iframe;

    @FindBy(xpath = "((//body[contains(@style,'padding')])[1])")
    public WebElement iframeBody;

    @FindBy(xpath = "//span[text() ='Create meeting']")
    public WebElement createMeeting;

    @FindBy(css = ".meeting-detail-title")
    public WebElement meetingDescription;


















}
