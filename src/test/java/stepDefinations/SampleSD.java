package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {
    WebDriver driver;
    @Given("Login page should be opened")
    public void login_page_should_be_opened() {
        System.out.println("Login page should opened");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @When("I enter username and credentials")
    public void i_enter_username_and_credentials() {
        System.out.println("I enter usernaem & credenttials ");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");
    }
    @Then("I should redirected to home page")
    public void i_should_redirected_to_home_page() {
        System.out.println(" I should redirected to home page");
    }

}
