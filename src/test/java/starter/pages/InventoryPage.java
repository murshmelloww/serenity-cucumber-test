package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ui.Select;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    @FindBy(className = "inventory_list")
    private WebElement inventoryList;

    @FindBy(className = "product_sort_container")
    private WebElementFacade sortDropdown;
    @FindBy(css = ".btn_primary.btn_inventory")
    private WebElement addToCartButtons;
    @FindBy(css = ".shopping_cart_badge")
    private WebElement cartBadge;
    @FindBy(css = ".inventory_item_name")
    private List<WebElement> productTitles;

    @FindBy(css = ".cart_item")
    private List<WebElement> cartItems;

    @FindBy(css = ".btn_secondary.btn_inventory")
    private List<WebElementFacade> removeFromCartButtons;


    private List<WebElement> productCards() {
        return find(By.className("inventory_item"));
    }

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnPage() {
        return inventoryList.isDisplayed();
    }


    private List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        List<WebElement> productNameElements = inventoryList.findElements(By.className("inventory_item_name"));
        for (WebElement element : productNameElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }

    public void clickSortButton() {
        element(sortDropdown).click();
    }

    public void clickProductInLowerLeftCorner() {
        WebElement product = getDriver().findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_name"));
        product.click();
    }

    public void selectSortOption(String option) {
        sortDropdown.selectByVisibleText(option);
    }


    public List<String> getProductTitles() {
        return new ArrayList<>();
    }

    public void clickCartBadge() {
    }

    public Collection<Object> getCartItems() {
        return new ArrayList<>();
    }

    public void clickRemoveFromCartButton() {
    }
}
