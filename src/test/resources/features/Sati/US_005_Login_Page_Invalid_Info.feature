@login_invalid-credential
Feature: US_04_Login page should accessible with valid credentials


  Scenario: TC_01_User cannot login with invalid username validating the error message
    Given user goes to webpage
    And user select dropdown menu
    And click on sign in dropdown button
    And Enter a invalid username to the Username text box
    And Enter a valid password  to the New password  text box
    And user select sign in button
    Then Verify user see error message