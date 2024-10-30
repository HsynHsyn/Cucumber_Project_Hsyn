
Feature: Users should be able to login

   Background: For all scenarios user is on CRM24 page of the CRM24 application
    Given the user is on the login page

  Scenario Outline: Users log in with valid credentials for different accounts
    When users log in with valid "<account>" credentials.
    Then the user should see the dashboard.

    Examples:
      | account   |
      | helpdesk  |
      | HR        |
      | marketing |








