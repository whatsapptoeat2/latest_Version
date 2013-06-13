Feature:  Navigation to Verwalten
Scenario: Navigating to Verwalten should take the User to the Verwalten page
Given I am in "Rezepte" 
When I click on "Verwalten" 
Then I should see the screen "Verwalten" 
And there should be a "Liste anzeigen" button 
And there should be a "Neuer Eintrag" button

