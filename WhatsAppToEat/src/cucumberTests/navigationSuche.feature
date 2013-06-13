Feature: Navigation to Suche
Scenario: Navigating to Suche should take the User to the Suchen page
Given I am in "Rezepte" 
When I click on "Suche" 
Then I should see the screen "Suche" 
And there should be a "Algemeine Suche" button 
And there should be a "Zutatensuche" button
