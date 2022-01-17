package com.osa.runners;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.osa.utility.Utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features={"src/test/java/com/osa/features"},
		glue={"com.osa.steps"},
		monochrome=true,
		tags={"@regression"},
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		//strict = true
		//dryRun=true
		//tags= {"@Forum"}
		
		)
public class RegressionTest extends AbstractTestNGCucumberTests {
	private static Logger log=Utils.getLog(RegressionTest.class);
	@BeforeSuite
	 public void setJDBC() {
		log.info("++++++++Our Test start from here+++++++++++");
	 }
		@AfterSuite
	 public void emailReports() {
		 System.out.println("+++++++++The report has been send++++++++");
	 }
}

