Feature: Gameplay

Describes the User interaction while the game is running

Scenario: Play the Game

Given I entered the Game
When I press a Key or a Mouse button
Then the Ball should start moving
When I press the left Arrow or move the Mouse left
Then the paddle should move left
When I press the right Arrow or move the Mouse right
Then the paddle should move right
