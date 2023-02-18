package starter.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends PageObject {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    private WebElement addToCartButton() {
        return find(By.className("btn_inventory"));
    }

    public void clickAddToCartButton() {
        addToCartButton().click();
    }
}

