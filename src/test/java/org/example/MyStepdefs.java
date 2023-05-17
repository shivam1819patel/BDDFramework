

package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage= new RegistrationPage();

    RegistrationResult registrationResult= new RegistrationResult();
    ProductHomePage productHomePage= new ProductHomePage();
    EmailAFriendHomePage emailAFriendHomePage= new EmailAFriendHomePage();

    LogInPage logInPage= new LogInPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registrationPage.filldetailsforregistration();

    }


    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {

        registrationResult.verifyUserregistersucesfully();
        throw new io.cucumber.java.PendingException();


    }
    @Given("I Log in into my account")
    public void i_log_in_into_my_account() {
        homePage.clickOnLoginButton();
        logInPage.fillInLoginDetails();


    }
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        homePage.verifyHomePage();


    }
    @When("I click on Build your own computer")
    public void i_click_on_build_your_own_computer() {
        homePage.clickOnBuildYourOwnComputer();

    }
    @When("I click on Email a friend button")
    public void i_click_on_email_a_friend_button() {
        productHomePage.clickEmailFriendbutton();


    }
    @Then("I enter required Email a friend details")
    public void i_enter_required_email_a_friend_details() {
        emailAFriendHomePage.verifyUsershouldSendMailToFriend();

    }
    @Then("I click on send email button")
    public void i_click_on_send_email_button() {
        emailAFriendHomePage.verifyUsershouldSendMailToFriend();

    }
    @Then("{string} should be seen successfully.")
    public void should_be_seen_successfully(String string) {
        emailAFriendHomePage.verifyUsershouldSendMailToFriend();

    }

}




