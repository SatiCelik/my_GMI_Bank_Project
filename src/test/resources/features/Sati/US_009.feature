@home_test_case
Feature: US_009_User should be able to search for a new applicant by their SSN and see all their registration info populated
  Background:
    Given user goes to webpage
    And user select dropdown menu
    And user select sign in button


  Scenario : TC_01
    Given user enters Username in the sign in page
    And user enters new password in the sign in page
    And user click second sign in button
    And user goes to My Operation
    And user click to manage customers page
    And user clicks the create a new customer button
    And user enters SSN
    And user clicks Search button
    Then verify all their registration firstname, lastname, email, phone number, email, address

