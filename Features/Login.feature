Feature: Login functionality
  @test
  Scenario: Valid login
    Given User is on Login Page
    When User enters username "admin" and password "admin123"
    And Clicks on login
    Then User should see dashboard

   @smoke
  Scenario:Login with CSV data
    Given User enters login credentials from csv
    Then Store the login result in csv

#Feature: Login with multiple credentials
#
  @csvlogin
  Scenario Outline: Login using data from CSV
    Given User logs in with "<username>" and "<password>"
    Then Login should be successful or failed based on input

    Examples:
      | username  | password |
      | dummy     | dummy123 |
      # Real data will be read in StepDef

