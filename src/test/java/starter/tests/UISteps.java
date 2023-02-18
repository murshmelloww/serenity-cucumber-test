package starter.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.stepdefinitions.InventorySteps;
import starter.stepdefinitions.LoginSteps;
import starter.stepdefinitions.ShoppingCartSteps;

public class UISteps {
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private InventorySteps inventorySteps;

    @Steps
    private ShoppingCartSteps shoppingCartSteps;

    @Given("the user is on the SAUCEDEMO login page")
    public void the_user_is_on_the_saucedemo_login_page() {
        loginSteps.openLoginPage();
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        loginSteps.loginAsStandardUser(username, password);
    }

    @When("the user sorts the products by name in {string} order")
    public void the_user_sorts_the_products_by_name_in_descending_order(String options) {
        inventorySteps.sortProductsByNameDescending(options);
    }

    @Then("the products should be displayed in descending order")
    public void the_products_should_be_displayed_in_descending_order() {
        inventorySteps.verifyProductsSortedDescending();
    }

    @When("the user clicks on the name of the product in the lower left corner")
    public void the_user_clicks_on_the_name_of_the_product_in_the_lower_left_corner() {
        inventorySteps.clickProductInLowerLeftCorner();
    }

    @When("the user checks the cart")
    public void the_user_checks_the_cart() {
        inventorySteps.clickCartBadge();
    }

    @Then("the cart should be empty")
    public void the_cart_should_be_empty() {
        shoppingCartSteps.verifyCartIsEmpty();
    }

    @When("the user adds a product to the cart")
    public void the_user_adds_a_product_to_the_cart() {
        inventorySteps.addProductToCart();
    }

    @Then("the text {string} should be replaced with {string}")
    public void the_text_should_be_replaced_with(String oldText, String newText) {
        inventorySteps.verifyAddToCartButtonReplaced(oldText, newText);
    }
}
