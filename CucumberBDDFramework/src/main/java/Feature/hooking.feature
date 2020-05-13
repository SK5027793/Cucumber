Feature: PayPal payment check

Scenario: Validate payment with PayPal profile
Given user selects a invoice for payment
When user enters PayPal credentails
Then user clicks on pay button
Then user performed PayPal payment successfully