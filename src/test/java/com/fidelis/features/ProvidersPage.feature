@regression
Feature: FidelisCare Providers Page feature
  @smoke
  Scenario: Verify FidelisCare Providers Page Login Credential
    Given I have to open chrome browser
    When I am on FidelisCare home page 
    And I click on Providers and providers button
   
    And click on login btn2
    And Now I have to type username as "<Username>"
    And Next I have to type password as "<Password>"
    
#		When I click on login button3
    And I close the browser
