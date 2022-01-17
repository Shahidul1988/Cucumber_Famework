package com.osa.pages;

import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

import com.osa.utility.Utils;

public class HomePage {
	private static Logger log=Utils.getLog(HomePage.class);
    WebDriver dr;
	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	@FindBy(xpath="//a[contains(text(),'Forum')]") 
	WebElement forumButton;
	
	public ForumLoginPages clickForumButton(WebDriver dr) {
		 
		log.info("+++++++User is clicking on forum button+++++++");
		forumButton.click();
		//log.info("User has clicked forum button");
		return new ForumLoginPages(dr);
		
	}

}

