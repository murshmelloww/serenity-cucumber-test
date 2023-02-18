package starter.stepdefinitions;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Step("Open the login page")
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void loginAsStandardUser(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
}



