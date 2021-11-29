@gok_homepage_study
Feature: User info segment (User Settings) should be editable on Homepage
  Background: user goes to login page

    Given user goes the GMI-bank webpage
    And user goes to menu dropdown and click
    And click on sign in dropdown button
    And enters user_name
    And user enters password
    Then user select second sign in button

  Scenario: TC_01


    And user open  account menu.
    And user click User Info
    Then Verify  the name in the First Name textbox is "sati"
    Then Verify  the  last name in the Last Name textbox is   "team3"
    Then Verify  the  email in the Email textbox is  "team3@team.com"
    Then Verify  the  selected language is "English"
    Then user Sign out

  Scenario: TC_02_There should be 2 languages available "English and Turkish"

    Given user open  account menu.
    And user click User Info
    Then  Verify languages are available English and Turkish
    Then user Sign out

Scenario: TC_03
  Given user open  account menu.
  And user click User Info
  And  Click in the firstname box and type a new firstname
  And  user click save in button
  Then  Verify that firstname have been updated

Scenario: TC_04
  Given user open  account menu.
  And user click User Info
  And  Click in the lastname box and type a new lastname
  And  user click save in button
  Then  Verify that lastname have been updated

Scenario: TC_05
  Given user open  account menu.
  And user click User Info
  And Click in the email box and type a new email
  And  user click save in button
  Then verify update by adding  "@" sign and "." extension to your email