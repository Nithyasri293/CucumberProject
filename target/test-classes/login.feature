@smoke
Feature: To validate Login functionality in Facebook Application.

Background: To validate login process  
    Given User is in facebook login page
    
    
  @login
  Scenario: To validate login with different credentials
     
  When User enter invalid username and password.
  And User click Login button.
  Then User should be in invalid credential page.
  
  @invalidpassword
   Scenario Outline: To validate searching the account using mobile when user forgot the password
      Given User navigate to facebook login page
      When User clicks forgotten password link
      And User seaches  the account using invalid mobilenumber"<mobileno>"
      Then User is displayed with error message
      
      Examples:
           |mobileno|
           |5488795632213222|
  
