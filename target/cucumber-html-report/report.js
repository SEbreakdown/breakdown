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
  "location": "SchwierigkeitsgradWaehlen.I_started_the_Application()"
});
formatter.result({
  "duration": 8470117905,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 1408100020,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Leicht()"
});
formatter.result({
  "duration": 104554071,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 1081237378,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Mittel()"
});
formatter.result({
  "duration": 74578445,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "duration": 838753383,
  "status": "passed"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Schwer()"
});
formatter.result({
  "duration": 74627995,
  "status": "passed"
});
});