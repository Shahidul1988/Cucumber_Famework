package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class InterviewQuestions {
	private static Logger log=Utils.getLog(InterviewQuestions.class);
	 WebDriver dr;
	 ForumLoginPages flp;

		public InterviewQuestions(WebDriver dr) {
			this.dr = dr;
			PageFactory.initElements(dr, this);
		}
			@FindBy(xpath="//*[@id=\"Java\"]") WebElement java;
			@FindBy(xpath="//a[text()='Selenium']") WebElement selenium;
			@FindBy(xpath="//a[text()='Cucumber']") WebElement cucumber;
			@FindBy(xpath="//a[text()='Behavioral']") WebElement behavioral;
			@FindBy(xpath="//a[text()='TestNG']") WebElement testNG;
			@FindBy(xpath="//a[text()='log4j']") WebElement log4j ;
			@FindBy(xpath="//a[text()='ITestListener']") WebElement iTestListner ;
			@FindBy(xpath="//a[text()='API']") WebElement api;
			@FindBy(xpath="//a[text()='Data Structure']") WebElement data_Structure;
			@FindBy(xpath="//a[text()='Common Interview Q']") WebElement Common_Interview_Q;
			@FindBy(xpath="//a[text()='sql']") WebElement sql;
			@FindBy(xpath="//*[@id=\"cssmenu\"]/ul/li[12]/a") WebElement student_page;
			  public void clickJava() {
					log.info("+++++++User is clicking on login button+++++++");
					java.click();
				  }
			  public void clickSelenium() {
					log.info("+++++++User is clicking on selenium button+++++++++++");
					selenium.click();
				  }
			  public void clickCucumber() {
					log.info("++++++++User is clicking on cucumber button++++++++++");
					cucumber.click();
				  }
			  public void clickBehavioral() {
					log.info("++++++++User is clicking on behavioral button+++++++++");
					behavioral.click();
				  }
			  public void clickTestNG() {
					log.info("+++++++User is clicking on testNG button++++++");
					testNG.click();
				  }
			  public void clickLog4j() {
					log.info("++++++User is clicking on Log4j button++++++++");
					log4j.click();
				  }
			  public void clickITestListner() {
					log.info("++++++User is clicking on ITestListner button++++++");
					iTestListner.click();
				  }
			  public void clickAPI() {
					log.info("++++++User is clicking on API button++++++");
					api.click();
				  }
			  
			  public void clickCommon_Interview_Q() {
					log.info("++++++++User is clicking on Common_Interview_Q button++++++");
					Common_Interview_Q.click();
				  }
			  public void clickSql() {
					log.info("++++++User is clicking on sql button++++++");
					sql.click();
				  }
			  public void clickOnStudent_Page() {
				  log.info("++++++User is clicking on Student_Page button++++++++");
					  student_page.click();
					  }
			
			public void clickData_Structure() {
				log.info("+++++++User is clicking on Data_Structure button+++++++");
				data_Structure.click();
				
			}
}
