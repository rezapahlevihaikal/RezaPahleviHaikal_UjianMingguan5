Feature: Glass order activity
	Scenario: Order the glass
		When User click search button
		And User input type glass
		And User click glass thumbnail
		And User input color
		And User input size
		Then User click add to cart button