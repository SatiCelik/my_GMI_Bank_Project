#
#Feature: US_001_Registration
#  @registration_page
#  Background:
#    Given user goes to webpage
#    And user navigates to menu dropdown and click
#    And user select  Register button
#
#    Scenario Outline:
#      And user goes SSN text box and enters "<ssn_number>"
#      And goes all boxes and enters "<first_name>","<last_name>","<address>","<phone_number>","<username>","<email>","<new_password>","<password_confirmation>"
#      Then user verify firstname part is not blank
#      Then user verify lastname part is not blank
#      Then user verify address part is not blank
#      Then user verify phone number part is not blank
#      Then user verify username part is not blank
#      Then user verify email part is not blank
#      Then user verify new password part is not blank
#      Then user verify password confirm part is not blank
#      Then user select register button
#      Then verify success message on the page
#
#      Examples:
#      | ssn_number | first_name | last_name | address | phone_number | username | email | new_password | password_confirmation |
#      |  123-56-7893 | Ali      | Can       | Ankara,16 | 076-446-1645 | AliCan | alican@gmail.com| aLi123! | aLi123! <
