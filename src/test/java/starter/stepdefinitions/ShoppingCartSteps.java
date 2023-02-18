package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.ShoppingCartPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartSteps {

    @Steps
    ShoppingCartPage shoppingCartPage;

    @Step("Verify that the cart is empty")
    public void verifyCartIsEmpty() {
        shoppingCartPage.open();
        shoppingCartPage.clickCartBadge();
        assertTrue(shoppingCartPage.getCartItems().isEmpty());
    }
}
