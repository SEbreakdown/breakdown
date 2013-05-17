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
  "duration": 280767350,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t invoke de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application() in file:/home/michael/git/breakdown/build/classes/\n\tat cucumber.runtime.Utils.invoke(Utils.java:38)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:30)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:45)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:248)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:76)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:65)\n\tat cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:20)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.FeatureRunner.run(FeatureRunner.java:72)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:76)\n\tat cucumber.junit.Cucumber.runChild(Cucumber.java:36)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n\tat cucumber.junit.Cucumber.run(Cucumber.java:81)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\nCaused by: java.lang.RuntimeException: Could not contact Selenium Server; have you started it on \u0027localhost:4444\u0027 ?\nRead more at http://seleniumhq.org/projects/remote-control/not-started.html\nConnection refused\n\tat com.thoughtworks.selenium.DefaultSelenium.start(DefaultSelenium.java:104)\n\tat de.se.tinf11b3.breakdown.tests.guitests.SchwierigkeitsgradWaehlen.I_started_the_Application(SchwierigkeitsgradWaehlen.java:22)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:616)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\t... 31 more\n"
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
});