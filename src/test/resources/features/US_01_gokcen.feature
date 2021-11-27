Feature: US_01_registration


  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user select  Register button


  Scenario Outline:
    And user goes to SSN box and enters  "<9_digits_number>"
    And user enters "<first name>","<last name>","<a valid address>","<10 digit-long Number>","<Username>","<Email address>","<firstpassword>","<confirmpassword>"
    Then verify the first name box is not blank
    Then verify the last name box is not blank
    Then verify the adress text box is not blank
    Then user verify the phone number text box is not blank
    Then user verify the username text box is not blank
    Then user verify the email Text box is not blank
    Then user click register button
    Then verify the succes message



    Examples:
      | 9_digits_number | first name | last name | a valid address | 10 digit-long Number | Username  | Email address |firstpassword|confirmpassword|
      | 153-45-6710     | Ali        | Can       | Demir sk.       | 505-666-4121         | AliCan123 | alican@oxy.com | 123abc.   |123abc.        |
