$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/eclipse-workspace/TestDairyBDDFramework/src/main/java/Feature/hooking.feature");
formatter.feature({
  "line": 1,
  "name": "PayPal payment check",
  "description": "",
  "id": "paypal-payment-check",
  "keyword": "Feature"
});
formatter.before({
  "duration": 527400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Validate payment with PayPal profile",
  "description": "",
  "id": "paypal-payment-check;validate-payment-with-paypal-profile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user selects a invoice for payment",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters PayPal credentails",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on pay button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user performed PayPal payment successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "hookingStepDefination.select_invoice()"
});
formatter.result({
  "duration": 281474900,
  "status": "passed"
});
formatter.match({
  "location": "hookingStepDefination.enter_credentials()"
});
formatter.result({
  "duration": 173100,
  "status": "passed"
});
formatter.match({
  "location": "hookingStepDefination.click()"
});
formatter.result({
  "duration": 439500,
  "status": "passed"
});
formatter.match({
  "location": "hookingStepDefination.payment_done()"
});
formatter.result({
  "duration": 153100,
  "status": "passed"
});
formatter.after({
  "duration": 198700,
  "status": "passed"
});
});