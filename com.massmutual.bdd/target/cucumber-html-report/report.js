$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("npvTest.feature");
formatter.feature({
  "line": 1,
  "name": "Test Validation",
  "description": "",
  "id": "test-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify npv page elements",
  "description": "",
  "id": "test-validation;verify-npv-page-elements",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to npv page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I verify right number of values appeared on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify all the values appeared are greater than zero",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify total balance matched the sum of the values",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify all the values are formatted as currencies",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify given total balance is correct",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I complete my test",
  "keyword": "And "
});
formatter.match({
  "location": "NpvValidationStepDef.I_launch_the_browser()"
});
formatter.result({
  "duration": 4654996938,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_navigate_to_npv_page()"
});
formatter.result({
  "duration": 785817679,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_verify_right_number_of_values_appeared_on_the_screen()"
});
formatter.result({
  "duration": 30420,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_verify_all_the_values_appeared_are_greater_than_zero()"
});
formatter.result({
  "duration": 18172,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_verify_total_balance_matched_the_sum_of_the_values()"
});
formatter.result({
  "duration": 23704,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_verify_all_the_values_are_formatted_as_currencies()"
});
formatter.result({
  "duration": 18568,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_verify_given_total_balance_is_correct()"
});
formatter.result({
  "duration": 18568,
  "status": "passed"
});
formatter.match({
  "location": "NpvValidationStepDef.i_complete_my_test()"
});
formatter.result({
  "duration": 649763556,
  "status": "passed"
});
});