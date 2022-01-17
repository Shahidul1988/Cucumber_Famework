package com.osa.steps;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.osa.base.Browser;
import com.osa.base.FileReading;
import com.osa.pages.ForumLoginPages;
import com.osa.pages.HomePage;
import com.osa.pages.InterviewQuestions;
import com.osa.pages.StudentPage;
import com.osa.utility.Utils;

import io.cucumber.java.en.*;

public class StepDefinitionOne {
	Properties pr = FileReading.readFromProperties("src\\main\\resources\\File.properties");	
	WebDriver dr;
	ForumLoginPages flp;
	HomePage hp;
	StudentPage sp;
	InterviewQuestions ip;

	@Given("I open chrome browser")
	public void i_open_chrome_browser() {
		dr=Browser.openBrowser((String) pr.get("chromeBrowser"));  
	}
	@When("I navigate to osa  Home_page")
	public void i_navigate_to_osa_Home_page() {
		dr.get((String) pr.get("url"));
	}
	@And("I have to verify Home_page")
	public void i_have_to_verify_Home_page() {
		String actual= dr.getTitle();
		String expacted="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		Utils.verifyTitle(actual, expacted);
	}

	@When("I click on forum button")
	public void i_click_on_forum_button() {
		hp=new HomePage(dr);	
		hp.clickForumButton(dr);  
	}

	@And("Now I have to type Username_{string}")
	public void now_I_have_to_type_Username(String username) {
		flp=new ForumLoginPages(dr);
		flp.typeUsername(username);   
	}

	@And("Next I have to type Password_{string}")
	public void next_I_have_to_type_Password(String password) {
		flp.typePassword(password); 
	}

	@Then("I have to press the login button")
	public void i_have_to_press_the_login_button() {
		flp.clickLoginButton(); 
	}

	@Then("Next i have to verify the student_page")
	public void next_i_have_to_verify_the_student_page() {
		String actual= dr.getTitle();
		String expacted="Student Page";
		Utils.verifyTitle(actual, expacted);
	}

	@Then("I click on interview questions button")
	public void i_click_on_interview_questions_button() {
		sp=new StudentPage(dr);
		sp.clickOnInterview_Questiones(); 
	}

	@Then("I have to verify interview_questions page")
	public void i_have_to_verify_interview_questions_page() {
		String actual= dr.getTitle();
		String expacted="Interview Questions";
		Utils.verifyTitle(actual, expacted);
	}
	@Then("I click on JAVA button")
	public void i_click_on_JAVA_button() {
		ip=new InterviewQuestions(dr);
		ip.clickJava();   
	}

	@Then("I click on SELENIUM button")
	public void i_click_on_SELENIUM_button() {
		ip.clickSelenium(); 
	}

	@Then("I click on CUCUMBER button")
	public void i_click_on_CUCUMBER_button() {
		ip.clickCucumber();  
	}

	@Then("I click on BEHAVIOURAL button")
	public void i_click_on_BEHAVIOURAL_button() {
		ip.clickBehavioral();    
	}

	@Then("I click on TESTNG button")
	public void i_click_on_TESTNG_button() {
		ip.clickTestNG();  
	}

	@Then("I click on LOG4J button")
	public void i_click_on_LOG4J_button() {
		ip.clickLog4j(); 
	}

	@Then("I click on ITESTLISTENER button")
	public void i_click_on_ITESTLISTENER_button() {
		ip.clickITestListner();
	}

	@Then("I click on API button")
	public void i_click_on_API_button() {
		ip.clickAPI();  
	}

	@Then("I click on DATA_STRUCTURE button")
	public void i_click_on_DATA_STRUCTURE_button() {
		ip.clickData_Structure();
	}

	@Then("I click on COMMOM_INTERVIEW_Q button")
	public void i_click_on_COMMOM_INTERVIEW_Q_button() {
		ip.clickCommon_Interview_Q(); 
	}

	@Then("I click on SQL button")
	public void i_click_on_SQL_button() {
		ip.clickSql();   
	}

	@Then("I click on STUDENT_PAGE button")
	public void i_click_on_STUDENT_PAGE_button() {
		ip.clickOnStudent_Page();
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
		dr.close();
	}
}