$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
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
  "name": "User is on Home Page2",
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
  "location": "GoToPageStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 11790345756,
  "status": "passed"
});
formatter.match({
  "location": "NavigateLoginStepdefs.userNavigateToLogInPage()"
});
formatter.result({
  "duration": 130552,
  "status": "passed"
});
formatter.match({
  "location": "UserPassStepdefs.userEntersUserNameAndPassword()"
});
formatter.result({
  "duration": 103045,
  "status": "passed"
});
formatter.match({
  "location": "MessageDisplayStepdefs.messageDisplayedLoginSuccessfully()"
});
formatter.result({
  "duration": 98119,
  "status": "passed"
});
formatter.uri("sample2.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action 2",
  "description": "",
  "id": "login-action-2",
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
  "id": "login-action-2;successful-login-with-valid-credentials",
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
  "duration": 10538901479,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cotwn – [Just another WordPress site]\u003e but was:\u003cotwn – [Werkgroep testautomatisering]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat ChromeTestStepdefs.userIsOnHomePage(ChromeTestStepdefs.java:16)\r\n\tat ✽.Given User is on Home Page(sample2.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NavigateLoginStepdefs.userNavigateToLogInPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserPassStepdefs.userEntersUserNameAndPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MessageDisplayStepdefs.messageDisplayedLoginSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
});