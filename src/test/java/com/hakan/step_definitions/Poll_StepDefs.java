package com.hakan.step_definitions;

import com.hakan.pages.PollPage;
import com.hakan.pages.TaskPage;
import com.hakan.utilities.BrowserUtils;
import com.hakan.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Poll_StepDefs {

    PollPage pollPage = new PollPage();
    TaskPage taskPage = new TaskPage();

    @And("user clicks the Poll button")
    public void userClicksThePollButton() {

        pollPage.pollButton.click();
  }

    @Then("user clicks the Topic button")
    public void userClicksTheTopicButton() {

        BrowserUtils.waitForClickablility(pollPage.bottomTopicButton,2);
       pollPage.bottomTopicButton.click();

    }

    @And("user types the Poll title and write content with quote")
    public void userTypesThePollTitleAndWriteContent() {

        pollPage.aboveTopicButton.sendKeys("Daily Stand-up Meeting Time Set");
        pollPage.quoteButton.click();

        Driver.getDriver().switchTo().frame(pollPage.iframe);
        pollPage.iframeMessageBody.sendKeys("The survey will close within 24 hours");
        Driver.getDriver().switchTo().defaultContent();

        pollPage.uploadFilesButton.click();
        pollPage.pickFile.sendKeys("C:\\Users\\dell\\Desktop\\Masaüstü\\cucumber.png");

    }

    @Then("user enters Question")
    public void userEntersQuestion() {

       pollPage.question0.click();
       pollPage.question0.sendKeys("What Time");

    }

    @And("user enters Answers with clicking Allow multiple choice button")
    public void userEntersAnswersWithClickingAllowMultipleChoiceButton() {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                pollPage.allAnswers.get(i).click();
                pollPage.allAnswers.get(i).sendKeys("09:45 am");
            }else {
                pollPage.allAnswers.get(i).click();
                pollPage.allAnswers.get(i).sendKeys("10:00 am");
            }
        }

    }

    @Then("user clicks on Send button")
    public void userClicksOnSendButton() {
        pollPage.sendButtonPoll.click();
    }

    @And("users should see the Poll feed area has collapsed")
    public void usersShouldSeeThePollFeedAreaHasCollapsed() {

        BrowserUtils.verifyElementDisplayed(pollPage.pollMessageAreaCollapsed);


    }



}
