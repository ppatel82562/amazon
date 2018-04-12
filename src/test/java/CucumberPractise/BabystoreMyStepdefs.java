package CucumberPractise;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BabystoreMyStepdefs extends Utils{

    HomePage homePage = new HomePage();
    BabyStore babyStore = new BabyStore();



    @Given("^user on home page$")
    public void user_on_home_page() {                       //open home page

    }

    @When("^go to shop by department then go to Toys Childern and Baby$")       //Navigate to Shop by Department and hold
    public void go_to_shop_by_department_then_go_to_Toys_Childern_and_Baby() {

        babyStore.navigateToBabyStore();
    }

    @And("^click on baby$")
    public void click_on_baby() {

     }

    @Then("^user successfully navigate to baby store$")
    public void user_successfully_navigate_to_baby_store() {

       Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[1]/div/div/div[1]/div[1]/div/h1")).getText(),"Baby Store");
        System.out.println("User able to navigate to Baby Store");

    }

}
