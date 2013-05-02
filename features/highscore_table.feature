Feature: Highscore Table

You can see the Players with the best Highscores who played the game

Scenario: Show Highscore Table

Given I started the Application
When I press “Highscoreliste”
Then I should see “1”
And I should see “2”
And I should see “3”
And I should see “4”
And I should see “5”
