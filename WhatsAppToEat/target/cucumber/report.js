$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberTests\navigationSuche.feature');
formatter.feature({
  "id": "navigation-to-suche",
  "description": "",
  "name": "Navigation to Suche",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "navigation-to-suche;navigating-to-suche-should-take-the-user-to-the-suchen-page",
  "description": "",
  "name": "Navigating to Suche should take the User to the Suchen page",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "I am in \"Rezepte\"",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "I click on \"Suche\"",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "I should see the screen \"Suche\"",
  "keyword": "Then ",
  "line": 5
});
formatter.step({
  "name": "there should be a \"Algemeine Suche\" button",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "there should be a \"Zutatensuche\" button",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "Rezepte",
      "offset": 9
    }
  ],
  "location": "DepositStepDefinitions.I_am_in(String)"
});
formatter.result({
  "duration": 555324315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Suche",
      "offset": 12
    }
  ],
  "location": "DepositStepDefinitions.I_click_on(String)"
});
formatter.result({
  "duration": 33790,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Suche",
      "offset": 25
    }
  ],
  "location": "DepositStepDefinitions.I_should_see_the_screen(String)"
});
formatter.result({
  "duration": 38782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Algemeine Suche",
      "offset": 19
    }
  ],
  "location": "DepositStepDefinitions.there_should_be_a_button(String)"
});
formatter.result({
  "duration": 34174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zutatensuche",
      "offset": 19
    }
  ],
  "location": "DepositStepDefinitions.there_should_be_a_button(String)"
});
formatter.result({
  "duration": 23038,
  "status": "passed"
});
formatter.uri('cucumberTests\navigationVerwalten.feature');
formatter.feature({
  "id": "navigation-to-verwalten",
  "description": "",
  "name": "Navigation to Verwalten",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "navigation-to-verwalten;navigating-to-verwalten-should-take-the-user-to-the-verwalten-page",
  "description": "",
  "name": "Navigating to Verwalten should take the User to the Verwalten page",
  "keyword": "Scenario",
  "line": 2,
  "type": "scenario"
});
formatter.step({
  "name": "I am in \"Rezepte\"",
  "keyword": "Given ",
  "line": 3
});
formatter.step({
  "name": "I click on \"Verwalten\"",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "I should see the screen \"Verwalten\"",
  "keyword": "Then ",
  "line": 5
});
formatter.step({
  "name": "there should be a \"Liste anzeigen\" button",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "there should be a \"Neuer Eintrag\" button",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "Rezepte",
      "offset": 9
    }
  ],
  "location": "DepositStepDefinitions.I_am_in(String)"
});
formatter.result({
  "duration": 3390141,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Verwalten",
      "offset": 12
    }
  ],
  "location": "DepositStepDefinitions.I_click_on(String)"
});
formatter.result({
  "duration": 27263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Verwalten",
      "offset": 25
    }
  ],
  "location": "DepositStepDefinitions.I_should_see_the_screen(String)"
});
formatter.result({
  "duration": 23422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liste anzeigen",
      "offset": 19
    }
  ],
  "location": "DepositStepDefinitions.there_should_be_a_button(String)"
});
formatter.result({
  "duration": 27647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Neuer Eintrag",
      "offset": 19
    }
  ],
  "location": "DepositStepDefinitions.there_should_be_a_button(String)"
});
formatter.result({
  "duration": 26878,
  "status": "passed"
});
});