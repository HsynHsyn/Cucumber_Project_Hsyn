@Time
Feature: CRM Time and Reports feature
  User Story: As a user, I should be able to access the “Time and Reports” page.

  Acceptance Criteria:
  AC-1: Verify that user sees the 5 modules on the “Time and Reports” page.
  AC-2: Verify that there are 2 checkboxes on the “Worktime” module.
  AC-3: Verify that the “Statistics” checkbox is selected by default.
  AC-4: Verify that user creates a meeting under the ``Meetings and Briefings`` module.

  Background: For all scenarios user is on CRM24 page
    Given the user is on the CRM24 page.


  @Time
  Scenario Outline: The user should see 5 modules on the "Time and Reports" page
    When users log in with valid "<account>" credentials.
   Then the user should see the dashboard.
    When the user clicks on ``Time and Reports`` button
   Then the user sees "<modules>" on the “Time and Reports” page.

    Examples:
      | account   | modules                |
      | helpdesk  | Absence Chart          |
      | hr        | Worktime               |
      | marketing | Work Reports           |
      | marketing | Meetings and Briefings |
      | hr        | Bitrix24.Time          |



  @Time
  Scenario Outline: The user should see 2 checkboxes on the “Worktime” module
    When  users log in with valid "<account>" credentials.
    Then  the user should see the dashboard.
    When  the user clicks on ``Time and Reports`` button
    And   the user clicks on ``Worktime`` button
    Then  the user sees two checkbox button

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |
  @Time
  Scenario Outline: The user should see the “Statistics” checkbox is selected by default.
    When  users log in with valid "<account>" credentials.
    Then  the user should see the dashboard.
    When  the user clicks on ``Time and Reports`` button
    And   the user clicks on ``Worktime`` button
    Then  two user sees the “Statistics” checkbox is selected by default.

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |
  @Time
  Scenario Outline: The user should create a meeting under the ``Meetings and Briefings`` module.
    When  users log in with valid "<account>" credentials.
    Then  the user should see the dashboard.
    When  the user clicks on ``Time and Reports`` button
    And   the user clicks on ``Meetings and Briefings`` button
    When  the user clicks on ``NEW MEETING`` button
    Then  the user clicks on Topic area and writes a meeting "meeting" topic
    And   the user sets ``Date`` ``Time`` and ``Duration``
    Then  the user selects ``Location`` and types "East Meeting Room"
    When  the user writes ``Meeting description`` "Meeting description" adds a file by clicking``ADD FILE`` button
    And   the user clicks ``CREATE MEETING`` button
    Then  the user should see the meeting

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |