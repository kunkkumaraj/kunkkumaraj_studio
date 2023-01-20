package com.stepdef;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;
import com.log4j.PropertiesLog4j;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class Hooks extends BaseClass{
	static Logger L= Logger.getLogger(Hooks.class);
	@Before
	
		public void Log4j() {
			PropertyConfigurator.configure("Log4j.properties");
			L.debug("This is a debug message");
			L.info("This is an info");
			L.warn("This is a warning");
			L.error("This is an error");

			
		}
	
	@After
	public void takescreenshotonfailure(Scenario s) {
		
	if (s.isFailed())	{
	
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		
		s.attach(src, "image/png", "screenshot");
	
	}
		
			
		}
		

}

