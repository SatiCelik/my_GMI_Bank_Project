@home_test
Feature: US_009_User should be able to search for a new applicant by their SSN and see all their registration info populated
  Background:
    Given user goes to webpage
    And user select dropdown menu
    And user select sign in button
    And user enters Username on the username text box
    And user enters new password
    Then user select second sign in button

  Scenario Outline: TC_01
Given user goes to My Operation
And user click to manage customers page
And user clicks the create a new customer button
And user enters SSN
And user clicks Search button
Then verify firstname, lastname, email,phone number, address is not blank

    Examples:
    | firstname | lastname | email | phone number | address |
    | fuat | celik | fuat123@gmail.com | 076_446_16_94 | Tureberg Alle 16 |