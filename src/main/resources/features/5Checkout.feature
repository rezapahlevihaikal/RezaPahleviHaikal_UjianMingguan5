Feature: Chekcout activity
	Scenario: checkout all stuff at cart
		When User click cart checkout button
		And User click proceed to checkout button
		And User input form
		And User click terms
		Then User click place order button