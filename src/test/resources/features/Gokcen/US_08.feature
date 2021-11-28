@password_segment
Feature: US_08 Password segment on Homepage should be editable

  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user click sign in button
    And Enter the username with valid credentials
    And Enter the password with valid credentials
    And user click again sign in button
    And user click menu dropdown
    And user click password button


  Scenario:TC01 The old password should not be used
    Given user enters old password
    Then user verify the error message

  Scenario Outline:
    Given enter at least "<1 lowercase char>" to password
    Then verify the level chart red "<color1>"
    Given enter "<1 uppercase char>" to password
    Then verify the level chart orange "<color2>"
    And user enter "<1 digit char>" to password
    Then verify the level chart yellow "<color3>"
    Given enters "<1 special char>" to password
    Then verify the level chart lightgreen "<color4>"
    Given enter at least 7char "<7 char>" to stronger password
    Then verify the level chart green "<color5>"
    Then confirm the new password


    Examples:
      | 1 lowercase char | color1 | 1 uppercase char | color2 | 1 digit char | color3 | 1 special char | color4     | 7 char  | color5 |
      | a                | red    | aA               | orange | aA1          | yellow | aA1.           | lightGreen | aA1.zzz | green  |
