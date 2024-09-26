@regression
Feature: FidelisCare Shop For A Plan Page feature
  @smoke
  Scenario: Verify FidelisCare Shop For A Plan page details
    Given I have to open chrome browser
    When I am on FidelisCare home page 
    And I click on shop for a plan button and again plan button
    And click on medicaid managed care
    And click on essential plan
    And click on child health plus
    And click on quality health plan
    And click on healtheire life
    And click on fidelis care at home
    And click on medicare advantage
    And click on dual advantage  
    And I close the browser
