Feature: Home Page


Background:
	Given User Open the browser
	When User Enter the URL
	When User Click on Shop Menu
	When User Now click on Home menu button
	
Scenario: Validate that Home Page with three sliders only
	Then Validate The Home page must contains only three sliders


Scenario: Validate that the Home page has Three Arrivals only
	Then Validate the Home page has Three Arrivals only
	
Scenario: Validate Images in Arraivals should navigate
	Then Validate the Home page has Three Arrivals only
	Then User click the image in the Arrivals
	Then check page is navigated 
	Then user can add that book into his basket
	
Scenario: Validate Home Page Arraivals Images Description
	Then Validate the Home page has Three Arrivals only
	Then User click the image in the Arrivals
	Then check page is navigated 
	Then user can add that book into his basket
	Then click on Description tab for the book you clicked on
	Then there should be a description regarding that book the user clicked on
	
Scenario: Validate Home Page Arraivals Images Reviews
	Then Validate the Home page has Three Arrivals only
	Then User click the image in the Arrivals
	Then check page is navigated 
	Then user can add that book into his basket
	Then click on Review tab for the book you clicked on
	Then check reviews of book


