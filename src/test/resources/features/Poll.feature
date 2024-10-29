Feature: CRM Poll feature
  User Story: As a user, I should be able to create and cancel a poll.
    AC-1 : User should be able to create the Poll
    AC-2 : User should be able to cancel the Poll

  Background: For all scenarios user is on CRM24 page of the CRM24 application
    Given the user is on the CRM24 page.




  Scenario Outline : User should be able to create the Poll
    When users log in with valid "<account>" credentials.
    Then the user should see the dashboard.
    And user clicks the Poll button
    Then user clicks the Poll title area and Topic button
    And user types the Poll title
    Then user enters Question
    And user enters Answer-1 and  Answer-2 with clicking Allow multiple choice button
    Then user clicks on Send button

      | account   |
      | helpdesk  |
      | hr        |
      | marketing |

  Scenario Outline:
    Examples: User should be able to cancel the Poll
    When users log in with valid "<account>" credentials.
    Then the user should see the dashboard.
    And user clicks the Poll button
    Then users click on CANCEL button
    And users should see the Poll feed area has collapsed

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |