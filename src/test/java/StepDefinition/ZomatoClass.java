package StepDefinition;

import SeleniumWebPages.HomePage;
import SeleniumWebPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ZomatoClass {
    WebDriver driver;
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("user opens the browser")
    public void browserOpen(){

    homePage.user_opens_the_browser();

    }

    @When("user navigates to zomato webpage")
    public void userNavigation(){

        loginPage.user_navigates_to_zomato_webpage();

    }

    @Then("user verifies the web elements {string}")
    public void userVerification(String webEle){

        loginPage.user_verifies_the_web_elements_actual(webEle);
    }

}
