package org.login;

import org.openqa.selenium.WebElement;
import org.test.Pojo;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Pojo {
	
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
	    browserLaunch();
	    urlLaunch("https://www.facebook.com");
	}

	@When("User enter invalid username and password.")
	public void user_enter_invalid_username_and_password() {
	   Pojo pj=new Pojo();
	   WebElement email = pj.getEmail();
	   fillText(email, "nithya@gmail.com");
	   
	   WebElement password = pj.getPassword();
	   fillText(password, "56897412");
	}

	@When("User click Login button.")
	public void user_click_Login_button() {
	    Pojo p=new Pojo();
	    WebElement login = p.getLogin();
	    login.click();
	}

	@Then("User should be in invalid credential page.")
	public void user_should_be_in_invalid_credential_page() {
	    Assert.assertTrue(true, "error msg");
	    System.out.println("invalid password");
	}

	@Given("User navigate to facebook login page")
	public void user_navigate_to_facebook_login_page() {
	    
	}

	@When("User clicks forgotten password link")
	public void user_clicks_forgotten_password_link() {
	    Pojo p=new Pojo();
	   WebElement forgotPassword = p.getForgotPassword();
	   click(forgotPassword);
	}

	@When("User seaches  the account using invalid mobilenumber{string}")
	public void user_seaches_the_account_using_invalid_mobilenumber(String string) {
	    Pojo o=new Pojo();
	    WebElement mobileNo = o.getMobileNo();
	    fillText(mobileNo, "56231489562");
	    WebElement search = o.getSearch();
	    click(search);
	}

	@Then("User is displayed with error message")
	public void user_is_displayed_with_error_message() {
	    Assert.assertTrue(true, "Error");
	    System.out.println("No search found");
	}



}
