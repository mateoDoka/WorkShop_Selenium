package testCases;

import driver.BasePage;
import gherkin.lexer.Ca;
import global.GlobalVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CartPageSteps;

public class TestPage4 {
    WebDriver driver= BasePage.getInstance().driver;

    CartPageSteps cartPageSteps= new CartPageSteps();
    TestPage3 testPage3 = new TestPage3();

    public TestPage4(){
        PageFactory.initElements(driver,this);
    }
@BeforeTest
public void beforetest() throws InterruptedException {

    driver.get(GlobalVariables.baseUrl);
    testPage3.test();
}
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.tagName("body")).sendKeys(Keys.HOME);
        Thread.sleep(4000);
        cartPageSteps.cartHover();
        cartPageSteps.cartText();
        cartPageSteps.cartBtnDisplay();
        cartPageSteps.subTotal();

    }
}
