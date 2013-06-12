Feature: Enter Highscore

After the game finished, you can enter your name into the highscore list

Scenario: Enter Highscorename

Given I finished the Game
When I enter a name
Then I should see “OK”
When I press “OK”
Then I should see “Highscore Table”
