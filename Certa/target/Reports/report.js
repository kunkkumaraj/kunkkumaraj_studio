$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/studio.feature");
formatter.feature({
  "name": "to verfiy the functionality of studio application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "to validate the funtionality of slackcart login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@run1"
    }
  ]
});
formatter.step({
  "name": "user login into studio appliction",
  "keyword": "Given "
});
formatter.match({
  "location": "StudioClass.userLoginIntoStudioAppliction()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the user name",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillEnterTheUserName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the password",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillEnterThePassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will clicks the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StudioClass.userWillClicksTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will drag and drop the swimlane into field",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillDragAndDropTheSwimlaneIntoField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the name and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillEnterTheNameAndClickSaveButton11()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will drag and drop step into the swimlane",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillDragAndDropStepIntoTheSwimlane()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter the Name and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillEnterTheNameAndClickSaveButton1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will drag and drop the field into step",
  "keyword": "Then "
});
formatter.match({
  "location": "StudioClass.userWillDragAndDropTheFieldIntoStep()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will Enter the name and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "StudioClass.userWillEnterTheNameAndClickSaveButton()"
});
formatter.result({
  "status": "passed"
});
});