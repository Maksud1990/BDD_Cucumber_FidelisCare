Feature: FidelisCare member portal page testing info
	Background:
		Given I have to open chrome browser
		When I am on FidelisCare home page   
	Scenario: Verify member page title
		And I click on member login button
		And Click on member access online
	 Then I verify the member page title
		And I close the browser
	@regression
	Scenario Outline: Verify  login page is working or not
		And I click on member login button
		And Click on member access online
		And Click on EnterKeyID button
    And Type on email address
    And Click on continue button
		And Now I have to type username as "<Username>"
    And Next I have to type password as "<Password>"
    
		When I click on login button
		And I close the browser	
		Examples:
		|username|password|
		|mdrhmn7@yahoo.com|Maksud1976//	|
		|username|password|