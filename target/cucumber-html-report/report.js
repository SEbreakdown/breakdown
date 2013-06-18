$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('de/se/tinf11b3/breakdown/tests/difficulty.feature');
formatter.feature({
  "id": "difficulty",
  "description": "\nYou can chose difficulty before you start a game",
  "name": "Difficulty",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "difficulty;chose-difficulty",
  "description": "",
  "name": "Chose Difficulty",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I started the Application",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press “Spiel starten”",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should see “Leicht”",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I press “Spiel starten”",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "I should see “Mittel”",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I press “Spiel starten”",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "I should see “Schwer”",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "SeleniumHandler.I_started_the_Application()"
});
formatter.result({
  "duration": 7198442009,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 508932926,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Leicht()"
});
formatter.result({
  "duration": 118541076,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 387940835,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Mittel()"
});
formatter.result({
  "duration": 399557978,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 366346980,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Schwer()"
});
formatter.result({
  "duration": 442705079,
  "status": "passed"
});
formatter.uri('de/se/tinf11b3/breakdown/tests/game_description.feature');
formatter.feature({
  "id": "game-description",
  "description": "\nYou can open the Game Description to know how to play the game",
  "name": "Game Description",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "game-description;show-game-description",
  "description": "",
  "name": "Show Game Description",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I started the Application",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press “Spielbeschreibung”",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should see “Spielverlauf”",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I should see “Steuerung”",
  "keyword": "And ",
  "line": 10
});
formatter.match({
  "location": "SeleniumHandler.I_started_the_Application()"
});
formatter.result({
  "duration": 25527,
  "status": "passed"
});
formatter.match({
  "location": "Game_Description.I_press_Spielbeschreibung()"
});
formatter.result({
  "duration": 387878478,
  "status": "passed"
});
formatter.match({
  "location": "Game_Description.I_should_see_Spielverlauf()"
});
formatter.result({
  "duration": 12377208,
  "status": "passed"
});
formatter.match({
  "location": "Game_Description.I_should_see_Steuerung()"
});
formatter.result({
  "duration": 51188253,
  "status": "passed"
});
formatter.uri('de/se/tinf11b3/breakdown/tests/highscore_table.feature');
formatter.feature({
  "id": "highscore-table",
  "description": "\nYou can see the Players with the best Highscores who played the game",
  "name": "Highscore Table",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "highscore-table;show-highscore-table",
  "description": "",
  "name": "Show Highscore Table",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I started the Application",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press “Highscoreliste”",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should see “1”",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I should see “2”",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I should see “3”",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I should see “4”",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I should see “5”",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "SeleniumHandler.I_started_the_Application()"
});
formatter.result({
  "duration": 55798,
  "status": "passed"
});
formatter.match({
  "location": "HighscoreTable.I_press_Highscoreliste()"
});
formatter.result({
  "duration": 348380063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 14
    }
  ],
  "location": "HighscoreTable.I_should_see_(int)"
});
formatter.result({
  "duration": 21397328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "HighscoreTable.I_should_see_(int)"
});
formatter.result({
  "duration": 10997033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "HighscoreTable.I_should_see_(int)"
});
formatter.result({
  "duration": 13623293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "HighscoreTable.I_should_see_(int)"
});
formatter.result({
  "duration": 11371666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 14
    }
  ],
  "location": "HighscoreTable.I_should_see_(int)"
});
formatter.result({
  "duration": 16238063,
  "status": "passed"
});
});