package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class StudentPage {
	private static Logger log=Utils.getLog(StudentPage.class);
	 WebDriver dr;
	 ForumLoginPages hp;
		
		public StudentPage(WebDriver dr) {
			this.dr = dr;
			PageFactory.initElements(dr, this);	
		}
		@FindBy(xpath="//a[contains(text(),'Interview Questiones')]") WebElement interview_questiones;
		
		@FindBy(xpath="//a[text()='sql']") WebElement logout;
		  public void clickOnLogout() {
			  log.info("+++++++User is clicking on Logout button+++++++");
			  logout.click();
			  }
		
		
		 public InterviewQuestions clickOnInterview_Questiones() {
			  log.info("++++User is clicking on Interview_Questiones button++++");
			  interview_questiones.click();
			  
		return new InterviewQuestions(dr);
		 }
	
}
