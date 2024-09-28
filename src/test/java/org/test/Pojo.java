package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	public Pojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindAll({
		@FindBy(xpath="//input[@id='twotabsearchtextbox']"),
		@FindBy(name="search")
	})
	private WebElement searchButton;
	
	public WebElement getCart() {
		return cart;
	}

	@FindAll({
		@FindBy(xpath="(//input[@type='submit'])[1]"),
		@FindBy(xpath="//input[@id='nav-search-submit-button']")
	})
	private WebElement searchProduct;

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchProduct() {
		return searchProduct;
	}
	
	public WebElement getSelectProduct() {
		return selectProduct;
	}

	@FindBy(xpath="(//span[text()='Redmi 12 5G Jade Black 6GB RAM 128GB ROM'])[1]")
	private WebElement selectProduct;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	private WebElement addToCart;
	
	@FindBys({
	@FindBy(xpath="//input[@fdprocessedid='vgjpjc']"),
	@FindBy(xpath="(//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce'])[1]")
	})
	private WebElement cart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindAll({
		
	@FindBy(name="pass"),
	@FindBy(id="user")
	})
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="pass")
	private WebElement invalidPass;
	
	
	public WebElement getInvalidPass() {
		return invalidPass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotPassword;
	
	@FindBy(id="identify_email")
	private WebElement mobileNo;
	
	@FindBy(name="did_submit")
	private WebElement  search;





}
