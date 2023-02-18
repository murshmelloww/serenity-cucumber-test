package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.InventoryPage;
import starter.pages.ProductDetailsPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventorySteps {

    @Steps
    InventoryPage inventoryPage;

    @Steps
    ProductDetailsPage productDetailsPage;

    @Step
    public void sortProductsByNameDescending(String options) {
        inventoryPage.clickSortButton();
        inventoryPage.selectSortOption(options);
    }

    @Step
    public void clickProductInLowerLeftCorner() {
        inventoryPage.clickProductInLowerLeftCorner();
    }

    public void verifyProductsSortedDescending() {
        List<String> productTitles = inventoryPage.getProductTitles();
        List<String> expectedProductTitles = new ArrayList<>(productTitles);
        expectedProductTitles.sort(Collections.reverseOrder());
        assertEquals(productTitles, equalTo(expectedProductTitles));
    }

    public void clickCartBadge() {
        inventoryPage.clickCartBadge();
    }

    public void verifyAddToCartButtonReplaced(String oldText, String newText) {
    }

    public void addProductToCart() {
        productDetailsPage.clickAddToCartButton();
    }
}