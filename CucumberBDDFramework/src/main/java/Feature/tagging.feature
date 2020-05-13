@Functional
Feature: FBO application testing

@Regression @Smoke @EndToEnd
Scenario: Login to application 
Given user login to application with valid credentials

@Regression
Scenario: Account Summary page
Given user landed on account summary page

Scenario: Invoice History and Details
Given user check for invoice summary

Scenario: Tracking Id details
Given user check for tracking Id summary

@Regression @Smoke
Scenario: Search and Download
Given user is on search and download page

@EndToEnd
Scenario: Message Centre
Given user checks for message on accountsummary page

@EndToEnd
Scenario: redeem promotion code
Given user selects invoice

@Regression
Scenario: Paypal payment option
Given user selects invoice to pay via paypal

@Regression
Scenario: Credit card option
Given user selects invoice to pay via credit card

@Regression
Scenario: Electronic Fund Transfer option
Given user selects invoice to pay via EFT

@Regression
Scenario: Check payment option
Given user selects invoice to pay via check payment

@Regression
Scenario: Download Centre
Given user is on download centre page

@Smoke
Scenario: Invoice level dispute
Given user selects invoice to perform dispute

@Smoke
Scenario: Tracking level dispute
Given user selects invoice to perform tracking level dispute

@Smoke
Scenario: Check for new invoice email
Given user check emails for all region

@Regression @Smoke @EndToEnd
Scenario: Logout
Given user clicks on logout button
