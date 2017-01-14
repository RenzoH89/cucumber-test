$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/sample.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@java-sample"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sample-run"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Navigate to Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ChromeTestStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 11031094668,
  "status": "passed"
});
formatter.match({
  "location": "NavigateLoginStepdefs.userNavigateToLogInPage()"
});
formatter.result({
  "duration": 45554,
  "status": "passed"
});
formatter.match({
  "location": "UserPassStepdefs.userEntersUserNameAndPassword()"
});
formatter.result({
  "duration": 38874,
  "status": "passed"
});
formatter.match({
  "location": "MessageDisplayStepdefs.messageDisplayedLoginSuccessfully()"
});
formatter.result({
  "duration": 34144,
  "status": "passed"
});
});