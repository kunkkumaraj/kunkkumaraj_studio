package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class PropertiesLog4j {
	static Logger L= Logger.getLogger(PropertiesLog4j.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("Log4j.properties");
		L.debug("This is a debug message");
		L.info("This is an info");
		L.warn("This is a warning");
		L.error("This is an error");

		
		
	}

}
