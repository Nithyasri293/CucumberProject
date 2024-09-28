package org.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\login.feature",
                 glue="org.login",
                 dryRun = false,
                 plugin = {"pretty",
                		 "html:reports",
                		 "json:reports\\result.json",
                		 "junit:reports\\result.xml"})
public class Runner {

}
