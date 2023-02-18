package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

public class ShoppingCartPage extends PageObject {

    @FindBy(css = ".cart_item")
    private List<WebElementFacade> cartItems;

    @FindBy(css = ".btn_secondary.cart_button")
    private List<WebElementFacade> removeButtons;

    @FindBy(css = ".btn_action.checkout_button")
    private WebElementFacade checkoutButton;

    @FindBy(css = ".cart_list")
    private WebElementFacade cartList;

    @FindBy(css = ".subheader")
    private WebElementFacade subHeader;

    public List<WebElementFacade> getCartItems() {
        return cartItems;
    }

    public void clickCartBadge() {
    }
}
