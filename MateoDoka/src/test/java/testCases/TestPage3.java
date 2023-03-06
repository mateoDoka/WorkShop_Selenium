package testCases;

import driver.BasePage;
import global.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.ComputerPageSteps;
import steps.HomePageSteps;
import steps.LoginSteps;

public class TestPage3 {
    WebDriver driver= BasePage.getInstance().driver;

    ComputerPageSteps computerPageSteps= new ComputerPageSteps();

    public  TestPage3(){
        PageFactory.initElements(driver,this);
    }
    @BeforeTest
    public void  init() throws InterruptedException {
        driver.get(GlobalVariables.baseUrl);

    }
    @Test
    public void  test() throws InterruptedException {
        computerPageSteps.computerTab();
        computerPageSteps.wishList(1);
       Thread.sleep(1000);
        computerPageSteps.wishList(2);
        computerPageSteps.displayedText();
        Thread.sleep(1000);
        computerPageSteps.addToCart(3);
        Thread.sleep(1000);
        computerPageSteps.addToCart(4);
        Thread.sleep(1000);
        computerPageSteps.addToCart(5);
        computerPageSteps.displayedText();
        computerPageSteps.wishListNr();
        Thread.sleep(2000);
        computerPageSteps.cartNr();
    }

}
