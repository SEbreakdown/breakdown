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
  "duration": 145215113,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: java.lang.RuntimeException: Could not start Selenium session: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:109)\n\tat de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application(SchwierigkeitsgradWaehlen.java:26)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:601)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\nCaused by: com.thoughtworks.selenium.SeleniumException: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:121)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.doCommand(HttpCommandProcessor.java:101)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getString(HttpCommandProcessor.java:275)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.start(HttpCommandProcessor.java:237)\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:100)\n\t... 37 more\nCaused by: java.net.ConnectException: Verbindungsaufbau abgelehnt\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:391)\n\tat java.net.Socket.connect(Socket.java:579)\n\tat java.net.Socket.connect(Socket.java:528)\n\tat sun.net.NetworkClient.doConnect(NetworkClient.java:180)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:378)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:473)\n\tat sun.net.www.http.HttpClient.\u003cinit\u003e(HttpClient.java:203)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:290)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:306)\n\tat sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:995)\n\tat sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:931)\n\tat sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:849)\n\tat sun.net.www.protocol.http.HttpURLConnection.getOutputStream(HttpURLConnection.java:1090)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getOutputStreamWriter(HttpCommandProcessor.java:149)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getCommandResponseAsString(HttpCommandProcessor.java:176)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:118)\n\t... 41 more\n"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Leicht()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Mittel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_press_Spiel_starten()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SchwierigkeitsgradWaehlen.I_should_see_Schwer()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri('de/se/tinf11b3/breakdown/tests/enter_highscore.feature');
formatter.feature({
  "id": "enter-highscore",
  "description": "\nAfter the game finished, you can enter your name into the highscore list",
  "name": "Enter Highscore",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "enter-highscore;enter-highscorename",
  "description": "",
  "name": "Enter Highscorename",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I finished the Game",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I enter a name",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should see “OK”",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I press “OK”",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "I should see “Highscore Table”",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "EnterHighscoreTest.I_finished_the_Game()"
});
formatter.result({
  "duration": 446812,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.EnterHighscoreTest.I_finished_the_Game() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: cucumber.runtime.PendingException: TODO: implement me\n\tat de.se.tinf11b3.breakdown.tests.guitests.EnterHighscoreTest.I_finished_the_Game(EnterHighscoreTest.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:601)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\n"
});
formatter.match({
  "location": "EnterHighscoreTest.I_enter_a_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EnterHighscoreTest.I_should_see_OK()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EnterHighscoreTest.I_press_OK()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EnterHighscoreTest.I_should_see_Highscore_Table()"
});
formatter.result({
  "status": "skipped"
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
  "location": "SchwierigkeitsgradWaehlen.I_started_the_Application()"
});
formatter.result({
  "duration": 5296233,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: java.lang.RuntimeException: Could not start Selenium session: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:109)\n\tat de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application(SchwierigkeitsgradWaehlen.java:26)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:601)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\nCaused by: com.thoughtworks.selenium.SeleniumException: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:121)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.doCommand(HttpCommandProcessor.java:101)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getString(HttpCommandProcessor.java:275)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.start(HttpCommandProcessor.java:237)\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:100)\n\t... 37 more\nCaused by: java.net.ConnectException: Verbindungsaufbau abgelehnt\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:391)\n\tat java.net.Socket.connect(Socket.java:579)\n\tat java.net.Socket.connect(Socket.java:528)\n\tat sun.net.NetworkClient.doConnect(NetworkClient.java:180)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:378)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:473)\n\tat sun.net.www.http.HttpClient.\u003cinit\u003e(HttpClient.java:203)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:290)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:306)\n\tat sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:995)\n\tat sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:931)\n\tat sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:849)\n\tat sun.net.www.protocol.http.HttpURLConnection.getOutputStream(HttpURLConnection.java:1090)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getOutputStreamWriter(HttpCommandProcessor.java:149)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getCommandResponseAsString(HttpCommandProcessor.java:176)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:118)\n\t... 41 more\n"
});
formatter.match({
  "location": "Game_Description.I_press_Spielbeschreibung()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Game_Description.I_should_see_Spielverlauf()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Game_Description.I_should_see_Steuerung()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri('de/se/tinf11b3/breakdown/tests/gameplay.feature');
formatter.feature({
  "id": "gameplay",
  "description": "\nDescribes the User interaction while the game is running",
  "name": "Gameplay",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "gameplay;play-the-game",
  "description": "",
  "name": "Play the Game",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I entered the Game",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I press a Key or a Mouse button",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "the Ball should start moving",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I press the left Arrow or move the Mouse left",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "the paddle should move left",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "I press the right Arrow or move the Mouse right",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "the paddle should move right",
  "keyword": "Then ",
  "line": 13
});
formatter.match({
  "location": "GameplayTest.I_entered_the_Game()"
});
formatter.result({
  "duration": 441270,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.GameplayTest.I_entered_the_Game() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: cucumber.runtime.PendingException: TODO: implement me\n\tat de.se.tinf11b3.breakdown.tests.guitests.GameplayTest.I_entered_the_Game(GameplayTest.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:601)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\n"
});
formatter.match({
  "location": "GameplayTest.I_press_a_Key_or_a_Mouse_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GameplayTest.the_Ball_should_start_moving()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GameplayTest.I_press_the_left_Arrow_or_move_the_Mouse_left()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GameplayTest.the_paddle_should_move_left()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GameplayTest.I_press_the_right_Arrow_or_move_the_Mouse_right()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GameplayTest.the_paddle_should_move_right()"
});
formatter.result({
  "status": "skipped"
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
  "location": "SchwierigkeitsgradWaehlen.I_started_the_Application()"
});
formatter.result({
  "duration": 696271,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: java.lang.RuntimeException: Could not start Selenium session: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:109)\n\tat de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application(SchwierigkeitsgradWaehlen.java:26)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:601)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\nCaused by: com.thoughtworks.selenium.SeleniumException: Verbindungsaufbau abgelehnt\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:121)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.doCommand(HttpCommandProcessor.java:101)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getString(HttpCommandProcessor.java:275)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.start(HttpCommandProcessor.java:237)\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:100)\n\t... 37 more\nCaused by: java.net.ConnectException: Verbindungsaufbau abgelehnt\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:339)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:200)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:182)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:391)\n\tat java.net.Socket.connect(Socket.java:579)\n\tat java.net.Socket.connect(Socket.java:528)\n\tat sun.net.NetworkClient.doConnect(NetworkClient.java:180)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:378)\n\tat sun.net.www.http.HttpClient.openServer(HttpClient.java:473)\n\tat sun.net.www.http.HttpClient.\u003cinit\u003e(HttpClient.java:203)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:290)\n\tat sun.net.www.http.HttpClient.New(HttpClient.java:306)\n\tat sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:995)\n\tat sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:931)\n\tat sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:849)\n\tat sun.net.www.protocol.http.HttpURLConnection.getOutputStream(HttpURLConnection.java:1090)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getOutputStreamWriter(HttpCommandProcessor.java:149)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.getCommandResponseAsString(HttpCommandProcessor.java:176)\n\tat com.thoughtworks.selenium.HttpCommandProcessor.executeCommandOnServlet(HttpCommandProcessor.java:118)\n\t... 41 more\n"
});
formatter.match({
  "location": "HighscoreTable.I_press_Highscoreliste()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
});