package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Base.JVMReports;
//import com.stepdef.Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.CucumberOptions.SnippetType;


  @RunWith(Cucumber.class)
  @CucumberOptions(features="src/test/resources/Feature",glue="com.stepdef",dryRun=true,tags = "@smoke1", plugin = {"pretty" ,"html:target\\Reports\\html",
		  "junit:target\\Reports.xml", "json:target\\Reports\\JsonReports.json"
		  })

public class RunnerClass {

		
	  @AfterClass
	  public static void RepotsJVM() {
	  	JVMReports.cucumberReports(System.getProperty("user.dir")+"\\target\\Reports\\JsonReports.json");
	 
	  }




}
