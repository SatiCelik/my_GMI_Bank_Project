@US_07_Email_Language_Check
Feature: Email and Language Check
Background:
  Given user goes to webpage
  And user select dropdown menu
  And user select sign in button
  And user enters Username on the username text box
  And user enters new password
  Then user select second sign in button

  Scenario: TC_01
    Given user click account menu
    And user click User Info
    And select in the email box and type a new email
    And  user click save in button
    Then verify that user account can not update with invalid email address

  Scenario: TC_02
    Given user click account menu
    And user click User Info
    And user give an option language dropdown
    Then verify that there is no option other than English and Turkish


