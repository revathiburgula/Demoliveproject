package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.MyAccountPage;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;

import io.cucumber.java.en.*;

public class Login {
	
	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
	
	@And("^I navigaye to Account Login page$")
	public void i_navigate_to_Account_Login_page()
	{
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}
	@When("I reset the forgotten password for email {string}")
	public void i_login_to_the_Application_using_Username_and_Password(String email ,String password)
	{
	LoginPage.doLogin(email, password);
	}
@Then("^I should see that the User is able to login successfully$")
public void i_should_see_that_the_User_is_able_to__login_successfully() {
	Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliadteAccount));
}
@Then("^I should see an error message that the credentails are invalid$")
public void i_should_see_an_error_message_that_the_credentails_are_invaild() {
	Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "Warning: No match for E-mail Address and/or Password."));
}

@When("^I reset the forgotten password for email \"([^\"]*)\"$")
public void i_reset_the_forgotten_password_for_email(String email) {
	
	Elements.click(LoginPage.forgotPassword);
	Elements.TypeText(ForgotPasswordPage.emailField, email);
	Elements.click(ForgotPasswordPage.continueButton);
}
@Then("I shoudl see a message inofrming the user that inofrmation related to resetting password have been sent to email address$")
public void i_should_see_a_mesage_informing_the_User_that_information_realted_to_resetting_password_have_been_sent_to_email_address() {
	
	Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "An email with a confirmantion link has been sent your email address."));
}
}
