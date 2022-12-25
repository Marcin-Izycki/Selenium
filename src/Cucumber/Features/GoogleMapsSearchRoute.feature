Feature: Search Route
  Scenario: user can find route between two points
    Given I'm on google.com page
    Then I select google map
    And I find <address>
    And I set a route
    Then I select my localization
    And I close browser