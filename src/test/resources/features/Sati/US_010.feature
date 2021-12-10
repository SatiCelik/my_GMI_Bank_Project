
Feature: US_10
  Background:
    Given user goes to webpage
    And user select dropdown menu
    And user select sign in button
    And user enters Username in the sign in page
    And user enters new password in the sign in page
    And user click second sign in button
    And user goes to My Operation
    And user click to manage customers page
    And user clicks the create a new customer button
    And user enters SSN
    And user clicks Search button


  @address_not_blank
  Scenario: TC_01_address_button_is_not_blank
   Then verify address text box is not blank
    And close the application

    Then verify city text box is not blank
    Then verify country text box is not blank
    Then verify state text box is not blank
    Then verify state text box is provided as US state




