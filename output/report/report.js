$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/RailsSearch.feature");
formatter.feature({
  "name": "Verifying rails search repository page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify search repository",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on rails page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.i_am_on_rails_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"webpacker\" repository",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.i_search_for_repository(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"webpacker\" in the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_see_in_the_search_results(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify repository link navigation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on rails page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.i_am_on_rails_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"webpacker\" repository",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.click_on_repository(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"webpacker\" repository page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.i_should_see_repository_page_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});