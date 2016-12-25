$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testSuites.feature");
formatter.feature({
  "line": 1,
  "name": "This will check the Google website if it is running and search, else throw error",
  "description": "",
  "id": "this-will-check-the-google-website-if-it-is-running-and-search,-else-throw-error",
  "keyword": "Feature"
});
formatter.before({
  "duration": 239708,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is firt test suite",
  "description": "",
  "id": "this-will-check-the-google-website-if-it-is-running-and-search,-else-throw-error;this-is-firt-test-suite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "test scenario one given",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "test scenario one when",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "test scenario one then",
  "keyword": "Then "
});
formatter.match({
  "location": "RunnerTestSuite1.test_scenario_one_given()"
});
formatter.result({
  "duration": 4450578,
  "status": "passed"
});
formatter.match({
  "location": "RunnerTestSuite1.test_scenario_one_when()"
});
formatter.result({
  "duration": 117571,
  "status": "passed"
});
formatter.match({
  "location": "RunnerTestSuite1.test_scenario_one_then()"
});
formatter.result({
  "duration": 241230,
  "status": "passed"
});
formatter.after({
  "duration": 57073,
  "status": "passed"
});
formatter.uri("testSuites2.feature");
formatter.feature({
  "line": 1,
  "name": "This will check the Google website if it is running and search, else throw error",
  "description": "",
  "id": "this-will-check-the-google-website-if-it-is-running-and-search,-else-throw-error",
  "keyword": "Feature"
});
formatter.before({
  "duration": 66586,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is third test suite",
  "description": "",
  "id": "this-will-check-the-google-website-if-it-is-running-and-search,-else-throw-error;this-is-third-test-suite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "test scenario three given",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "test scenario three when",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "test scenario three then",
  "keyword": "Then "
});
formatter.match({
  "location": "RunnerTestSuite2.test_scenario_three_given()"
});
formatter.result({
  "duration": 458109,
  "status": "passed"
});
formatter.match({
  "location": "RunnerTestSuite2.test_scenario_three_when()"
});
formatter.result({
  "duration": 89796,
  "status": "passed"
});
formatter.match({
  "location": "RunnerTestSuite2.test_scenario_three_then()"
});
formatter.result({
  "duration": 77239,
  "status": "passed"
});
formatter.after({
  "duration": 75337,
  "status": "passed"
});
});