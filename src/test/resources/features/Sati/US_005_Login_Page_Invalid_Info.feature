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

Scenario: TC_02_User cannot login with invalid password validating the error message
  Given user goes to webpage
  And user select dropdown menu
  And click on sign in dropdown button
  And Enter a valid username to the Username text box
  And Enter a invalid password  to the New password  text box
  And user select sign in button
  Then Verify user see error message

Scenario: TC_03_User cannot login with invalid username and password validating the error message
  Given user goes to webpage
  And user select dropdown menu
  And click on sign in dropdown button
  And Enter a invalid username to the Username text box
  And Enter a invalid password  to the New password  text box
  And user select sign in button
  Then Verify user see error message
  @login_invalid-credential
Scenario: TC_04_User with invalid credentials should be given an option to reset their password
  Given user goes to webpage
  And user select dropdown menu
  And click on sign in dropdown button
  And click on "Did you forget your password?" button
  And Enter a valid email to the Email text box
  And click "Reset password" button
  Then verify the email that has to be send when enter a valid email

Scenario: TC_05_User should be given the option to navigate to registration page if they did not register yet
  Given user goes to webpage
  And user select dropdown menu
  And click on sign in dropdown button
  And select the "You don't have an account yet? Register a new account" button
  And verify if the website navigate to Registration page










