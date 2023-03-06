package pages;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    WebDriver driver= BasePage.getInstance().driver;

    public CartPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="span[class='cart-label']")
    public WebElement shoppingCartBtn;

    @FindBy(css="button[class='button-1 cart-button']")
     public  WebElement goToCartBtn;

    @FindBy(css="div[class='page-title']")
    public WebElement cartText;

    @FindBy(css="button[class='button-2 update-cart-button']")
    public WebElement updateCartBtn;

    @FindBy(css="button[class='button-2 continue-shopping-button']")
    public WebElement continueCartBtn;
    @FindBy(css="a[href='#estimate-shipping-popup']")
    public WebElement estimateCartBtn;

    @FindBy(css="span[class='product-subtotal']")
    public List<WebElement>subTotalList;

    @FindBy(css="span[class='value-summary']")
    public WebElement CartTotal;

}
