package org.login;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.test.Pojo;

import com.test.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User is in Amazon page")
	public void user_is_in_Amazon_page() {
		browserLaunch();
	    urlLaunch("https://www.amazon.in");
	}

	@Given("User click the search box and search a product")
	public void user_click_the_search_box_and_search_a_product() {
		Pojo l=new Pojo();
	    WebElement searchButton = l.getSearchButton();
	    click(searchButton);
	    fillText(searchButton, "redmi 12 5g");
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		Pojo l=new Pojo();
     WebElement searchProduct = l.getSearchProduct();
        click(searchProduct);
	}

	@When("User select a product")
	public void user_select_a_product() {
		Pojo l=new Pojo();
		WebElement selectProduct = l.getSelectProduct();
		click1(selectProduct);
	    
	}

	@Then("User has add a product to the cart")
	public void user_has_add_a_product_to_the_cart() {
		windowHandles();
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println(windowHandles);
	    Pojo l=new Pojo();
	    WebElement addToCart = l.getAddToCart();
	    click1(addToCart);
	}



}
