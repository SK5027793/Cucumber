Feature: Login to GitHub using Data table

Scenario: Validate login functionality with Data table

Given data user is already on loginpage
When data user is on loginpage
Then data user enters username and password
| SK5027793 | 23882593swatisudhir |

Then data user clicks on Sign in button
Then data user navigates to homepage
Then data close the browser
 