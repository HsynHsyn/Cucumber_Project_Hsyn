package com.hakan.step_definitions;

import com.hakan.pages.TimeAndReportsPage;
import com.hakan.utilities.BrowserUtils;
import com.hakan.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TimeAndReport_StepDefs {

    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();

    @When("the user clicks on ``Time and Reports`` button")
    public void the_user_clicks_on_time_and_reports_button() {

        timeAndReportsPage.timeAndReportsButton.click();
    }

    @Then("the user sees {string} on the “Time and Reports” page.")
    public void the_user_sees_on_the_time_and_reports_page(String modules) {

      List<String> actualModuleNames = BrowserUtils.getElementsText(timeAndReportsPage.allModules);

        //getElementsText
        /*
                List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }*/

        System.out.println("actualModuleNames = " + actualModuleNames);
        for (WebElement each : timeAndReportsPage.allModules) {

            if (each.getText().contains(modules)){

                Assert.assertTrue(each.isDisplayed());

            }else {
                System.out.println(each + " is not displayed");
            }

       }
    }

    @When("the user clicks on ``Worktime`` button")
    public void the_user_clicks_on_worktime_button() {

        timeAndReportsPage.workTimeButton.click();
    }

    @Then("the user sees two checkbox button")
    public void theUserSeesTwoCheckboxButton() {

        Assert.assertTrue(timeAndReportsPage.statsRadioButton.isDisplayed());
        Assert.assertTrue(timeAndReportsPage.showStartRadioButton.isDisplayed());
    }

    @Then("two user sees the “Statistics” checkbox is selected by default.")
    public void two_user_sees_the_statistics_checkbox_is_selected_by_default() {

        Assert.assertTrue("Verification Statistics radio button selection is FAILED!!!",
                timeAndReportsPage.statsRadioButton.isSelected());

    }

    @When("the user clicks on ``Meetings and Briefings`` button")
    public void the_user_clicks_on_meetings_and_briefings_button() {

        timeAndReportsPage.meetingsAndBriefingsButton.click();

    }

    @When("the user clicks on ``NEW MEETING`` button")
    public void the_user_clicks_on_new_meeting_button() {

        timeAndReportsPage.newMeetingButton.click();
    }

    @Then("the user clicks on Topic area and writes a meeting {string} topic")
    public void theUserClicksOnTopicAreaAndWritesATopic(String meetingName) {

        timeAndReportsPage.meetingNewTitle.click();
        timeAndReportsPage.meetingNewTitle.sendKeys(meetingName);
    }

    @Then("the user sets ``Date`` ``Time`` and ``Duration``")
    public void the_user_sets_date_time_and_duration() {

        BrowserUtils.sleep(2);
        timeAndReportsPage.dateButton.click();
        timeAndReportsPage.dateButton30.click();
        BrowserUtils.sleep(2);

        timeAndReportsPage.timeButton.click();
        BrowserUtils.sleep(2);
        timeAndReportsPage.hourButton.clear();
        timeAndReportsPage.hourButton.sendKeys("12");
        BrowserUtils.sleep(2);
        timeAndReportsPage.minutesButton.clear();
        timeAndReportsPage.minutesButton.sendKeys("30");
        BrowserUtils.sleep(2);
        timeAndReportsPage.setTimeButton.click();
        BrowserUtils.sleep(2);
        timeAndReportsPage.durationButton.clear();
        timeAndReportsPage.durationButton.sendKeys("45");
    }

    @Then("the user selects ``Location`` and types {string}")
    public void theUserSelectsLocationAndTypes(String location) {

        timeAndReportsPage.locationButton.sendKeys(location);
    }


    @When("the user writes ``Meeting description`` {string} adds a file by clicking``ADD FILE`` button")
    public void the_user_writes_meeting_description_adds_a_file_by_clicking_add_file_button(String meetDesc) {

        Driver.getDriver().switchTo().frame(timeAndReportsPage.iframe);

        timeAndReportsPage.iframeBody.sendKeys(meetDesc);

        Driver.getDriver().switchTo().parentFrame();


    }

    @When("the user clicks ``CREATE MEETING`` button")
    public void the_user_clicks_create_meeting_button() {

        timeAndReportsPage.createMeeting.click();

    }

    @Then("the user should see the meeting")
    public void the_user_should_see_the_meeting() {

        BrowserUtils.verifyElementDisplayed(timeAndReportsPage.meetingDescription);
    }


}