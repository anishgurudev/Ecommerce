package pages;

import base.BaseClass;
import locators.LoginPageLocators;

public class LoginPage {

    public void enterUsername(String username) {
        BaseClass.driver.findElement(LoginPageLocators.usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        BaseClass.driver.findElement(LoginPageLocators.passwordField).sendKeys(password);
    }

    public void clickLogin() {
        BaseClass.driver.findElement(LoginPageLocators.loginButton).click();
    }
}
