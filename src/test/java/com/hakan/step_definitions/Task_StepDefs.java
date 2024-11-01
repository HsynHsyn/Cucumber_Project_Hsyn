package com.hakan.step_definitions;

import com.hakan.pages.LoginPage;
import com.hakan.pages.TaskPage;
import com.hakan.utilities.BrowserUtils;
import com.hakan.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Task_StepDefs {

    TaskPage taskPage = new TaskPage();
    LoginPage loginPage =new LoginPage();


    @Given("the user is on the CRM24 page.")
    public void the_user_is_on_the_crm24_page() {
        Driver.getDriver().get("https://login1.nextbasecrm.com/stream/?login=yes");


    }

    @When("users log in with valid {string} credentials.")
    public void users_log_in_with_valid_credentials(String accountType) {

        loginPage.login(accountType);
    }

    @Then("the user should see the dashboard.")
    public void the_user_should_see_the_dashboard() {
       //crmTaskPage.logo24.isDisplayed();
       BrowserUtils.verifyElementDisplayed(taskPage.activeStream); // this my utility
    }


    @When("users click on TASK button")
    public void users_click_on_task_button() {

        taskPage.taskButton.click();
    }

    @Then("users enter the task title on Things to do area")
    public void users_enter_the_task_title_on_things_to_do_area() {
        taskPage.thingToDoArea.click();
        taskPage.thingToDoArea.sendKeys("CRM_SprintGroup1");

    }
    @Then("users enter the task body on task body area")
    public void users_enter_the_task_body_on_task_body_area() {

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOf(crmTaskPage.iframeElement));
        Driver.getDriver().switchTo().frame(taskPage.iframeElement);

        taskPage.taskBodyArea.click();
        taskPage.taskBodyArea.sendKeys("CRM Task body input");

        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("users click on the SEND button")
    public void users_click_on_the_send_button() {

        taskPage.sendButton.click();

    }
    //locating element impossible for different users
   /* @Then("User should see the task on Active Stream page")
    public void user_should_see_the_task_on_active_stream_page() {

        BrowserUtils.verifyElementDisplayed(taskPage.taskOnActiveStreamPage);
    }*/

    @Then("users click on CANCEL button")
    public void users_click_on_cancel_button() {

        taskPage.cancelButton.click();
    }
    @Then("users should see the task message area has collapsed")
    public void users_should_see_the_task_message_area_has_collapsed() {
        taskPage.taskMessageAreaCollapsed.isDisplayed();
    }



}
