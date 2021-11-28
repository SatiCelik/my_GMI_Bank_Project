@invalid_credentials
Feature: US_05_should not login with invalid credentials

  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select sign in button

    Scenario:
      And user enter invalid userName and see error message
      And user enter invalid passWord and see error message
      And user enter invalid passWord&username and see error message
      And user enter invalid passWord&username and see error message
      Then verify if there is an option to reset their password on the page
      Then verify if there is an option to registration on the page
