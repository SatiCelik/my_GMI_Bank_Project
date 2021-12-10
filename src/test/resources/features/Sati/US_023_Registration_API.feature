@read_and_validate_registrant
  Feature: Read all registrants you created and validate them from your data set



      Scenario Outline: get api data end validate
        Given user read the registrant from "<endpoint>" and extension "<id>"
        Then user validates the "<ssn>"

        Examples:
        |endpoint|id|ssn|
        |https://www.gmibank.com/api/tp-account-registrations|32237|531-53-5333|


