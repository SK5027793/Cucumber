$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-workspace/TestDairyBDDFramework/src/main/java/Feature/homePage.feature");
formatter.feature({
  "line": 1,
  "name": "Tiltle check feature",
  "description": "",
  "id": "tiltle-check-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate title of home page",
  "description": "",
  "id": "tiltle-check-feature;validate-title-of-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user succeffuly landed on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user check for title of homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "homePageStepDefination.user_on_homePage()"
});
formatter.result({
  "duration": 32994765300,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.user_landed_on_homepage()"
});
formatter.result({
  "duration": 213300,
  "status": "passed"
});
formatter.match({
  "location": "homePageStepDefination.user_check_title()"
});
formatter.result({
  "duration": 15602600,
  "status": "passed"
});
});