@App
Feature: CRM appreciation messages functionality
  User Story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Active Stream**
  Acceptance Criteria:

  AC:1 -User should be able to send an appreciation by filling the mandatory fields.
  'Message content' & 'Recipient'.
  - "The message title is not specified."
  - "Please specify at least one person."
  AC:2 - The delivery should be to 'All employees' by default.
  AC:3 - User should be able to cancel sending appreciation at any time before sending.

  Background: For all scenarios user is on CRM24 page of the CRM24 application
    Given the user is on the CRM24 page.

  @App
  Scenario Outline: Verify that user should be able to send an appreciation by filling the mandatory field.
    When users log in with valid "<account>" credentials.
    And user clicks on More button and Appriciation button
    And user clicks the Send button
    Then User should see the "<warningMessage>" on the page

    Examples:
      | account   | warningMessage                     |
      | helpdesk  | The message title is not specified |
      | hr        | The message title is not specified |
      | marketing | The message title is not specified |

  @App
  Scenario Outline: Verify that user should be able to send an appreciation by filling the mandatory field.
    When users log in with valid "<account>" credentials.
    And user clicks on More button and Appriciation button
    And user clicks Add more button and clear
    And user clicks the Send button
    Then User should see the "<warningMessage>" on the page
    Examples:
      | account   | warningMessage                     |
      | helpdesk  | Please specify at least one person |
      | hr        | Please specify at least one person |
      | marketing | Please specify at least one person |

  @App
  Scenario Outline: Verify that the delivery should be to 'All employees' by default
    When users log in with valid "<account>" credentials.
    And user clicks on More button and Appriciation button
    And user should see All employees by default

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |

  @App
  Scenario Outline: Verify that user should be able to cancel sending appreciation at any time before sending
    When users log in with valid "<account>" credentials.
    And user clicks on More button and Appriciation button
    And user should cancel sending appreciation
    And users should see the task message area has collapsed

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |



