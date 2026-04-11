package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Register {
	
@Given("^ I launch the application$")

public void i_launch_the_application() {
	Base.driver.get(Base.reader.getUrl());
	
}
@When("^I provide all the below valid details$")
public void i_provide_all_the_below_valid_details(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}

@When("^I select the Privacy Policy$")
public void i_select_the_Privacy_Policy() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on Continue button$")
public void i_click_on_Continue_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see that the User Account has successfully created$")
public void i_should_see_that_the_User_Account_has_successfully_created() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


}
