Feature: Search functionality

Scenario: User searches for a valid product
Given User opens the Application
When User enters valid product "HP" into Search box field
And User clicks on Search button
Then User should get valid product displayed in search results