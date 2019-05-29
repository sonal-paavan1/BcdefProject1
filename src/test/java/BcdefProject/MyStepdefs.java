package BcdefProject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.Math.E;

public class MyStepdefs
{
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    Registersuccessful registersuccessful = new Registersuccessful();


    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        homePage.clickOnRegisterButton();
    }

    @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homePage.clickOnRegisterButton();

    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails() {
    }

    @When("^user clicks on \"([^\"]*)\" link from the menu$")
    public void userClicksOnLinkFromTheMenu(String link)  {
        homePage.navigatePage(link);


    }

    @Then("^user should able to navigete to \"([^\"]*)\"successfully$")
    public void userShouldAbleToNavigeteToSuccessfully(String link) {
        Utils.assertCurrentURL(link);
    }


    @Given("^user is on Home page$")
    public void userIsOnHomePage() {
        homePage.clickOnRegisterButton();

    }

    @When("^user navigate to login Page$")
    public void userNavigateToLoginPage() {

    }

    @And("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEnterInvalidAnd(String Email, String Password)  {
        loginPage.userFilleUserNamePaswordAndClickLoginButton(Email,Password);

    }

    @Then("^user should not be logged in Successfully$")
    public void userShouldNotBeLoggedInSuccessfully() {

    }

    @And("^user see \"([^\"]*)\"$")
    public void user_See(boolean errorMessage)  {
        Utils.asserTrue(errorMessage);

            }


    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully() {
        registersuccessful.verifyUserSeeSuccessfulMessage();

    }
}
