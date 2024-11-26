@test
Feature: CRM appreciation messages functionality
  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Active Stream**
  Acceptance Criteria:

  AC:1 -User should be able to send an appreciation by filling the mandatory fields.
  'Message content' & 'Recipient'.
  - "The message title is not specified."
  - "Please specify at least one person."
  AC:2 - The delivery should be to 'All employees' by default.
  AC:3 - User should be able to cancel sending appreciation at any time before sending.**

  Background: For all scenarios user is on CRM24 page of the CRM24 application
    Given the user is on the CRM24 page.


  @test
  Scenario Outline: User should be able to send an appreciation by filling the mandatory field.
    When users log in with valid "<account>" credentials.
    And user should see the dashboard
    And user clicks on More button and Appriciation button
    And user clicks the Send button
    Then User should see the "<warningMessage>" on the page

    Examples:
      | account   | warningMessage                     |
      | helpdesk  | The message title is not specified |
      | hr        | The message title is not specified |
      | marketing | The message title is not specified |


    And user clicks Add more button and clear
    And user clicks the Send button
    Then User should see the "warningMessage" on the page
      | Please specify at least one person |


  # buradaki gibi neden yazamiyorum