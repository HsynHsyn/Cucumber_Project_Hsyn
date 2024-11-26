@Active
Feature: CRM Activity stream page.

  User Story: As a user, I should be able to see all the options on the "Activity stream" page.
  Acceptance Criteria:
  AC-1: Verify that users view the following options on the Activity stream page:
  - MESSAGE
  - TASK
  - EVENT
  - POLL
  - MORE
  AC-2: Verify the users view the following 4 options under the MORE tab:
  - File
  - Appreciation
  - Announcement
  - Workflow

  Background: For all scenarios user is on CRM24 page
    Given the user is on the CRM24 page.


  Scenario Outline: Verify that the user should see 5 modules on the "Activity stream" page
    When users log in with valid "<account>" credentials.
    Then the user should see the following options on the Activity stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |


  Scenario Outline: Verify that the user should see 4 modules under the MORE tab
    When users log in with valid "<account>" credentials.
    And user clicks MORE button
    Then the user should see the following options under the MORE tab

      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

    Examples:
      | account   |
      | helpdesk  |
      | hr        |
      | marketing |



