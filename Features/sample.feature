Feature: all login related scenario's

  Scenario: To test the functionality of login button for valid input
    Given Login page should be opened
    When  I enter username and credentials
    And  I click on login button
    Then I should redirected to home page
