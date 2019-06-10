Feature: Free opensourcecms Login Feature

Scenario Outline: Free opensourcecms Login Test Scenario

Given user is already on Login Page
When title of login page is Username or Email Address
Then user enters "<username>" and "<password>"
| username | password |
| naveenk  | test@123 |
|  tom     | test456  | 
Then user clicks on login button
Then user is on home page
Then Close the browser
