Feature: Game Description

You can open the Game Description to know how to play the game

Scenario: Show Game Description

Given I started the Application
When I press “Spielbeschreibung”
Then I should see “Spielverlauf”
And I should see “Steuerung”
