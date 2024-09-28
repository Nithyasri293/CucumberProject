package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	private void beforeScenario() {
		System.out.println("BEFORE");

	}
	
	@After
	private void afterScenario() {
		System.out.println("AFTER");

	}

}
