@regression
Feature: FidelisCare Member Page feature
  @smoke
  Scenario: Verify FidelisCare  member page login credential
    Given I have to open chrome browser
    When I am on FidelisCare home page 
    And I click on member and members button
    And I click on SUOMP button
    And I click on HRA button
    And I click on RYPD button
    And I click on PCB button
    And I click On Login button1
    And Click on EnterKeyID button
    And Type on email address
    And Click on continue button
		And Now I have to type username as "<Username>"
    And Next I have to type password as "<Password>"
    
		When I click on login button
    And I close the browser
