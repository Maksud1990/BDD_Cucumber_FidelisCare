package com.fidelis.runners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java/com/fidelis/features"},
		glue={"com.fidelis.steps"},
		monochrome=true,
		tags={"@regression"},
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		//strict = true
		//dryRun=true
		//tags= {"@Login"}
		
		)

public class RegressionTest extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("$$$$$$$$$$$Running before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("=====Running after suite=====");
	}

}

