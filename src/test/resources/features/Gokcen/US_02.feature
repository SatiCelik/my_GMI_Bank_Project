@US02InvalidInput
Feature: US_02_invalidInputs


  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select  Register button

    Scenario: All steps

    And user selects SSN box and be left blank
    Then verify  "Please enter your social security number." error message
      And user enter an invalid ssn number
      Then verify  "Please enter your social security number." error message
      And user enters an invalid phonenumber
      Then user verify   "Your mobile phone number is invalid."  error message
      And user enters an invalid email
      Then user should see  "Your email is invalid." error message.