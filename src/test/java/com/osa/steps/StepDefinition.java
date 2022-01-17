package com.osa.steps;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;
import com.osa.base.FileReading;
import com.osa.pages.AboutPage;
import com.osa.pages.ForumLoginPages;
import com.osa.pages.HomePage;
import com.osa.pages.InterviewQuestions;
import com.osa.pages.StudentPage;
import com.osa.utility.Utils;

import io.cucumber.java.en.*;

public class StepDefinition {
	Properties pr = FileReading.readFromProperties("src\\main\\resources\\File.properties");	
	WebDriver dr;
	ForumLoginPages flp;
	HomePage hp;
	StudentPage sp;
	InterviewQuestions ip;
	AboutPage bt;

	@Given("I have to open chrome browser")
	public void i_have_to_open_chrome_browser() {
		dr=Browser.openBrowser((String) pr.get("chromeBrowser")); 
	}

	@When("Navigate to osa  Home page")
	public void navigate_to_osa_Home_page() {
		dr.get((String) pr.get("url"));
	}

	@And("I have to click on forum button")
	public void i_have_to_click_on_forum_button() {
		hp=new HomePage(dr);	
		hp.clickForumButton(dr); 
	}

	@And("I enter username password")
	public void i_enter_username_password(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>>data=dataTable.asLists();
		String username=data.get(0).get(0);
		String password=data.get(0).get(1);
		flp=new ForumLoginPages(dr);
		flp.typeUsername(username);
		flp.typePassword(password);
	}
	@And("press the login button")
	public void press_the_login_button() {
		flp.clickLoginButton(); 
	}

	@And("I verify the title")
	public void i_verify_the_title() {
		String actual= dr.getTitle();
		String expacted="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		Utils.verifyTitle(actual, expacted);
	}

	@Then("I have to click the About page")
	public void i_have_to_click_the_About_page() {
		bt = new AboutPage(dr);
		bt.clickAboutButton();
	}

	@And("After clicking i need to verify the title")
	public void after_clicking_i_need_to_verify_the_title() {
		String actual= dr.getTitle();
		String expected="OSA Consulting Tech - Take all steps for your career.";
		Utils.verifyTitle(actual, expected);
	}

	@And("I will click This three buttons Our_Mission Our_Vision & Our_Value")
	public void i_will_click_This_three_buttons_Our_Mission_Our_Vision_Our_Value() {
		bt.clickOurMission();
		bt.clickOurVision();
		bt.clickOurValue();
	}
	@And("I have to close the browser")
	public void i_have_to_close_the_browser() {
		dr.close();

	}
}