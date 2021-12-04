@customer_search
Feature:US_09 User search for a new applicant by their SSN and see all their registration info populated

  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user click sign in button


  Scenario:search by SSN
    And user enters manager username and password
    And user click again sign in button
    And user click manage customers
    And user click create customer
    And user search ssn number
    Then verify all their registration
