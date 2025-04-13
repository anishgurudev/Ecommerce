package stepDefinations;

import base.BaseClass;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.CSVReaderUtil;
import utils.CSVWriterUtil;

import java.util.List;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User is on Login Page")
    public void user_on_login_page() {
        BaseClass.driver.get("https://flipkart.com");
//        Hooks.getScenarioTest().info("User is on login page");

    }

    @When("User enters username {string} and password {string}")
    public void user_enters_credentials(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
    }

    @And("Clicks on login")
    public void clicks_on_login() {
        loginPage.clickLogin();
    }

    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        // Add assertion or print statement
    }

    @Given("User enters login credentials from csv")
    public void user_enters_login_credentials_from_csv() {
        List<String[]> data = CSVReaderUtil.readCSV("src/test/resources/testdata/LoginData.csv");

        for (int i = 1; i < data.size(); i++) { // start from 1 to skip header
            String username = data.get(i)[0];
            String password = data.get(i)[1];

            System.out.println("Login Attempt => Username: " + username + ", Password: " + password);
            // call loginPage.login(username, password);
        }
    }

    @Then("Store the login result in csv")
    public void store_the_login_result_in_csv() {
        String[] resultRow = {"testuser1", "pass123", "Success"};
        CSVWriterUtil.writeToCSV("src/test/resources/results/LoginResults.csv", resultRow);
    }

    @Given("User logs in with {string} and {string}")
    public void user_logs_in_with(String username, String password) {
        System.out.println("Trying login with: " + username + " / " + password);
        // loginPage.login(username, password);
    }

    @Then("Login should be successful or failed based on input")
    public void loginShouldBeSuccessfulOrFailedBasedOnInput() {
    }
}
