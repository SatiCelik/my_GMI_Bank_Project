Feature: US_008_Password segment on Homepage should be editable
  Background:
    Given user goes to webpage
    And user select dropdown menu
    And user select sign in button
    And user enters Username on the username text box
    And user enters new password
    And user select second sign in button
    And user select password drop down menu
    And  user click current password button and enter current password


  Scenario Outline: TC_01_Password_is_verify
    Then user sends password to "<red>" color
    Then user sends password for "<orange>" color
    Then user sends password for "<yellow>"
    Then user sends password to "<green>"
    Then user enters password again new password confirmation
    Then user select save button
    Then user close applicant


    Examples:
    | red | orange | yellow | green |
    | abc | abcDE  | abcDE1 | abcDE1. |



