package com.stepdef;

import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudioClass extends BaseClass {
	public static Pojoclass pojo;
	
	

@Given("user login into studio appliction")
public void userLoginIntoStudioAppliction() throws IOException {
	
   launchChrome();
   winMax();
   String Urlload = proptxt("Urlload");
   loadUrl(Urlload);
   pojo = new Pojoclass();
	 implicit(10);
	 btnClick(pojo.login);
}

@Given("user will enter the user name")
public void userWillEnterTheUserName(DataTable d) {
	List<String> li = d.asList();
	String username = li.get(0);
	fill(pojo.username,username); 
}

@Given("user will enter the password")
public void userWillEnterThePassword(DataTable d) {
	List<String> li = d.asList();
	String passcode=li.get(0);
   fill(pojo.password, passcode);
}

@Then("user will clicks the login button")
public void userWillClicksTheLoginButton() throws IOException {
  btnClick(pojo.loginclick);
  //screenshot("./certa/screenshot", "sample");
}

@Then("user will drag and drop the swimlane into field")
public void userWillDragAndDropTheSwimlaneIntoField() throws InterruptedException, IOException {
	Thread.sleep(3000);
	btnClick(pojo.studio);
	
   
}

@Then("user will enter the name and click save button")
public void userWillEnterTheNameAndClickSaveButton11() {
    
}

@Then("user will drag and drop step into the swimlane")
public void userWillDragAndDropStepIntoTheSwimlane() {
   
}

@Then("user will enter the Name and click save button")
public void userWillEnterTheNameAndClickSaveButton1() {
   
}

@Then("user will drag and drop the field into step")
public void userWillDragAndDropTheFieldIntoStep() {
   
}

@Then("user will Enter the name and click save button")
public void userWillEnterTheNameAndClickSaveButton() {
   
}
	

}
