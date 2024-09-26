@regression
Feature: FidelisCare Home Page feature
  @smoke
  Scenario: Verify FidelisCare home page title
    Given I have to open chrome browser
    When I am on FidelisCare home page 
    Then I verify the title
    And I close the browser
