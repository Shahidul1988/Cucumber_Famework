
	package com.osa.steps;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;

	public class Hooks {
	 @Before
	 public void beforeScenarios() {
	 System.out.println("This is from Before scenario");
	 }
	 @After
	 public void afterScenario() {
	 System.out.println("This is from After scenario");
	 }
	//Tag Hooks run before and after scenario
 	 @Before("@forum")
	 public void speceficbeforeScenario() {
	 System.out.println("===============This is from Before hook================");
	 }
	 @After("@forum")
     public void speceficafterScenarios() {
	 System.out.println("===============This is from After hook================");
	 }

	 }


