package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Utils;

public class AboutPage {
	private static Logger log=Utils.getLog(AboutPage.class);
	WebDriver dr;
	public AboutPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[2]/a") 
WebElement aboutBox;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[1]/a") 
WebElement ourMissionButton;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[2]/a") 
WebElement ourVisionButton;
@FindBy(xpath="//*[@id=\"section-counter\"]/div/div/div[2]/div[2]/ul/li[3]/a") 
WebElement ourValueButton;

public void clickAboutButton() {	
	log.info("+++++++User is clicking on About button++++++++");
	aboutBox.click();
}
public void clickOurMission() {
	log.info("++++++User is clicking on Our_Mission button++++");
		ourMissionButton.click();
}
public void clickOurVision() {
	log.info("+++++++User is clicking on Our_Vision button++++++++");
	ourVisionButton.click();
}
public void clickOurValue() {
	log.info("++++++User is clicking on Our_Value button++++++++");
	ourValueButton.click();
}
}
