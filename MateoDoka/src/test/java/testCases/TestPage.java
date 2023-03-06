package testCases;

import driver.BasePage;
import gherkin.lexer.Gl;
import global.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;
import steps.HomePageSteps;
import steps.LoginSteps;
import steps.RegisterPageSteps;



public class TestPage {
    WebDriver driver= BasePage.getInstance().driver;
    LoginSteps loginSteps= new LoginSteps();
    HomePageSteps homePageSteps= new HomePageSteps();
    RegisterPageSteps registerPageSteps= new RegisterPageSteps();
     public final static   String email=  "Test"+ Math.random()+ "@gmail.com";
    public  TestPage(){
        PageFactory.initElements(driver,this);
    }

    @BeforeTest
    public void init(){
        driver.get(GlobalVariables.baseUrl);
    }
    @Test
    public void test() throws InterruptedException {
        homePageSteps.ClickLogIn();
      loginSteps.registerBTn();
     registerPageSteps.genderRadioBTn();
     registerPageSteps.userName(GlobalVariables.username);
     registerPageSteps.lastName(GlobalVariables.lastname);
     registerPageSteps.selector();
     registerPageSteps.emailRegister(email);
     registerPageSteps.companyName(GlobalVariables.companyname);
     registerPageSteps.passwordRegister(GlobalVariables.password);
     registerPageSteps.confirmPassword(GlobalVariables.password);
        Thread.sleep(2000);
        Thread.sleep(2000);
     registerPageSteps.registerBtn();
     registerPageSteps.registerText();

     Thread.sleep(2000);
    }
   @AfterTest
   public void terminate(){
        driver.quit();
  }


}
