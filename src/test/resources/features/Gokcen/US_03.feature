Feature: US_03_passwordlevelcharts


  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select  Register button

  Scenario Outline:
    Then user sends "<red>" to password red
    Then  user sends "<orange>" to password orange
    Then user sends "<green>" to password green




    Examples:

      | red | orange | green    |
      | a   | abcdE   | Abcd.568 |