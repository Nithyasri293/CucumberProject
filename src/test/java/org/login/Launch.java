package org.login;

import org.test.BaseClass;

import io.cucumber.java.en.Given;

public class Launch extends BaseClass {
	
	@Given("User is in flipkart login page")
	public void user_is_in_flipkart_login_page() {
	    browserLaunch();
	    urlLaunch("https://www.flipkart.com");
	}

	@Given("User is in Amazon login page")
	public void user_is_in_Amazon_login_page() {
		browserLaunch();
	    urlLaunch("https://www.amazon.in");
	}

	@Given("User is in shopclues login page")
	public void user_is_in_shopclues_login_page() {
		browserLaunch();
	    urlLaunch("https://www.shopclues.com");
	}

	@Given("User is in Meesho login page")
	public void user_is_in_Meesho_login_page() {
		browserLaunch();
	    urlLaunch("https://www.meesho.com");
	}

	@Given("User is in ajio page")
	public void user_is_in_ajio_page() {
		browserLaunch();
	    urlLaunch("https://www.ajio.com");
	}

	@Given("User is in Myntra login page")
	public void user_is_in_Myntra_login_page() {
		browserLaunch();
	    urlLaunch("https://www.myntra.com");
	}

	@Given("User is in shopsy login page")
	public void user_is_in_shopsy_login_page() {
		browserLaunch();
	    urlLaunch("https://www.shopsy.in");
	}

	@Given("User is in Max login page")
	public void user_is_in_Max_login_page() {
		browserLaunch();
	    urlLaunch("https://www.maxfashion.in");
	}

	@Given("User is in trends page")
	public void user_is_in_trends_page() {
		browserLaunch();
	    urlLaunch("https://trends.ajio.com/");
	}

	@Given("User is in hm page")
	public void user_is_in_hm_page() {
		browserLaunch();
	    urlLaunch("https://www.hm.com");
	}



}
