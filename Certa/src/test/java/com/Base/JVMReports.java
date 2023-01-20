package com.Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	public static void cucumberReports(String jsonPath) {
		
File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JVMREPORTS");

Configuration con = new Configuration(f ,"kunkkumaraj");

con.addClassifications("Platforms", "window 10");
con.addClassifications("Browser", "Chrome");
con.addClassifications("Browser version", "104");
con.addClassifications("sprint", "1.1.1");
con.addClassifications("Name", "kunkkumaraj");


List<String> list = new ArrayList<String>();
		
list.add(jsonPath);


ReportBuilder r = new ReportBuilder(list, con);
r.generateReports();

	}

}
