$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate Login functionality in Facebook Application.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "To validate login process",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with different credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User enter invalid username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_invalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Login button.",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page.",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate searching the account using mobile when user forgot the password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidpassword"
    }
  ]
});
formatter.step({
  "name": "User navigate to facebook login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks forgotten password link",
  "keyword": "When "
});
formatter.step({
  "name": "User seaches  the account using invalid mobilenumber\"\u003cmobileno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User is displayed with error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mobileno"
      ]
    },
    {
      "cells": [
        "5488795632213222"
      ]
    }
  ]
});
formatter.background({
  "name": "To validate login process",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate searching the account using mobile when user forgot the password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@invalidpassword"
    }
  ]
});
formatter.step({
  "name": "User navigate to facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigate_to_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User seaches  the account using invalid mobilenumber\"5488795632213222\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_seaches_the_account_using_invalid_mobilenumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is displayed with error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_displayed_with_error_message()"
});
formatter.result({
  "status": "passed"
});
});