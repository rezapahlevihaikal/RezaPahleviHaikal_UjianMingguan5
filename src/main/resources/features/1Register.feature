Feature: Register activity
	Scenario: Create new account
		Given User go to the Website
		When User click dismiss button
		And User click my account button
		And User input username
		And User input email
		And User input password
		Then User input register button