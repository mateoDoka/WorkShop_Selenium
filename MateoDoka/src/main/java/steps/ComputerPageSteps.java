package steps;

import driver.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.ComputersPage;

public class ComputerPageSteps {

    ComputersPage computersPage = new ComputersPage();
    WebDriver driver = BasePage.getInstance().driver;

    Actions actions = new Actions(driver);

    public void computerTab() {

        actions.moveToElement(computersPage.computerTab);
        actions.moveToElement(computersPage.notebooks);
        actions.click().build().perform();
    }

    public void wishList(int i) {
        computersPage.wishlistbtn.get(i).click();

    }

    public void displayedText() {
        assert computersPage.addedText.isDisplayed() : "The text is not displayed";
    }

    public void addToCart(int i) {
        computersPage.cartBtn.get(i).click();
    }

    public void wishListNr() {
       Assert.assertEquals("(2)",computersPage.wishListNr.getText());
    }
    public void cartNr() {
        Assert.assertEquals("(3)", computersPage.cartNr.getText());
    }
}

