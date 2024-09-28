package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IciciLogin{
	
	@Given("User enter the firstname and surname")
	public void user_enter_the_firstname_and_surname() {
	    System.out.println("Enter firstname and surname");
	}

	@Given("User enter the email")
	public void user_enter_the_email() {
		System.out.println("Enter email");
	}


	@When("User enter the confirm email")
	public void user_enter_the_confirm_email() {
	    System.out.println("Enter the confirm email");
	}

	@Then("user enter the password")
	public void user_enter_the_password() {
	    System.out.println("Enter password");
	}




}
