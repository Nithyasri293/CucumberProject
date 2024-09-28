@facebook
Feature: To validate signup in Facebook page

Background:
   Given User is in facebook login page
@page
Scenario: To validate create a new account in facebook login page
	And User enter the firstname and surname
	And User enter the email
	When User enter the confirm email
	And user enter the password
	And User selects DateOfBirth
	And user selects Gender
	Then user sign up
	