package com.osa.runners;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.osa.base.Browser;
import com.osa.base.FileReading;
import com.osa.pages.AboutPage;
import com.osa.pages.ForumLoginPages;
import com.osa.pages.HomePage;
import com.osa.utility.Utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features={"src/test/java/com/osa/features"},
		glue={"com.osa.steps"},
		monochrome=true,
		tags={"@smoke"},
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		//strict = true,
		//dryRun=true,
		//tags= {"@Forum"}
		
		)
public class SmokeTest extends AbstractTestNGCucumberTests {
	private static Logger log=Utils.getLog(SmokeTest.class);
	Properties pr = FileReading.readFromProperties("src\\main\\resources\\File.properties");
	WebDriver dr;
	HomePage hp;
	ForumLoginPages flp;
@BeforeSuite
	 public void setJDBC() {
	log.info("+++++++++++Our test start from here++++++++");	               
	 }
@BeforeMethod
    public void osa_Home_Page_set_Up() {
	    dr=Browser.openBrowser((String) pr.get("chromeBrowser"));
	    dr.get((String) pr.get("url"));
	    hp=new HomePage(dr);	
		hp.clickForumButton(dr); 
		flp=new ForumLoginPages(dr);
		flp.typeUsername("arjuarju2015@gmail.com");
		flp.typePassword("Suhanaalvina2015$");
		flp.clickLoginButton();
}
@Test(priority=2)
	public void click_Class_Projects() {
	log.info("+++++++++++Using TestNg Automation Framework+++++++++++");
	dr.findElement(By.xpath("//a[text()='Class Projects']")).click();
	dr.findElement(By.xpath("//a[text()='Java']")).click();
	dr.findElement(By.xpath("//a[text()='Selenium']")).click();
	dr.findElement(By.xpath("//a[text()='TestNG']")).click();
	dr.findElement(By.xpath("//a[text()='Maven']")).click();
	dr.findElement(By.xpath("//a[text()='JDBC']")).click();
	dr.findElement(By.xpath("//a[text()='PageObjectModel']")).click();
	dr.findElement(By.xpath("//a[text()='API']")).click();
	dr.findElement(By.xpath("//a[text()='Completed FW']")).click();
	dr.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[9]/a")).click();
		}
@Test(priority=1)
public void click_Study_Materials() {
	log.info("+++++++++++Using TestNg Automation Framework+++++++++++");
	dr.findElement(By.xpath("//a[text()='Study Materials']")).click();
	dr.findElement(By.xpath("//a[text()='Discussion Board']")).click();
	dr.findElement(By.xpath("//a[text()='Student Page']")).click();
	dr.findElement(By.xpath("//a[text()='Profile']")).click();
	dr.findElement(By.xpath("//a[text()='Logout']")).click();
	   
	}

@AfterMethod
public void close_the_browser() {
	   dr.close();
	}

@AfterSuite
	 public void emailReports() {
		 log.info("+++++++++The report has been send+++++++++");
	 }
}

