package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.DataKey;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;
import static actions.Actions.sendKey;
import static org.junit.Assert.assertEquals;
import static util.ScenarioContext.getData;
import static util.ScenarioContext.saveData;
import static util.WaitUntil.waitUntilTime;

public class LoginStepsForSingleton extends AbstractStep {

    @Given("User navigates to the website1 homepage")
    public void user_navigates_to_the_website1_homepage() throws InterruptedException {
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankLogin.getErrorMessage());
        Thread.sleep(2000);
    }

    @When("User clicks on 'Login' button1")
    public void user_clicks_on_login_button1() throws InterruptedException {
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankLogin.getErrorMessage());
        Thread.sleep(2000);
    }

    @And("User clicks on 'Register' button1")
    public void user_clicks_on_register_button1() throws InterruptedException {
        click(parabankHomePage.getRegisterButton());
        isDisplayed(register.getSinginUpMessage());


    }

    @And("User fills in some mandatory fields")
    public void user_fills_in_some_mandatory_fields() throws InterruptedException {
        sendKey(register.getFirstNameField(), "irina");
        Thread.sleep(2000);
        sendKey(register.getUserNameField(), "irina");
        Thread.sleep(2000);
        sendKey(register.getPasswordField(), "irina");
        Thread.sleep(2000);
        sendKey(register.getConfirmField(), "irina");
        Thread.sleep(2000);

    }

    @And("User clicks on 'Register' button2")
    public void user_clicks_on_register_button2() throws InterruptedException {
        click(register.getRegisterNewAccount());
        Thread.sleep(1000);
    }

    @And("User checks error messages")
    public void user_checks_error_messages() throws InterruptedException {

        assertEquals(register.getLastNameIsRequired().getText(), "Last name is required.");
        Thread.sleep(1000);
        assertEquals(register.getAddressIsRequired().getText(), "Address is required.");
        Thread.sleep(1000);
        assertEquals(register.getCityIsRequired().getText(), "City is required.");
        Thread.sleep(1000);
        assertEquals(register.getStateIsRequired().getText(), "State is required.");
        Thread.sleep(1000);

    }

    @Given("User navigates to register page")
    public void user_navigates_to_register_page() throws InterruptedException{
        click(parabankHomePage.getRegisterButton());
        Thread.sleep(1000);

    }

    @When("User adds {}")
    public void user_adds_username(String username) throws InterruptedException {
        saveData(DataKey.USERNAME, username);
        sendKey(register.getUserNameField(), getData(DataKey.USERNAME).toString());
        Thread.sleep(1000);
        }

    @When("User inserts {}")
    public void user_inserts_password(int password) throws  InterruptedException{
        saveData(DataKey.PASSWORD, password);
        sendKey(register.getPasswordField(), getData(DataKey.PASSWORD).toString());
        Thread.sleep(1000);

    }

}
