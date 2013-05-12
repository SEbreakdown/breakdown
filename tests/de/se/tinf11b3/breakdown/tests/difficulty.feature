Feature: Difficulty

You can chose difficulty before you start a game

Scenario: Chose Difficulty

Given I started the Application
When I press “Spiel starten”
Then I should see “Leicht”
And I should see “Mittel”
And I should see “Schwer”