package com.hakan.step_definitions;

import com.hakan.pages.CRMAppreciationPage;
import com.hakan.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CRMAppreciation_StepDefs {

    CRMAppreciationPage crmAppreciationPage = new CRMAppreciationPage();

    @And("user clicks on More button and Appriciation button")
    public void userClicksOnMoreButtonAndAppriciationButton() {

        crmAppreciationPage.moreButton.click();
        crmAppreciationPage.appriciationButton.click();

    }

    @And("user entered the message content {string}")
    public void userEnteredTheMessageContent(String messageContent) {

        Driver.getDriver().switchTo().frame(crmAppreciationPage.iframe);

        crmAppreciationPage.messageArea.click();
        crmAppreciationPage.messageArea.sendKeys(messageContent);

        Driver.getDriver().switchTo().defaultContent();

    }

    @When("user clicks the Send button")
    public void user_clicks_the_button() {
      crmAppreciationPage.sendButton.click();

    }

    @Then("User should see the {string} on the page")
    public void user_should_see_the_on_active_stream_page(String messageContent) {

        if (messageContent.equals("The message title is not specified.")) {
            Assert.assertEquals(messageContent, crmAppreciationPage.messageTitleNotSpecifiedWarningMessage.getText());
        } else if (messageContent.equals("Please specify at least one person.")) {
            Assert.assertEquals(messageContent, crmAppreciationPage.specifyOnePersonWarningMessage.getText());

        }
    }

    @Then("User should see the {string} on Active Stream pages")
    public void user_should_see_the_on_active_stream_pages(String messageContent) {

        Assert.assertEquals(messageContent,crmAppreciationPage.lastMessage.getText());

    }


    @Then("user clicks Add more button and clear")
    public void user_clicks_add_button() {
        crmAppreciationPage.allEmployeesButton.click();

    }

    @And("user should see All employees by default")
    public void userShouldSeeAllEmployeesByDefault() {
        Assert.assertTrue(crmAppreciationPage.allEmployeesButton.isDisplayed());
    }

    @And("user should cancel sending appreciation")
    public void userShouldCancelSendingAppreciation() {
        crmAppreciationPage.cancelButton.click();
    }


}
