package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class ForumLoginPages {
	 WebDriver dr;
	 ForumLoginPages flp ;
	 HomePage hp;
	private static Logger log=Utils.getLog(ForumLoginPages.class);
	
		public ForumLoginPages(WebDriver dr) {
			this.dr = dr;
			PageFactory.initElements(dr, this);	
		}
	@FindBy(name="username") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(id="login_button") WebElement login;
	  public void typeUsername(String username) {
		log.info("+++++++User is typing the username+++++++");
		userName.sendKeys(username);
	  }
	  public void typePassword(String Password) {
		log.info("+++++++User is typing the password+++++++");
		password.sendKeys(Password);
	  }
	  public StudentPage clickLoginButton() {
		log.info("++++++User is clicking on login button++++");
		login.click(); 
	 return new StudentPage(dr);  
} 
}
