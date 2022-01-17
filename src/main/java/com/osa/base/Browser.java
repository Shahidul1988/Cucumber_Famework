package com.osa.base;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.osa.utility.Utils;

public class Browser {
	private static Logger log=Utils.getLog(Browser.class);
	public static WebDriver openBrowser(String driver) { 
		WebDriver dr=null;
		log.info("Our system running on "+System.getProperty("os.name")+" driver is "+driver);
		if(System.getProperty("os.name").toLowerCase().contains("windows")) {
			if(driver.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\windows\\chromedriver.exe");
				dr=new ChromeDriver();
			}else if(driver.toLowerCase().equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\windows\\geckodriver.exe");
				dr=new FirefoxDriver();
			}
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //webDirver wait
		}
		else {
			log.info("Our system running on "+System.getProperty("os.name")+" driver is "+driver);
			if(driver.toLowerCase().equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/mac/chromedriver");
				dr=new ChromeDriver();
			}else if(driver.toLowerCase().equals("firefox")) {
				System.setProperty("", "");
				dr=new FirefoxDriver();
			}
		}
		return dr;
	}
}
