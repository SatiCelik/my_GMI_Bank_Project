@login_test
  Feature: US_04_Login page should accessible with valid credentials


    Scenario: TC_01_There should be a valid username and password validating the success message to login
    Given user goes to webpage
    And user select dropdown menu
    And click on sign in dropdown button
    And Enter a valid username to the Username textbox
    And Enter a valid password  to the New password  textbox
    And user select sign in button
    Then Verify user goes to user login page

    Scenario: TC_02_There should be an option to cancel login
    Given user goes to webpage
    And user select dropdown menu
    And click on sign in dropdown button
    And Enter a valid username to the Username textbox
    And Enter a valid password  to the New password  textbox
    And user click on  Cancel  button
    Then verify user goes to main page