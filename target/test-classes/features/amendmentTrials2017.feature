Feature: Search for Amendment trials for 2017
  Scenario: Searching for Amendment trials for 2017
    Given I click on trials menu option
    When I type NCI-2017 into search by submission type
    Then I type Amendment into Search by Submission type
    Then I click on search
    Then I assert search results match