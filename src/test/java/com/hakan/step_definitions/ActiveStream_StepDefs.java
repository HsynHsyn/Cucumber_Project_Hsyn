package com.hakan.step_definitions;

import com.hakan.pages.ActiveStreamPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.joda.time.chrono.AssembledChronology;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.SoftAssertions;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class ActiveStream_StepDefs {

    ActiveStreamPage activeStreamPage = new ActiveStreamPage();
    SoftAssertions softly = new SoftAssertions();

    @Then("the user should see the following options on the Activity stream page")
    public void the_user_should_see_the_following_options_on_the_activity_stream_page(DataTable dataTable) {

        // Convert the DataTable into a List<String> to represent the expected options
        List<String> options = dataTable.asList(String.class);

        // Create a new list to store the text values of web elements
        List<String> webElementText = new ArrayList<>();

        // Iterate over all top buttons on the Active Stream page and collect their text
        for (WebElement webElement : activeStreamPage.allTopButtons) {
            webElementText.add(webElement.getText());
        }

        // Verify that the expected options from the DataTable match the actual UI options
        Assert.assertEquals(options, webElementText);

        // Check if each module (button) is displayed on the Active Stream page
        for (WebElement eachModule : activeStreamPage.allTopButtons) {
            softly.assertThat(eachModule.isDisplayed()).isTrue(); // Use soft assertion for better reporting
        }

        // Collect all soft assertions and report any failures
        softly.assertAll();

    }

    @And("user clicks MORE button")
    public void userClicksMOREButton() {
        activeStreamPage.moreButton.click();
    }

    @Then("the user should see the following options under the MORE tab")
    public void the_user_should_see_the_following_options_under_the_more_tab(DataTable dataTable) {

        // Convert the DataTable into a List<String> to represent the expected "more options"
        List<String> options = dataTable.asList(String.class);

        // Create a new list to store the text values of web elements
        List<String> webElementText = new ArrayList<>();

        // Iterate over all "more options" elements on the Activity Stream page and collect their text
        for (WebElement webElement : activeStreamPage.moreOptions) {
            webElementText.add(webElement.getText());
        }

        // Verify that the expected options from the DataTable match the actual "more options" in the UI
        Assert.assertEquals(options, webElementText);

        // Check if each "more option" is displayed on the Active Stream page
        for (WebElement eachModule : activeStreamPage.moreOptions) {
            softly.assertThat(eachModule.isDisplayed()).isTrue(); // Use soft assertion for display validation
        }

        // Collect all soft assertions and report any failures
        softly.assertAll();

    }


}

