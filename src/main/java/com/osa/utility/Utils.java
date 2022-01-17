package com.osa.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;

public class Utils {
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}

	public static void verifyTitle(String actual, String expected) {
		if(actual.equals(expected)) {
			System.out.println("The actual and Expected value matches!!!!!");
		}else {
			System.out.println("===== LOOK HERE =======");
		    System.out.println("Actual Value: "+actual);
		    System.out.println("Expected Value: "+expected);
		    Assert.assertEquals(actual, expected);
		}	
		
	}
}
