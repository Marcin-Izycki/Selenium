Feature: Search Route

 Scenario Outline: user can find route between two points
    Given I'm on google.com page
    Then I select google map
    And I find address <address>
#    And I set a route
#    Then I select my localization
#    And I close browser

    Examples:
  |address|
  |"Sosnowiec ul. Logistyczna 1"|