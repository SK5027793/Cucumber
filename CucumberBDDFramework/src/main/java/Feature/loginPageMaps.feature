Feature: Login to GitHub using Map

Scenario: Validate login functionality with Map

Given map user is already on loginpage
When map user is on loginpage
Then map user enters username and password
| username | password |
| SK5027793 | 23882593swatisudhir |

Then map user clicks on Sign in button
Then map user navigates to homepage
Then map close the browser
 