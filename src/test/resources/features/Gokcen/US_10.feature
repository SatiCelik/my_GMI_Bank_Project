Feature: Address of customer can be created

  Background:
    Given user navigate to webpage
    And user navigates to menu dropdown and click
    And user click sign in button
    Then user enters manager username and password
    And user click again sign in button
    And user click manage customers
    And user click create customer
    And user search ssn number

  Scenario: TC_01

    Then verify address box is not blank
    Then verify address box has letters and digits
    Then verify city box is not blank
    Then verify country box is not blank
    Then verify state box is not blank
    Then verify state box is provided as US state
      |Alabama|  Alaska|  Arizona|  Arkansas|  California|Colorado|  Connecticut|Delaware|  Florida|  Georgia|Hawaii|  Idaho|  IllinoisIndiana|Iowa|  Kansas|Kentucky|  Louisiana|  Maine|  Maryland|  Massachusetts|  Michigan|Minnesota|  Mississippi|  Missouri|  MontanaNebraska|  Nevada|New Hampshire|  New Jersey|  New Mexico|  New York|  North Carolina|  North Dakota|Ohio|  Oklahoma|  Oregon|  Pennsylvania|Rhode Island|  South Carolina|  South Dakota|  Tennessee|Texas|  Utah|Vermont|  Virginia|  Washington|  West Virginia|  Wisconsin|  Wyoming|









