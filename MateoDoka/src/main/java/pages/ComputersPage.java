package pages;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComputersPage {
    WebDriver driver= BasePage.getInstance().driver;
    public ComputersPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="a[href='/computers']")
    public WebElement computerTab;

    @FindBy(css="a[href='/notebooks']")
    public WebElement notebooks;

    @FindBy(css="button[class='button-2 add-to-wishlist-button']")
    public List<WebElement> wishlistbtn;

    @FindBy(css="div[class='bar-notification success']")
    public  WebElement addedText;

    @FindBy(css="button[class='button-2 product-box-add-to-cart-button']")
    public List<WebElement> cartBtn;

    @FindBy(css="span[class='wishlist-qty']")
    public WebElement wishListNr;

    @FindBy(css ="span[class='cart-qty']")
    public  WebElement cartNr;


}
