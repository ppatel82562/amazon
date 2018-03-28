package CucumberPractise;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends BasePage{
    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
    }

//    @When("^I enter valid username and password$")
//    public void i_enter_valid_username_and_password() {
//    }
//
//    @Then("^I should able to log in successfully$")
//    public void i_should_able_to_log_in_successfully() {
//    }


    @When("^I enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInvalidAnd(String username, String password)  {
        homePage.enterlogincredential(username,password);
    }

    @Then("^I should not to log in successfully with valid \"([^\"]*)\"$")
    public void iShouldNotToLogInSuccessfullyWithValid(String errormassage) {
        Assert.assertEquals(driver.findElement(By.id("spanMessage")).getText(),errormassage);
        System.out.println("Hello Case Successfull");
    }
    }
