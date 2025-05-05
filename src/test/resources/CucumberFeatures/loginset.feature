Feature: Login functionality

Scenario: Login with valid credentials
Given User navigates to login page
When User enters valid email address "amotooricap9@gmail.com" into email field
And User enters valid password "12345" into password field
And User clicks on Login button
Then User should be successfully logged in
