package steps;

import cucumber.api.java.eo.Do;
import driver.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.CartPage;

public class CartPageSteps {
    WebDriver driver= BasePage.getInstance().driver;
    CartPage cartPage = new CartPage();
    Actions actions= new Actions(driver);
    public CartPageSteps(){
        PageFactory.initElements(driver,this);
    }

    public void cartHover(){
        actions.moveToElement(cartPage.shoppingCartBtn);
        actions.build().perform();
      goToCart();

    }
      public void goToCart(){
        if(cartPage.goToCartBtn.isDisplayed()){
            System.out.println("Go to cart is displayed");
            actions.moveToElement(cartPage.goToCartBtn);
            actions.click().build().perform();
        }
        else {
            System.out.println("Go to cart button is not displayed");
        }
    }

    public void cartText(){
        assert cartPage.cartText.isDisplayed() : "The shopping Cart is  not showed";
    }
    public void cartBtnDisplay(){
      assert   cartPage.updateCartBtn.isDisplayed()&& cartPage.estimateCartBtn.isDisplayed()&&cartPage.continueCartBtn.isDisplayed() :"The Update Cart ,Estimate Cart,Continue button are not showed";

    }
    public void subTotal(){
          double Total = 0;
        for(int i=0; i<cartPage.subTotalList.size();i++){
           String subTotal= cartPage.subTotalList.get(i).getText().replaceAll("[^0-9.]", "");
           double total = Double.parseDouble(subTotal);
           Total +=total;
        }
        String t= cartPage.CartTotal.getText().replaceAll("[^0-9.]", "");
        double cartTotal= Double.parseDouble(t);
        Assert.assertEquals(Total,cartTotal);
    }
}
