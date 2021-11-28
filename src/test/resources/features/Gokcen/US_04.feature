@login_valid_credentials
Feature: Login valid credentials and cancel


  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select sign in button

    Scenario:TC_01_There should be a valid username and password validating the success message to login
      Given user enters valid username
      Then user enters valid password and click sign in button
      Then verify user sign in to login page

      Scenario: TC_02_There should be an option to cancel login
        Given user enters valid username
        And Enter a valid password  to the New password  textbox
        Then user click on  Cancel  button
        Then verify user goes to main page
