@password_tests
  Feature: US_003_Registration_page_password_created

    Background: User is on the registration page
      Given user goes the GMI-bank webpage
      And user goes to menu dropdown and click
      And user clicks  Register button


    Scenario: TC_01_user_enter_valid_password_see_the_level_chart_change_accordingly
      Given user enter lowercase char for stronger password
      Then user verify first color part is appeared


     Scenario: TC_02_user_enter_valid_password_see_the_level_chart_change_accordingly
       Given user enter upper case char for stronger password
       Then user verify second color part is visible

     Scenario: TC_03_user_enter_valid_password_see_the_level_chart_change_accordingly
       Given user enters digit and see the level  chart change accordingly
       Then user verify third color part is visible

     Scenario: TC_04_user_enter_valid_password_see_the_level_chart_change_accordingly
       Given user enters special char and see the level  chart change accordingly
       Then user verify fourth color part is visible

     Scenario: TC_05_user_enter_valid_password_see_the_level_chart_change_accordingly
       Given user enters password there should be at least 7 chars for a stronger password
       Then user verify fifth color part is visible

