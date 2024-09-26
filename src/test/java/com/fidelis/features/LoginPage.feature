@regression
Feature: FidelisCare login validation 
Background:
		Given I have to open chrome browser
		When I am on FidelisCare home page   

	Scenario: Verify FidelisCare login is working or not
	
		And I click on member login button
		And Click on member access online
	  Then I verify the member page title 
		And Click on EnterKeyID button
    And Type on email address
    And Click on continue button
		And I enter username as "user1"
		And I enter password as "pass1"
		When I click on login button
		Then I should be able to see the member portal home page
		And I close the browser
	@mytest
	Scenario: Verify FidelisCare login is working or not

		And I click on member login button
		And Click on member access online
		Then I verify the member page title 
		And Click on EnterKeyID button
    And Type on email address
    And Click on continue button
		And I enter username as "user2"
		And I enter password as "pass2"
		When I click on login button
		Then I should be able to see the member portal home page
		And I close the browser
		
	Scenario: Verify FidelisCare login is working or not
		
		And I click on member login button
		And Click on member access online
		Then I verify the member page title 
		And Click on EnterKeyID button
    And Type on email address
    And Click on continue button
		And I enter username as "user3"
		And I enter password as "pass3"
		When I click on login button
		Then I should be able to see the member portal home page
		And I close the browser