Feature: Login to GitHub feature


#===============Normal scenario with hard coded values:===============
#Scenario: Validate login functionality

#Given user is already on loginpage
#When user is on loginpage
#Then user enters username and password 
#Then user clicks on Sign in button
#Then user navigates to homepage
#Then close the browser


#================With Regular expression without Example keyword:===============
#Scenario: Validate login functionality

#Given user is already on loginpage
#When user is on loginpage
#Then user enters "SK5027793" and "23882593swatisudhir" 
#Then user clicks on Sign in button
#Then user navigates to homepage
#Then close the browser

#================With Examples keywords================
Scenario Outline: Validate login functionality

Given user is already on loginpage
When user is on loginpage
Then user enters "<username>" and "<password>" 
Then user clicks on Sign in button
Then user navigates to homepage
Then close the browser

Examples: 
         | username | password |
         | SK5027793 | 23882593swatisudhir |
         | tom | test@1234 | 